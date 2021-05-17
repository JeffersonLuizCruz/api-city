package com.dio.apicity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dio.apicity.entities.State;

@Repository
public interface StateRepository extends JpaRepository<State, Long>{

}
