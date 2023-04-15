package com.example.catalogosDashboard.CatalogosNomina.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.catalogosDashboard.CatalogosNomina.Entity.c_TipoPercepcionEntity;
import com.example.catalogosDashboard.CatalogosNomina.Repository.c_TipoPercepcionRepository;


@Service
public class c_TipoPercepcionService {
    @Autowired
    c_TipoPercepcionRepository cTipoPercepcionRepository; 

    public List<c_TipoPercepcionEntity> getAllTipoPercepcion(){
        return cTipoPercepcionRepository.findAll();
    }

    /* public Optional<c_OrigenRecursoEntity> getOrigenRecursoByC_OriRec(String c_Origen_Recurso){
        return cOrigenRecursoRepository.findByC_OrigenRecurso(c_Origen_Recurso);        
    } */
}
