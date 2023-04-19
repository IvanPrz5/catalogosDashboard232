package com.example.catalogosDashboard.CatalogosCFDI4.Repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.catalogosDashboard.CatalogosCFDI4.Entity.c_Asentamientos;

public interface c_AsentamientosRepository extends JpaRepository<c_Asentamientos, String> {
    List<c_Asentamientos> findDataByStatus(Boolean status, Sort sort);
}
