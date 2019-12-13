package com.example.jurassic_park_back_end.controllers;

import com.example.jurassic_park_back_end.repositories.parks.ParkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/parks")
public class ParkController {

    @Autowired
    ParkRepository parkRepository;

}
