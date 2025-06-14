package com.dog.apimundial.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ClubDTO {
    private Long id;
    private String name;
    private String country;
    private String coach;
    private int titles;
}
