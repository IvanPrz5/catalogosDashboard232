package com.example.catalogosDashboard.CatalogosCFDI4.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.catalogosDashboard.CatalogosCFDI4.Entity.c_Municipio;
import com.example.catalogosDashboard.CatalogosCFDI4.Repository.c_MunicipioRepository;

@Service
public class c_MunicipioService {
    @Autowired
    c_MunicipioRepository cMunicipioRepository; 

    public List<c_Municipio> getAllMunicipioByStatus(Boolean status, Sort sort){
        sort = Sort.by("id");
        List<c_Municipio> municipio = cMunicipioRepository.findDataByStatus(status, sort);
        return municipio;
    }
}
