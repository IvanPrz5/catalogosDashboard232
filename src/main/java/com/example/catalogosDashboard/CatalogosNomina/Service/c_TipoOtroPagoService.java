package com.example.catalogosDashboard.CatalogosNomina.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.catalogosDashboard.CatalogosNomina.Entity.c_TipoOtroPagoEntity;
import com.example.catalogosDashboard.CatalogosNomina.Repository.c_TipoOtroPagoRepository;


@Service
public class c_TipoOtroPagoService {
    @Autowired
    c_TipoOtroPagoRepository cTipoOtroPagoRepository; 

    public List<c_TipoOtroPagoEntity> getAllTipoOPago(){
        return cTipoOtroPagoRepository.findAll();
    }

    /* public Optional<c_OrigenRecursoEntity> getOrigenRecursoByC_OriRec(String c_Origen_Recurso){
        return cOrigenRecursoRepository.findByC_OrigenRecurso(c_Origen_Recurso);        
    } */
}
