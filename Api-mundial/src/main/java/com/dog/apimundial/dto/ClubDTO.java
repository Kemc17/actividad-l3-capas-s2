package com.dog.apimundial.dto;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
@Entity
public class ClubDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String country;
    private int titles;
}
