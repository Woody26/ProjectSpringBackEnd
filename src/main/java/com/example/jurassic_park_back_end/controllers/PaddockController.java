package com.example.jurassic_park_back_end.controllers;


import com.example.jurassic_park_back_end.repositories.paddocks.PaddockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/paddocks")
public class PaddockController {

    @Autowired
    PaddockRepository paddockRepository;

}
