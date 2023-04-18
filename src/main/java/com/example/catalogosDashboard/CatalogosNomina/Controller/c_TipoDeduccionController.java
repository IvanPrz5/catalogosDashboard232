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

import com.example.catalogosDashboard.CatalogosNomina.Entity.c_TipoDeduccionEntity;
import com.example.catalogosDashboard.CatalogosNomina.Repository.c_TipoDeduccionRepository;
import com.example.catalogosDashboard.CatalogosNomina.Service.c_TipoDeduccionService;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT, })
@RestController
@RequestMapping("auth/TipoDeduccion")
public class c_TipoDeduccionController {

    @Autowired
    private c_TipoDeduccionService cTipoDeduccionService;

    @Autowired
    private c_TipoDeduccionRepository cTipoDeduccionRepository;

    @GetMapping
    public List<c_TipoDeduccionEntity> getAllData(){
        return (List<c_TipoDeduccionEntity>) cTipoDeduccionService.getAllTipoDeducc();
    } 
    

    @PostMapping
    public ResponseEntity<c_TipoDeduccionEntity> createRegistro(@RequestBody c_TipoDeduccionEntity var) {
        try {
            c_TipoDeduccionEntity tipoDeduccion = cTipoDeduccionRepository.save(var);
            return new ResponseEntity<>(tipoDeduccion, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<c_TipoDeduccionEntity> updatingRegistro(@PathVariable("id") String idTipoDeduccion, @RequestBody c_TipoDeduccionEntity cTipoDeduccion){
        Optional<c_TipoDeduccionEntity> tipoDeduccionData = cTipoDeduccionRepository.findById(idTipoDeduccion);
        
        if(tipoDeduccionData.isPresent()){
            c_TipoDeduccionEntity tipoDeduccion = tipoDeduccionData.get();
            tipoDeduccion.setDescripcion(cTipoDeduccion.getDescripcion());
            tipoDeduccion.setStatus(cTipoDeduccion.getStatus());
            return new ResponseEntity<>(cTipoDeduccionRepository.save(tipoDeduccion), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    } 
    /* @GetMapping(value = "/{id}")
    public Optional<c_PeriodicidadPagoEntity> getDataByIdBanco(@PathVariable("id") String id) {
        return cPeriodicidadPagoService.getBancoById(id);
    } */
}