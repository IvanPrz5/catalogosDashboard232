package com.example.catalogosDashboard.CatalogosCFDI4.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.catalogosDashboard.CatalogosCFDI4.Entity.c_Asentamientos;
import com.example.catalogosDashboard.CatalogosCFDI4.Repository.c_AsentamientosRepository;

@Service
public class c_AsentamientosService {
    @Autowired
    c_AsentamientosRepository cAsentamientosRepository; 

    public List<c_Asentamientos> getAllAsentamientosByStatus(Boolean status, Sort sort){
        sort = Sort.by("id");
        List<c_Asentamientos> asentamientos = cAsentamientosRepository.findDataByStatus(status, sort);
        return asentamientos;
    }
}
