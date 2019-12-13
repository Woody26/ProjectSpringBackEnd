package com.example.jurassic_park_back_end.repositories.parks;

import com.example.jurassic_park_back_end.models.Park;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ParkRepository extends JpaRepository<Park, Long>, ParkRepositoryCustom {
}
