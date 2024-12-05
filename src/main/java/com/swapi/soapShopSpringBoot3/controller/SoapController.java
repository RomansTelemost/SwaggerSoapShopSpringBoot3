package com.swapi.soapShopSpringBoot3.controller;

import com.swapi.soapShopSpringBoot3.dto.SoapDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("api/soapShop")
public class SoapController {

    private final Map<String, SoapDto> repository;

    public SoapController(Map<String, SoapDto> repository) {
        this.repository = repository;
    }

    @GetMapping("/hello")
    public ResponseEntity<List<SoapDto>> getGreetings() {
        return ResponseEntity.of(Optional.of(repository.values().stream().toList()));
    }

}
