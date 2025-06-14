package com.dog.apimundial.service.Impl;

import com.dog.apimundial.dto.ClubDTO;
import com.dog.apimundial.repository.ClubRepository;
import com.dog.apimundial.service.ClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClubServiceImpl implements ClubService {

    private final ClubRepository clubRepository;

    @Autowired
    public ClubServiceImpl(ClubRepository clubRepository) {
        this.clubRepository = clubRepository;
    }


    @Override
    public ClubDTO getClubById(Long id) {
        return null;
    }

    @Override
    public ClubDTO saveClub(ClubDTO clubDTO) {
        return null;
    }

    @Override
    public void deleteClub(Long id) {

    }
}
