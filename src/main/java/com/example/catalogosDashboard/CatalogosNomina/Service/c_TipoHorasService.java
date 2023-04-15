package com.example.catalogosDashboard.CatalogosNomina.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.catalogosDashboard.CatalogosNomina.Entity.c_TipoHorasEntity;
import com.example.catalogosDashboard.CatalogosNomina.Repository.c_TipoHorasRepository;


@Service
public class c_TipoHorasService {
    @Autowired
    c_TipoHorasRepository cTipoHorasRepository; 

    public List<c_TipoHorasEntity> getAllTipoHoras(){
        return cTipoHorasRepository.findAll();
    }

    /* public Optional<c_OrigenRecursoEntity> getOrigenRecursoByC_OriRec(String c_Origen_Recurso){
        return cOrigenRecursoRepository.findByC_OrigenRecurso(c_Origen_Recurso);        
    } */
}
