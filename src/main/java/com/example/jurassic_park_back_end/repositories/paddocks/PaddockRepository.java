package com.example.jurassic_park_back_end.repositories.paddocks;

import com.example.jurassic_park_back_end.models.Paddock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PaddockRepository extends JpaRepository<Paddock, Long>, PaddockRepositoryCustom {
}
