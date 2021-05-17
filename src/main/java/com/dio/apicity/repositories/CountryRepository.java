package com.dio.apicity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dio.apicity.entities.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long>{

}
