package com.example.jurassic_park_back_end.projections;

import com.example.jurassic_park_back_end.models.Dinosaur;
import com.example.jurassic_park_back_end.models.Paddock;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedDinosaur", types = Dinosaur.class)
public interface EmbedDinosaur {
    Long getId();
    String getType();
    Boolean getFed();
    String getName();
    Paddock getPaddock();
}
