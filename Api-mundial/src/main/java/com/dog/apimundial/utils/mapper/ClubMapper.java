package com.dog.apimundial.utils.mapper;

import com.dog.apimundial.dto.ClubDTO;
import com.dog.apimundial.entities.Club;

public class ClubMapper {

    public static Club toEntity(ClubDTO clubDTO) {
        if (clubDTO == null) return null;
        return Club.builder()
                .id(clubDTO.getId())
                .name(clubDTO.getName())
                .country(clubDTO.getCountry())
                .coach(clubDTO.getCoach())
                .titles(clubDTO.getTitles())
                .build();
    }

    public static ClubDTO toDTO(Club club) {
        if (club == null) return null;
        return ClubDTO.builder()
                .id(club.getId())
                .name(club.getName())
                .country(club.getCountry())
                .coach(club.getCoach())
                .titles(club.getTitles())
                .build();
    }

}