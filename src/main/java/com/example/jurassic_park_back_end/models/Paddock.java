package com.example.jurassic_park_back_end.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="paddocks")
public class Paddock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "type")
    private String type;

    @JsonIgnoreProperties(value="paddock")
    @OneToMany(mappedBy = "paddock", fetch = FetchType.LAZY)
    private List<Dinosaur> dinosaurs;

    @JsonIgnoreProperties(value="paddocks")
    @ManyToOne
    @JoinColumn(name="park_id")
    private Park park;

    public Paddock(String type) {
        this.type = type;
    }

    public Paddock() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Dinosaur> getDinosaurs() {
        return dinosaurs;
    }

    public void setDinosaurs(List<Dinosaur> dinosaurs) {
        this.dinosaurs = dinosaurs;
    }

    public void addDinosaur(Dinosaur newDinosaur){
        if(newDinosaur.getType() == getType()) {
            this.dinosaurs.add(newDinosaur);
        }
    }

    public void transferDinosaur(Paddock newPaddock, Dinosaur transferDinosaur){
        int index = this.dinosaurs.indexOf(transferDinosaur);
        if(transferDinosaur.getType() == getType()) {
            Dinosaur removedDinosaur = this.dinosaurs.remove(index);
            newPaddock.addDinosaur(removedDinosaur);
        }
    }

    public void feedAllDinosaurs(){
        for(Dinosaur dino : this.dinosaurs){
            dino.setFed();
        }
    }
}
