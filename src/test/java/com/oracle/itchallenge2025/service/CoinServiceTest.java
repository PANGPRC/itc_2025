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
        List<Double> coinDenominations = Arrays.asList(1.0, 0.5, 0.25, 0.1, 0.05);
        double targetAmount = 1.85;
        List<Double> expected = Arrays.asList(1.0, 0.5, 0.25, 0.1);

        List<Double> result = coinService.calculateMinimumCoins(targetAmount, coinDenominations);

        assertEquals(expected, result);
    }
}
