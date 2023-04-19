package com.example.catalogosDashboard.CatalogosCFDI4.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.catalogosDashboard.CatalogosCFDI4.Entity.c_Aduana;
import com.example.catalogosDashboard.CatalogosCFDI4.Repository.c_AduanaRepository;

@Service
public class c_AduanaService {
    
    @Autowired
    c_AduanaRepository cAduanaRepository; 

    public List<c_Aduana> getAllAduanaByStatus(Boolean status, Sort sort){
        sort = Sort.by("id");
        List<c_Aduana> aduana = cAduanaRepository.findDataByStatus(status, sort);
        return aduana;
    }

    /* public Optional<c_Aduana> getAduanaById(String id){
        return cAduanaRepository.findById(id);        
    } */
}
