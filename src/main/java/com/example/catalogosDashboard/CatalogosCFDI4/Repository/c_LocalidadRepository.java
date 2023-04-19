package com.example.catalogosDashboard.CatalogosCFDI4.Repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.catalogosDashboard.CatalogosCFDI4.Entity.c_Localidad;

public interface c_LocalidadRepository extends JpaRepository <c_Localidad, String>{
    List<c_Localidad> findDataByStatus(Boolean status, Sort sort);
    
}
