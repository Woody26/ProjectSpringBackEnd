package com.example.jurassic_park_back_end.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name="dinosaurs")

public class Dinosaur {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long Id;

    @Column(name="type")
    private String type;

    @Column(name="isFed")
    private boolean isFed;

    @Column(name="name")
    private String name;

    @JsonIgnoreProperties(value="dinosaurs")
    @ManyToOne
    @JoinColumn(name="paddock_id")
    private Paddock paddock;

    public Dinosaur(String type, String name, Paddock paddock) {
        this.type = type;
        this.isFed = false;
        this.name = name;
        this.paddock = paddock;
    }

    public Dinosaur() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isFed() {
        return isFed;
    }

    public void setFed() {
        isFed = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Paddock getPaddock() {
        return paddock;
    }

    public void setPaddock(Paddock paddock) {
        this.paddock = paddock;
    }
}
