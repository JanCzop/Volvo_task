package com.example.volvotask;

import com.example.volvotask.Exceptions.Exc_not_found;
import feign.FeignException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class Country_service {

    private final Country_feign_client feign_client;
    private final Country_repository repository;

    public Country_service(Country_feign_client feign_client, Country_repository repository){
        this.feign_client = feign_client;
        this.repository = repository;
    }
    public Country_DTO get_country(String code) {
        try {
            List<Country_data> countries = feign_client.get_country_by_code(code);
            if (countries == null || countries.isEmpty()) throw new Exc_not_found(code);
            Country_data country_data = countries.get(0);
            Country_DTO country_dto = new Country_DTO();

            country_dto.setCode(country_data.getCode());
            country_dto.setCommon_name(country_data.getName().getCommon_name());
            country_dto.setOfficial_name(country_data.getName().getOfficial_name());
            country_dto.setCurrencies(country_data.getCurrencies()
                    .values().stream()
                    .map(Country_data.Currency::getName)
                    .collect(Collectors.toList()));
            country_dto.setCapital(country_data.getCapital());
            country_dto.setRegion(country_data.getRegion());
            country_dto.setSubregion(country_data.getSubregion());
            country_dto.setLanguages(country_data.getLanguages()
                    .values().stream().toList());
            country_dto.setPopulation(country_data.getPopulation());
            country_dto.setBorders(country_data.getBorders());
            country_dto.setTimezones(country_data.getTimezones());

            return repository.save(country_dto);

        } catch (FeignException.NotFound ex) {
            throw new Exc_not_found(code);
        }
    }
}
