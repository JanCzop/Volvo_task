package com.example.volvotask;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "country-client", url = "https://restcountries.com/v3.1/alpha/")
public interface Country_feign_client {
    @GetMapping("/{code}")
    List<Country_data> get_country_by_code(@PathVariable("code") String code);
}
