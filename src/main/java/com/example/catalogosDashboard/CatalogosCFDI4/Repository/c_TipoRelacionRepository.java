package com.example.catalogosDashboard.CatalogosCFDI4.Repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.catalogosDashboard.CatalogosCFDI4.Entity.c_TipoRelacion;

public interface c_TipoRelacionRepository extends JpaRepository <c_TipoRelacion, String> {
    List<c_TipoRelacion> findDataByStatus(Boolean status, Sort sort);
}
