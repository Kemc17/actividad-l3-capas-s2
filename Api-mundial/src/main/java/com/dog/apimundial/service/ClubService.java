package com.dog.apimundial.service;

import com.dog.apimundial.dto.ClubDTO;
import com.dog.apimundial.entities.Club;

import java.util.List;

public interface ClubService {

    ClubDTO getClubById(Long id);
    ClubDTO saveClub(ClubDTO clubDTO);
    void deleteClub(Long id);
}

