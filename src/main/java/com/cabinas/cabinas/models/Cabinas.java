package com.cabinas.cabinas.models;


import com.cabinas.cabinas.dto.CabinasRequesDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name="cabinas")
@Entity(name="cabinas")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class Cabinas {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nombre;
    private String url;

    //@OneToMany()

    public Cabinas(CabinasRequesDTO data){
        this.nombre = data.nombre();
        this.url = data.url();
    }
}
