package com.example.catalogosDashboard.CatalogosNomina.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.catalogosDashboard.CatalogosNomina.Entity.AllCatalogosEntity;
import com.example.catalogosDashboard.CatalogosNomina.Repository.AllCatalogosRepository;

@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT, })
@RestController
@RequestMapping("auth/Catalogos")
public class AllCatalogosController {
    @Autowired
    private AllCatalogosRepository catalogosRepository;

    @GetMapping
    public List<AllCatalogosEntity> getAllData(){
        return (List<AllCatalogosEntity>) catalogosRepository.findAll();
    } 
}
