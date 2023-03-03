package com.berrybrewery.service.v2;

import com.berrybrewery.web.model.BeerDto;
import com.berrybrewery.web.model.v2.BeerDtoV2;

import java.util.UUID;

public interface BeerServiceV2 {
    BeerDtoV2 getBeerById(UUID beerId);

    BeerDtoV2 saveNewBeer(BeerDto beerDtoV2);

    void updateBeer(UUID beerId, BeerDtoV2 beerDtoV2);

    void deleteById(UUID beerId);
}
