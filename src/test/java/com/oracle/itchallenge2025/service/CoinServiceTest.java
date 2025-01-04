package com.oracle.itchallenge2025.service;

import com.oracle.itchallenge2025.Main;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = Main.class)
public class CoinServiceTest {

    @Autowired
    private CoinService coinService;

    @Test
    public void testCalculateMinimumCoins() {
        List<Double> coinDenominations = Arrays.asList(0.01, 0.05, 0.1, 0.2, 0.5, 1.0);
        double targetAmount = 1.85;
        List<String> expected = Arrays.asList("0.05", "0.1", "0.2", "0.5", "1");

        List<String> result = coinService.calculateMinimumCoins(targetAmount, coinDenominations);

        assertEquals(expected, result);
    }
}
