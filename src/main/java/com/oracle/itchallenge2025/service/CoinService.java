package com.oracle.itchallenge2025.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class CoinService {

    public List<Double> calculateMinimumCoins(double targetAmount, List<Double> coinDenominations) {
        List<Double> result = new ArrayList<>();
        Collections.sort(coinDenominations, Collections.reverseOrder());

        for (double coin : coinDenominations) {
            while (targetAmount >= coin) {
                targetAmount -= coin;
                result.add(coin);
            }
        }

        Collections.sort(result);
        return result;
    }
}
