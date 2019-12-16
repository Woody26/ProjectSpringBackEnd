package com.example.jurassic_park_back_end.repositories.dinosaurs;

import com.example.jurassic_park_back_end.models.Dinosaur;
import com.example.jurassic_park_back_end.projections.EmbedDinosaur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedDinosaur.class)
public interface DinosaurRepository extends JpaRepository<Dinosaur, Long>{
}
