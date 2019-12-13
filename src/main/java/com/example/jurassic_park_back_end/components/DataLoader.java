package com.example.jurassic_park_back_end.components;

import com.example.jurassic_park_back_end.models.Dinosaur;
import com.example.jurassic_park_back_end.models.Paddock;
import com.example.jurassic_park_back_end.models.Park;
import com.example.jurassic_park_back_end.repositories.dinosaurs.DinosaurRepository;
import com.example.jurassic_park_back_end.repositories.paddocks.PaddockRepository;
import com.example.jurassic_park_back_end.repositories.parks.ParkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    DinosaurRepository dinosaurRepository;

    @Autowired
    PaddockRepository paddockRepository;

    @Autowired
    ParkRepository parkRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {

        Park park = new Park("Isla Nublar");
        parkRepository.save(park);

        Paddock paddock = new Paddock("Carnivore");
        paddockRepository.save(paddock);
        parkRepository.save(park);

        park.addPaddock(paddock);
        parkRepository.save(park);

        Dinosaur dinosaur = new Dinosaur("Carnivore", "Velociraptor", paddock);
        dinosaurRepository.save(dinosaur);

        paddock.addDinosaur(dinosaur);
        paddockRepository.save(paddock);


    }

}
