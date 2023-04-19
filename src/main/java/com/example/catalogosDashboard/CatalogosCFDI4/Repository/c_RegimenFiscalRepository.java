package com.example.catalogosDashboard.CatalogosCFDI4.Repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.catalogosDashboard.CatalogosCFDI4.Entity.c_RegimenFiscal;

public interface c_RegimenFiscalRepository extends JpaRepository <c_RegimenFiscal, String>{
    List<c_RegimenFiscal> findDataByStatus(Boolean status, Sort sort);
    
}
