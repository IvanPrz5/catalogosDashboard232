package com.example.catalogosDashboard.CatalogosNomina.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.catalogosDashboard.CatalogosNomina.Entity.c_BancoEntity;
import com.example.catalogosDashboard.CatalogosNomina.Repository.c_BancoRepository;

@Service
public class c_BancoService {

    @Autowired
    c_BancoRepository cbancoRepository; 

    public List<c_BancoEntity> getAllBancos(){
        return cbancoRepository.findAll();
    }

    public Optional<c_BancoEntity> getBancoById(String id){
        return cbancoRepository.findById(id);        
    }
}
