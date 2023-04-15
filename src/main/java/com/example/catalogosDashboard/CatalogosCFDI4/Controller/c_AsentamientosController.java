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

import com.example.catalogosDashboard.CatalogosCFDI4.Entity.c_Asentamientos;
import com.example.catalogosDashboard.CatalogosCFDI4.Repository.c_AsentamientosRepository;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT, })
@RestController
@RequestMapping("auth/Asentamientos")
public class c_AsentamientosController {
    @Autowired
    private c_AsentamientosRepository asentamientosRepository;

    @GetMapping
    public List<c_Asentamientos> getAllData() {
        return (List<c_Asentamientos>) asentamientosRepository.findAll();
    }

    @GetMapping(value = "/{casentamiento}")
    public Optional<c_Asentamientos> data(@PathVariable("casentamiento") String casentamiento) {
        return asentamientosRepository.findById(casentamiento);
    }
}
