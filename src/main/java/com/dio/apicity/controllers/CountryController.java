package com.dio.apicity.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.apicity.entities.Country;
import com.dio.apicity.repositories.CountryRepository;

@RestController
@RequestMapping("/countries")
public class CountryController {
	
    @Autowired
    private CountryRepository repository;

    @GetMapping
    public Page<Country> countries(Pageable page){
        return repository.findAll(page);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Country> getOne(@PathVariable Long id){
        Optional<Country> optionalCountry = repository.findById(id);
        if (optionalCountry.isPresent())
            return ResponseEntity.ok().body(optionalCountry.get());
        return ResponseEntity.notFound().build();
    }

}
