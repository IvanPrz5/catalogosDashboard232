package com.example.catalogosDashboard.CatalogosNomina.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.catalogosDashboard.CatalogosNomina.Entity.c_TipoNominaEntity;
import com.example.catalogosDashboard.CatalogosNomina.Service.c_TipoNominaService;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT, })
@RestController
@RequestMapping("auth/TipoNomina")
public class c_TipoNominaController {

    @Autowired
    private c_TipoNominaService cTipoNominaService;

    @GetMapping
    public List<c_TipoNominaEntity> getAllData(){
        return (List<c_TipoNominaEntity>) cTipoNominaService.getAllTipoNomina();
    } 
    
    /* @GetMapping(value = "/{id}")
    public Optional<c_PeriodicidadPagoEntity> getDataByIdBanco(@PathVariable("id") String id) {
        return cPeriodicidadPagoService.getBancoById(id);
    } */
}