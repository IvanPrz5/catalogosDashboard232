package com.example.catalogosDashboard.CatalogosNomina.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.catalogosDashboard.CatalogosNomina.Entity.c_PeriodicidadPagoEntity;
import com.example.catalogosDashboard.CatalogosNomina.Repository.c_PeriodicidadPagoRepository;


@Service
public class c_PeriodicidadPagoService {
    @Autowired
    c_PeriodicidadPagoRepository cPeriodiciadPagoRepository; 

    public List<c_PeriodicidadPagoEntity> getAllPeriodicidadPago(){
        return cPeriodiciadPagoRepository.findAll();
    }

    /* public Optional<c_OrigenRecursoEntity> getOrigenRecursoByC_OriRec(String c_Origen_Recurso){
        return cOrigenRecursoRepository.findByC_OrigenRecurso(c_Origen_Recurso);        
    } */
}
