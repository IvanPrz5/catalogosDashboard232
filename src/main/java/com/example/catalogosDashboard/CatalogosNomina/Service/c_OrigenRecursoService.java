package com.example.catalogosDashboard.CatalogosNomina.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.catalogosDashboard.CatalogosNomina.Entity.c_OrigenRecursoEntity;
import com.example.catalogosDashboard.CatalogosNomina.Repository.c_OrigenRecursoRepository;

@Service
public class c_OrigenRecursoService {
    @Autowired
    c_OrigenRecursoRepository cOrigenRecursoRepository; 

    public List<c_OrigenRecursoEntity> getAllOrigenRecurso(){
        return cOrigenRecursoRepository.findAll();
    }

    public Optional<c_OrigenRecursoEntity> getByCodOrigenRecurso(String cod){
        return cOrigenRecursoRepository.findByCod(cod);
    }

    /* public Optional<c_OrigenRecursoEntity> getOrigenRecursoByC_OriRec(String c_Origen_Recurso){
        return cOrigenRecursoRepository.findByC_OrigenRecurso(c_Origen_Recurso);        
    } */
}
