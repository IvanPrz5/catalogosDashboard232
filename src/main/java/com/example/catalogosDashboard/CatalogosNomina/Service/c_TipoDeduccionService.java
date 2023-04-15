package com.example.catalogosDashboard.CatalogosNomina.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.catalogosDashboard.CatalogosNomina.Entity.c_TipoDeduccionEntity;
import com.example.catalogosDashboard.CatalogosNomina.Repository.c_TipoDeduccionRepository;


@Service
public class c_TipoDeduccionService {
    @Autowired
    c_TipoDeduccionRepository cTipoDeduccionRepository; 

    public List<c_TipoDeduccionEntity> getAllTipoDeducc(){
        return cTipoDeduccionRepository.findAll();
    }

    /* public Optional<c_OrigenRecursoEntity> getOrigenRecursoByC_OriRec(String c_Origen_Recurso){
        return cOrigenRecursoRepository.findByC_OrigenRecurso(c_Origen_Recurso);        
    } */
}
