package com.example.catalogosDashboard.CatalogosCFDI4.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.catalogosDashboard.CatalogosCFDI4.Entity.c_Meses;
import com.example.catalogosDashboard.CatalogosCFDI4.Repository.c_MesesRepository;

@Service
public class c_MesesService {
    @Autowired
    c_MesesRepository cMesesRepository; 

    public List<c_Meses> getAllMesesByStatus(Boolean status, Sort sort){
        sort = Sort.by("id");
        List<c_Meses> meses = cMesesRepository.findDataByStatus(status, sort);
        return meses;
    }
}
