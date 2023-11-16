package com.cabinas.cabinas.dto;

import com.cabinas.cabinas.models.Cabinas;

public record CabinasDTO(Long id, String nombre, String url) {
    public CabinasDTO(Cabinas cabinas){
        this(cabinas.getId(), cabinas.getNombre(), cabinas.getUrl());
    }
}
