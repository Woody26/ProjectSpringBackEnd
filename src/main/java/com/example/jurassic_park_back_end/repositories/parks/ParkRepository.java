package com.example.jurassic_park_back_end.repositories.parks;

import com.example.jurassic_park_back_end.models.Park;
import com.example.jurassic_park_back_end.projections.EmbedPark;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedPark.class)
public interface ParkRepository extends JpaRepository<Park, Long>{
}
