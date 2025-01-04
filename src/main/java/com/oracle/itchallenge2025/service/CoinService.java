package com.oracle.itchallenge2025.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class CoinService {

    public List<String> calculateMinimumCoins(double targetAmount, List<Double> coinDenominations) {
        List<Double> result = new ArrayList<>();
        Collections.sort(coinDenominations, Collections.reverseOrder());

        for (double coin : coinDenominations) {
            while (targetAmount >= coin) {
                targetAmount -= coin;
                result.add(coin);
            }
        }

        Collections.sort(result);

        List<String> formattedResult = new ArrayList<>();
        for (double coin : result) {
            if (coin == (long) coin) {
                formattedResult.add(String.format("%d", (long) coin));
            } else if (coin * 10 == (long) (coin * 10)) {
                formattedResult.add(String.format("%.1f", coin));
            } else {
                formattedResult.add(String.format("%.2f", coin));
            }
        }

        return formattedResult;
    }
}
