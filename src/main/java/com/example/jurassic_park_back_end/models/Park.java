package com.example.jurassic_park_back_end.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "parks")
public class Park {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    @Column(name = "name")
    private String name;

    @JsonIgnoreProperties(value="park")
    @Cascade(org.hibernate.annotations.CascadeType.DELETE)
    @OneToMany(mappedBy = "park", fetch = FetchType.LAZY)
    private List<Paddock> paddocks;

    private Boolean isLockedDown;

    public Park(String name) {
        this.name = name;
    }

    public Park() {
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Paddock> getPaddocks() {
        return paddocks;
    }

    public void setPaddocks(List<Paddock> paddocks) {
        this.paddocks = paddocks;
    }

    public Boolean getLockedDown() {
        return isLockedDown;
    }

    public void setLockedDown(Boolean lockedDown) {
        isLockedDown = lockedDown;
    }

    public void addPaddock(Paddock paddock) {
        this.paddocks.add(paddock);
    }

    public void removePaddock(Paddock paddock) {
        this.paddocks.remove(paddock);
    }

}
