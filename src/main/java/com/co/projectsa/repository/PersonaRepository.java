package com.co.projectsa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.co.projectsa.model.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Integer>  {

}
