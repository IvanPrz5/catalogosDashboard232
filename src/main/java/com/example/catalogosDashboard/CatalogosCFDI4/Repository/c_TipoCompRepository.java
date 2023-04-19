package com.example.catalogosDashboard.CatalogosCFDI4.Repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.catalogosDashboard.CatalogosCFDI4.Entity.c_TipoComp;

public interface c_TipoCompRepository extends JpaRepository <c_TipoComp, String>{
    List<c_TipoComp> findDataByStatus(Boolean status, Sort sort);
    
}
