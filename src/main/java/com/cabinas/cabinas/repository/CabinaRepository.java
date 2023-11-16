package com.cabinas.cabinas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cabinas.cabinas.models.Cabinas;

public interface CabinaRepository extends JpaRepository<Cabinas, Long>{
    
}
