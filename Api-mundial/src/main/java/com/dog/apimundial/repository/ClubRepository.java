package com.dog.apimundial.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.dog.apimundial.entities.Club;

@Repository
public interface ClubRepository extends JpaRepository<Club,Long> {

    List<Club> findByTitles(int titles);
    
} 
