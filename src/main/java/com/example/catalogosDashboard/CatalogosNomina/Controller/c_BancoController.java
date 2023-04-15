package com.example.catalogosDashboard.CatalogosNomina.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
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

import com.example.catalogosDashboard.CatalogosNomina.Entity.c_BancoEntity;
import com.example.catalogosDashboard.CatalogosNomina.Service.c_BancoService;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT, })
@RestController
@RequestMapping("auth/Banco")
public class c_BancoController {

    @Autowired
    private c_BancoService cbancoService;

    @GetMapping
    public List<c_BancoEntity> getAllData(){
        return (List<c_BancoEntity>) cbancoService.getAllBancos();
    } 
    
    @GetMapping(value = "/{id}")
    public Optional<c_BancoEntity> getDataByIdBanco(@PathVariable("id") String id) {
        return cbancoService.getBancoById(id);
    }

    /* @PostMapping
    public ResponseEntity<c_AduanaEntity> createRegistro(@RequestBody c_AduanaEntity var) {
        try {
            c_AduanaEntity aduana = aduanaRepository.save(var);
            return new ResponseEntity<>(aduana, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{caduana}")
    public ResponseEntity<HttpStatus> deleteRegistro(@PathVariable("caduana") String caduana) {
        try {
            aduanaRepository.deleteById(caduana);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{caduana}")
    public ResponseEntity<c_AduanaEntity> updatingRegistro(@PathVariable("caduana") String idAduana, @RequestBody c_AduanaEntity cAduana){
        Optional<c_AduanaEntity> aduanaData = aduanaRepository.findById(idAduana);
        
        if(aduanaData.isPresent()){
            c_AduanaEntity aduana =  aduanaData.get();
            aduana.setId(cAduana.getId());
            aduana.setDescripcion(cAduana.getDescripcion());
            aduana.setStatus(cAduana.getStatus());
            return new ResponseEntity<>(aduanaRepository.save(aduana), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    } */
}