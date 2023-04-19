package com.example.catalogosDashboard.CatalogosCFDI4.Repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.catalogosDashboard.CatalogosCFDI4.Entity.c_Municipio;

public interface c_MunicipioRepository extends JpaRepository <c_Municipio, String>{
    List<c_Municipio> findDataByStatus(Boolean status, Sort sort);
    
}
