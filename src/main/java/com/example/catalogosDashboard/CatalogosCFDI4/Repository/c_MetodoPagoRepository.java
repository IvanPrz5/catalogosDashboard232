package com.example.catalogosDashboard.CatalogosCFDI4.Repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.catalogosDashboard.CatalogosCFDI4.Entity.c_MetodoPago;

public interface c_MetodoPagoRepository extends JpaRepository <c_MetodoPago, String> {
    List<c_MetodoPago> findDataByStatus(Boolean status, Sort sort);
    
}
