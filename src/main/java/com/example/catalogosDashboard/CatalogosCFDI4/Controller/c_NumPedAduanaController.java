package com.example.catalogosDashboard.CatalogosCFDI4.Controller;

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

import com.example.catalogosDashboard.CatalogosCFDI4.Repository.c_NumPedAduanaRepository;
import com.example.catalogosDashboard.CatalogosCFDI4.Entity.c_NumPedAduana;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT, })

@RestController
@RequestMapping("auth/NumPedimentoAduana")
public class c_NumPedAduanaController {

    @Autowired
    private c_NumPedAduanaRepository numpedaduanaRepository;

    @GetMapping
    public List<c_NumPedAduana> getAllData() {
        return (List<c_NumPedAduana>) numpedaduanaRepository.findAll();
    }

    @GetMapping(value = "/{id}")
    public Optional<c_NumPedAduana> data(@PathVariable("id") Integer id) {
        return numpedaduanaRepository.findById(id);
    }

    /* @PostMapping
    public ResponseEntity<c_NumPedAduana> createRegistro(@RequestBody c_NumPedAduana var) {
        try {
            c_NumPedAduana nPedAduana = numpedaduanaRepository.save(var);
            return new ResponseEntity<>(nPedAduana, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{cnumpedaduana}")
    public ResponseEntity<HttpStatus> deleteRegistro(@PathVariable("cnumpedaduana") Integer cnumpedaduana) {
        try {
            numpedaduanaRepository.deleteById(cnumpedaduana);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{cnumpedaduana}")
    public ResponseEntity<c_NumPedAduana> updatingRegistro(@PathVariable("cnumpedaduana") Integer idNPAduna, @RequestBody c_NumPedAduana cNPAduana){
        Optional<c_NumPedAduana> npAduanaData = numpedaduanaRepository.findById(idNPAduna);
        
        if(npAduanaData.isPresent()){
            c_NumPedAduana nPedAduana = npAduanaData.get();
            nPedAduana.setCAduana(cNPAduana.getCAduana());
            nPedAduana.setPatente(cNPAduana.getPatente());
            nPedAduana.setStatus(cNPAduana.getStatus());
            return new ResponseEntity<>(numpedaduanaRepository.save((nPedAduana)), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    } */
}
