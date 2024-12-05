package com.swapi.soapShopSpringBoot3.config;

import com.swapi.soapShopSpringBoot3.dto.SoapDto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Configuration
public class AppConfig {

    @Bean
    public Map<String, SoapDto> soapRepository() {
        return Stream.of(
                SoapDto.of("Key1", "Name1"),
                SoapDto.of("Key2", "Name2"),
                SoapDto.of("Key3", "Name3"),
                SoapDto.of("Key4", "Name4")
        ).collect(Collectors.toMap(SoapDto::getKey, soapDto -> soapDto));
    }
}
