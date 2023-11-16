package com.cabinas.cabinas.controller;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cabinas.cabinas.dto.CabinasDTO;
import com.cabinas.cabinas.dto.CabinasRequesDTO;
import com.cabinas.cabinas.models.Cabinas;
import com.cabinas.cabinas.repository.CabinaRepository;

@RestController
@RequestMapping("cabina")
public class CabinaController {
    
    @Autowired
    private CabinaRepository cabinaRepository;

    @GetMapping
    public List<CabinasDTO> getAll(){
        List<CabinasDTO> cabinas = cabinaRepository.findAll().stream().map(CabinasDTO::new).toList();
        return cabinas;
    }

    @PostMapping
    public void saveCabina(@RequestBody CabinasRequesDTO data){
        Cabinas cabinaData = new Cabinas(data);
        cabinaRepository.save(cabinaData);
        return;
    }
}


