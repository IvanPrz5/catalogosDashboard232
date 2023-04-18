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

import com.example.catalogosDashboard.CatalogosNomina.Entity.c_BancoEntity;
import com.example.catalogosDashboard.CatalogosNomina.Entity.c_PeriodicidadPagoEntity;
import com.example.catalogosDashboard.CatalogosNomina.Repository.c_PeriodicidadPagoRepository;
import com.example.catalogosDashboard.CatalogosNomina.Service.c_PeriodicidadPagoService;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT, })
@RestController
@RequestMapping("auth/PeriodicidadPago")
public class c_PeriodicidadPagoController {

    @Autowired
    private c_PeriodicidadPagoService cPeriodicidadPagoService;

    @Autowired
    private c_PeriodicidadPagoRepository cPeriodicidadPagoRepository;

    @GetMapping
    public List<c_PeriodicidadPagoEntity> getAllData(){
        return (List<c_PeriodicidadPagoEntity>) cPeriodicidadPagoService.getAllPeriodicidadPago();
    } 

    @PostMapping
    public ResponseEntity<c_PeriodicidadPagoEntity> createRegistro(@RequestBody c_PeriodicidadPagoEntity var) {
        try {
            c_PeriodicidadPagoEntity perioPago = cPeriodicidadPagoRepository.save(var);
            return new ResponseEntity<>(perioPago, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<c_PeriodicidadPagoEntity> updatingRegistro(@PathVariable("id") String idPeriodicidadPago, @RequestBody c_PeriodicidadPagoEntity cPeriodicidadPago){
        Optional<c_PeriodicidadPagoEntity> periodicidadPagoData = cPeriodicidadPagoRepository.findById(idPeriodicidadPago);
        
        if(periodicidadPagoData.isPresent()){
            c_PeriodicidadPagoEntity periodicidadPago =  periodicidadPagoData.get();
            periodicidadPago.setDescripcion(cPeriodicidadPago.getDescripcion());
            periodicidadPago.setStatus(cPeriodicidadPago.getStatus());
            return new ResponseEntity<>(cPeriodicidadPagoRepository.save(periodicidadPago), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    } 
    
    /* @GetMapping(value = "/{id}")
    public Optional<c_PeriodicidadPagoEntity> getDataByIdBanco(@PathVariable("id") String id) {
        return cPeriodicidadPagoService.getBancoById(id);
    } */
}