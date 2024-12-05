package com.swapi.soapShopSpringBoot3.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@AllArgsConstructor
@NoArgsConstructor
//@Getter
//@Setter
@Schema(description = "Mыло")
public class SoapDto {

    @Schema(description = "Идентификатор", accessMode = Schema.AccessMode.READ_ONLY)
    private String key;

    @Schema(description = "Наименование", example = "Dove")
    private String name;

    public static SoapDto of(String key, String name) {
        return new SoapDto(key, name);
    }

    public SoapDto(String key, String name) {
        this.key = key;
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
