package com.example.volvotask;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/countries")
public class Country_controller {
    private static final String ISO_3166_ALPHA_3_REGEX = "^[A-Z]{3}$";
    private final Country_service service;

    public Country_controller(Country_service service){
        this.service = service;
    }

    @GetMapping("/{code}")
    public ResponseEntity<?> get_country(@PathVariable String code) {
        if (!code.matches(ISO_3166_ALPHA_3_REGEX)) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("Invalid ISO 3166-1 alpha-3 code format: " + code);
        }
        return ResponseEntity.ok(service.get_country(code));
    }
}
