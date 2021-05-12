package com.dio.apicity.controllers;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.apicity.entities.City;
import com.dio.apicity.repositories.CityRepository;

@RestController
@RequestMapping("cities")
public class CityController {
	
	  private final CityRepository repository;

	  public CityController(final CityRepository repository) {
	    this.repository = repository;
	  }
	  @GetMapping
	  public Page<City> cities(final Pageable page) {
	    return repository.findAll(page);
	  }

}
