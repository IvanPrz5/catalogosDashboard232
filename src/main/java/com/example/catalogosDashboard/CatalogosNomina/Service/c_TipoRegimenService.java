package com.example.catalogosDashboard.CatalogosNomina.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.catalogosDashboard.CatalogosNomina.Entity.c_TipoRegimenEntity;
import com.example.catalogosDashboard.CatalogosNomina.Repository.c_TipoRegimenRepository;


@Service
public class c_TipoRegimenService {
    @Autowired
    c_TipoRegimenRepository cTipoRegimenRepository; 

    public List<c_TipoRegimenEntity> getAllRegimen(){
        return cTipoRegimenRepository.findAll();
    }

    /* public Optional<c_OrigenRecursoEntity> getOrigenRecursoByC_OriRec(String c_Origen_Recurso){
        return cOrigenRecursoRepository.findByC_OrigenRecurso(c_Origen_Recurso);        
    } */
}
