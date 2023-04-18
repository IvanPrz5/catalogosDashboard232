package com.example.catalogosDashboard.CatalogosNomina.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.catalogosDashboard.CatalogosNomina.Entity.c_RiesgoPuestoEntity;
import com.example.catalogosDashboard.CatalogosNomina.Repository.c_RiesgoPuestoRepository;
import com.example.catalogosDashboard.CatalogosNomina.Service.c_RiesgoPuestoService;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT, })
@RestController
@RequestMapping("auth/RiesgoPuesto")
public class c_RiesgoPuestoController {

    @Autowired
    private c_RiesgoPuestoService cRiesgoPuestoService;

    @Autowired
    private c_RiesgoPuestoRepository cRiesgoPuestoRepository;

    @GetMapping
    public List<c_RiesgoPuestoEntity> getAllData(){
        return (List<c_RiesgoPuestoEntity>) cRiesgoPuestoService.getAllRiesgoPuesto();
    } 

    @PostMapping
    public ResponseEntity<c_RiesgoPuestoEntity> createRegistro(@RequestBody c_RiesgoPuestoEntity var) {
        try {
            c_RiesgoPuestoEntity riesgoPuesto = cRiesgoPuestoRepository.save(var);
            return new ResponseEntity<>(riesgoPuesto, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<c_RiesgoPuestoEntity> updatingRegistro(@PathVariable("id") Integer idRiesgoPuesto, @RequestBody c_RiesgoPuestoEntity cRiesgoPuesto){
        Optional<c_RiesgoPuestoEntity> riesgoPuestoData = cRiesgoPuestoRepository.findById(idRiesgoPuesto);
        
        if(riesgoPuestoData.isPresent()){
            c_RiesgoPuestoEntity riesgoPuesto = riesgoPuestoData.get();
            riesgoPuesto.setDescripcion(cRiesgoPuesto.getDescripcion());
            riesgoPuesto.setStatus(cRiesgoPuesto.getStatus());
            return new ResponseEntity<>(cRiesgoPuestoRepository.save(riesgoPuesto), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    } 
    
    /* @GetMapping(value = "/{id}")
    public Optional<c_PeriodicidadPagoEntity> getDataByIdBanco(@PathVariable("id") String id) {
        return cPeriodicidadPagoService.getBancoById(id);
    } */
}