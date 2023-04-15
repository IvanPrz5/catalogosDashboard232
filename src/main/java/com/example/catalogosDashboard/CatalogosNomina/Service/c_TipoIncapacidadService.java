package com.example.catalogosDashboard.CatalogosNomina.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.catalogosDashboard.CatalogosNomina.Entity.c_TipoIncapacidadEntity;
import com.example.catalogosDashboard.CatalogosNomina.Repository.c_TipoIncapacidadRepository;

@Service
public class c_TipoIncapacidadService {
    @Autowired
    c_TipoIncapacidadRepository cTipoIncapacidadRepository; 

    public List<c_TipoIncapacidadEntity> getAllTipoIncapacidad(){
        return cTipoIncapacidadRepository.findAll();
    }

    /* public Optional<c_OrigenRecursoEntity> getOrigenRecursoByC_OriRec(String c_Origen_Recurso){
        return cOrigenRecursoRepository.findByC_OrigenRecurso(c_Origen_Recurso);        
    } */
}
