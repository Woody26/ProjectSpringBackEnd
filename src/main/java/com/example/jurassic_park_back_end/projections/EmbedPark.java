package com.example.jurassic_park_back_end.projections;

import com.example.jurassic_park_back_end.models.Dinosaur;
import com.example.jurassic_park_back_end.models.Paddock;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedPark", types = Dinosaur.class)
public interface EmbedPark {
    Long getId();
    String getName();
    List<Paddock> getPaddocks();
    Boolean getLockedDown();
}
