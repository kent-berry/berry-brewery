package com.berrybrewery.web.mappers;

import com.berrybrewery.domain.Beer;
import com.berrybrewery.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {
    BeerDto beerToBeerDTO(Beer beer);
    Beer beerDtoToBeer(BeerDto beerDto);
}
