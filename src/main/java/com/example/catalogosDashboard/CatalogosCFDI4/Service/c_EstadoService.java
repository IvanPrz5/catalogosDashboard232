package com.example.catalogosDashboard.CatalogosCFDI4.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.catalogosDashboard.CatalogosCFDI4.Entity.c_Estado;
import com.example.catalogosDashboard.CatalogosCFDI4.Repository.c_EstadoRepository;

@Service
public class c_EstadoService {
    @Autowired
    c_EstadoRepository cEstadoRepository; 

    public List<c_Estado> getAllEstadoByStatus(Boolean status, Sort sort){
        sort = Sort.by("id");
        List<c_Estado> estado = cEstadoRepository.findDataByStatus(status, sort);
        return estado;
    }
}
