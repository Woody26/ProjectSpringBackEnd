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

        Paddock paddock1 = new Paddock("Carnivore", park, "Holding Pen");
        paddockRepository.save(paddock1);

        Paddock paddock2 = new Paddock("Herbivore", park, "Herb 1");
        paddockRepository.save(paddock2);

        Paddock paddock3 = new Paddock("Carnivore", park, "Carni 1");
        paddockRepository.save(paddock3);

        Dinosaur velociraptor = new Dinosaur("Carnivore", "Velociraptor", paddock1);
        dinosaurRepository.save(velociraptor);
        paddock1.addDinosaur(velociraptor);
        paddockRepository.save(paddock1);

        Dinosaur parasaurolophus = new Dinosaur("Herbivore", "Parasaurolophus", paddock1);
        dinosaurRepository.save(parasaurolophus);
        paddock1.addDinosaur(parasaurolophus);
        paddockRepository.save(paddock1);

        Dinosaur dilophosaurus = new Dinosaur("Carnivore", "Dilophosaurus", paddock1);
        dinosaurRepository.save(dilophosaurus);
        paddock1.addDinosaur(dilophosaurus);
        paddockRepository.save(paddock1);

        Dinosaur triceratops = new Dinosaur("Herbivore", "Triceratops", paddock1);
        dinosaurRepository.save(triceratops);
        paddock1.addDinosaur(triceratops);
        paddockRepository.save(paddock1);

        Dinosaur trex = new Dinosaur("Carnivore", "Tyrannosaurus rex", paddock1);
        dinosaurRepository.save(trex);
        paddock1.addDinosaur(trex);
        paddockRepository.save(paddock1);

        Dinosaur gallmimus = new Dinosaur("Carnivore", "Gallimimus", paddock1);
        dinosaurRepository.save(gallmimus);
        paddock1.addDinosaur(gallmimus);
        paddockRepository.save(paddock1);

        Dinosaur brachiosaurus = new Dinosaur("Herbivore", "Brachiosaurus", paddock1);
        dinosaurRepository.save(brachiosaurus);
        paddock1.addDinosaur(brachiosaurus);
        paddockRepository.save(paddock1);

        Dinosaur spinosaurus = new Dinosaur("Carnivore", "Spinosaurus", paddock1);
        dinosaurRepository.save(spinosaurus);
        paddock1.addDinosaur(spinosaurus);
        paddockRepository.save(paddock1);

        Dinosaur gigantosaurus = new Dinosaur("Carnivore", "Gigantosaurus", paddock1);
        dinosaurRepository.save(gigantosaurus);
        paddock1.addDinosaur(gigantosaurus);
        paddockRepository.save(paddock1);

        Dinosaur diplodocus = new Dinosaur("Herbivore", "Diplodocus", paddock1);
        dinosaurRepository.save(diplodocus);
        paddock1.addDinosaur(diplodocus);
        paddockRepository.save(paddock1);

        Dinosaur troodon = new Dinosaur("Carnivore", "Troodon", paddock1);
        dinosaurRepository.save(troodon);
        paddock1.addDinosaur(troodon);
        paddockRepository.save(paddock1);

        Dinosaur irritator = new Dinosaur("Carnivore", "Irritator", paddock1);
        dinosaurRepository.save(irritator);
        paddock1.addDinosaur(irritator);
        paddockRepository.save(paddock1);

        Dinosaur dilong = new Dinosaur("Herbivore", "Dilong", paddock1);
        dinosaurRepository.save(dilong);
        paddock1.addDinosaur(dilong);
        paddockRepository.save(paddock1);

        Dinosaur xixianykus = new Dinosaur("Herbivore", "Xixianykus", paddock1);
        dinosaurRepository.save(xixianykus);
        paddock1.addDinosaur(xixianykus);
        paddockRepository.save(paddock1);

        Dinosaur stegosaurus = new Dinosaur("Herbivore", "Stegosaurus", paddock1);
        dinosaurRepository.save(stegosaurus);
        paddock1.addDinosaur(stegosaurus);
        paddockRepository.save(paddock1);

        Dinosaur birkhamisaurus = new Dinosaur("Herbivore", "Birkhamisaurus", paddock1);
        dinosaurRepository.save(birkhamisaurus);
        paddock1.addDinosaur(birkhamisaurus);
        paddockRepository.save(paddock1);

        Dinosaur ankylosaurus = new Dinosaur("Herbivore", "Ankylosaurus", paddock1);
        dinosaurRepository.save(ankylosaurus);
        paddock1.addDinosaur(ankylosaurus);
        paddockRepository.save(paddock1);

        Dinosaur carnotaurus = new Dinosaur("Carnivore", "Carnotaurus", paddock1);
        dinosaurRepository.save(carnotaurus);
        paddock1.addDinosaur(carnotaurus);
        paddockRepository.save(paddock1);

        Dinosaur deinonychus = new Dinosaur("Carnivore", "Deinonychus", paddock1);
        dinosaurRepository.save(deinonychus);
        paddock1.addDinosaur(deinonychus);
        paddockRepository.save(paddock1);

        Dinosaur iguanodon = new Dinosaur("Herbivore", "Iguanodon", paddock1);
        dinosaurRepository.save(iguanodon);
        paddock1.addDinosaur(iguanodon);
        paddockRepository.save(paddock1);

        Dinosaur tarchia = new Dinosaur("Herbivore", "Tarchia", paddock1);
        dinosaurRepository.save(tarchia);
        paddock1.addDinosaur(tarchia);
        paddockRepository.save(paddock1);

        Dinosaur camptosaurus = new Dinosaur("Herbivore", "Camptosaurus", paddock1);
        dinosaurRepository.save(camptosaurus);
        paddock1.addDinosaur(camptosaurus);
        paddockRepository.save(paddock1);

        Dinosaur zephyrosaurus = new Dinosaur("Herbivore", "Zephyrosaurus", paddock1);
        dinosaurRepository.save(zephyrosaurus);
        paddock1.addDinosaur(zephyrosaurus);
        paddockRepository.save(paddock1);

        Dinosaur therizinosaurus = new Dinosaur("Carnivore", "Therizinosaurus", paddock1);
        dinosaurRepository.save(therizinosaurus);
        paddock1.addDinosaur(therizinosaurus);
        paddockRepository.save(paddock1);

        Dinosaur fukuisaurus = new Dinosaur("Herbivore", "Fukuisaurus", paddock1);
        dinosaurRepository.save(fukuisaurus);
        paddock1.addDinosaur(fukuisaurus);
        paddockRepository.save(paddock1);


    }

}
