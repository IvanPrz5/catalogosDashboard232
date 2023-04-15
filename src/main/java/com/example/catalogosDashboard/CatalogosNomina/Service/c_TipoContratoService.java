package com.example.catalogosDashboard.CatalogosNomina.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.catalogosDashboard.CatalogosNomina.Entity.c_TipoContratoEntity;
import com.example.catalogosDashboard.CatalogosNomina.Repository.c_TipoContratoRepository;


@Service
public class c_TipoContratoService {
    @Autowired
    c_TipoContratoRepository cTipoContrato; 

    public List<c_TipoContratoEntity> getAllTipoContrato(){
        return cTipoContrato.findAll();
    }

    /* public Optional<c_OrigenRecursoEntity> getOrigenRecursoByC_OriRec(String c_Origen_Recurso){
        return cOrigenRecursoRepository.findByC_OrigenRecurso(c_Origen_Recurso);        
    } */
}
