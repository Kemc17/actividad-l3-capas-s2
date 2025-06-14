package com.dog.apimundial.service.Impl;

import com.dog.apimundial.dto.ClubDTO;
import com.dog.apimundial.entities.Club;
import com.dog.apimundial.repository.ClubRepository;
import com.dog.apimundial.service.ClubService;
import com.dog.apimundial.utils.mapper.ClubMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClubServiceImpl implements ClubService {

    private final ClubRepository clubRepository;

    @Autowired
    public ClubServiceImpl(ClubRepository clubRepository) {
        this.clubRepository = clubRepository;
    }

    @Override
    @Transactional
    public ClubDTO getClubById(Long id) {
        return ClubMapper.toDTO(clubRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Product not found with id: " + id)));
    }

    @Override
    @Transactional
    public ClubDTO saveClub(ClubDTO clubDTO) {
        Club club = ClubMapper.toEntity(clubDTO);
        Club savedClub = clubRepository.save(club);
        return ClubMapper.toDTO(savedClub);
    }


    @Override
    @Transactional
    public void deleteClub(Long id) {
        Club club = clubRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Club not found with id: " + id));
        clubRepository.delete(club);
    }
}
