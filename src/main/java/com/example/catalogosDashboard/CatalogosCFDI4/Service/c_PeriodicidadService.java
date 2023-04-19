package com.example.catalogosDashboard.CatalogosCFDI4.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.catalogosDashboard.CatalogosCFDI4.Entity.c_Periodicidad;
import com.example.catalogosDashboard.CatalogosCFDI4.Repository.c_PeriodicidadRepository;

@Service
public class c_PeriodicidadService {
    @Autowired
    c_PeriodicidadRepository cPeriodicidadRepository; 

    public List<c_Periodicidad> getAllPeriodicidadByStatus(Boolean status, Sort sort){
        sort = Sort.by("id");
        List<c_Periodicidad> periodicidad = cPeriodicidadRepository.findDataByStatus(status, sort);
        return periodicidad;
    }
}
