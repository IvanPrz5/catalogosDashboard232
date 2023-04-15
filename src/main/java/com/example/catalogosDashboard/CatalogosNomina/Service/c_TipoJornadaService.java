package com.example.catalogosDashboard.CatalogosNomina.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.catalogosDashboard.CatalogosNomina.Entity.c_TipoJornadaEntity;
import com.example.catalogosDashboard.CatalogosNomina.Repository.c_TipoJornadaRepository;

@Service
public class c_TipoJornadaService {
    @Autowired
    c_TipoJornadaRepository cTipoJornadaRepository; 

    public List<c_TipoJornadaEntity> getAllTipoJornada(){
        return cTipoJornadaRepository.findAll();
    }

    /* public Optional<c_OrigenRecursoEntity> getOrigenRecursoByC_OriRec(String c_Origen_Recurso){
        return cOrigenRecursoRepository.findByC_OrigenRecurso(c_Origen_Recurso);        
    } */
}
