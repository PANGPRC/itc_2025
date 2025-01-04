package com.oracle.itchallenge2025.controller;

import com.oracle.itchallenge2025.service.CoinService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/coins")
public class CoinController {

    private final CoinService coinService;

    public CoinController(CoinService coinService) {
        this.coinService = coinService;
    }

    @PostMapping("/calculate")
    public List<Double> calculateMinimumCoins(@RequestParam double targetAmount, @RequestParam List<Double> coinDenominations) {
        return coinService.calculateMinimumCoins(targetAmount, coinDenominations);
    }
}
