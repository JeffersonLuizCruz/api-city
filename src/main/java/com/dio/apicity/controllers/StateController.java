package com.dio.apicity.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.apicity.entities.State;
import com.dio.apicity.repositories.StateRepository;

@RestController
@RequestMapping("/states")
public class StateController {
	
    private StateRepository repository;

    public void StateResource(final StateRepository repository){
        this.repository = repository;
    }

    @GetMapping
    public List<State> states(){
        return repository.findAll();
    }

}
