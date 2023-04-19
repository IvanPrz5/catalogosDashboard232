package com.example.catalogosDashboard.CatalogosCFDI4.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.catalogosDashboard.CatalogosCFDI4.Entity.c_CodigoPostal;
import com.example.catalogosDashboard.CatalogosCFDI4.Repository.c_CodigoPostalRepository;

@Service
public class c_CodigoPostalService {
    @Autowired
    c_CodigoPostalRepository cCodigoPostalRepository; 

    public List<c_CodigoPostal> getAllCodigoPostalByStatus(Boolean status, Sort sort){
        sort = Sort.by("id");
        List<c_CodigoPostal> codigoPostal = cCodigoPostalRepository.findDataByStatus(status, sort);
        return codigoPostal;
    }
}
