package com.example.jurassic_park_back_end.projections;

import com.example.jurassic_park_back_end.models.Dinosaur;
import com.example.jurassic_park_back_end.models.Paddock;
import com.example.jurassic_park_back_end.models.Park;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedPaddock", types = Paddock.class)
public interface EmbedPaddock {
    Long getId();
    String getType();
    String getName();
    List<Dinosaur> getDinosaurs();
    Park getPark();
}
