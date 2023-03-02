package com.berrybrewery.web.service;

import com.berrybrewery.web.model.BeerDTO;

import java.util.UUID;

public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDTO getBeerById(UUID beerId) {
        return BeerDTO.builder().id(UUID.randomUUID()).beerName("Galaxy Cat").beerStyle("Pale Ale").build();
    }
}
