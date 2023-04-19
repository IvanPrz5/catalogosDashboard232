package com.example.catalogosDashboard.CatalogosCFDI4.Repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.catalogosDashboard.CatalogosCFDI4.Entity.c_Estado;

public interface c_EstadoRepository extends JpaRepository <c_Estado, String> {
    List<c_Estado> findDataByStatus(Boolean status, Sort sort);
    
}
