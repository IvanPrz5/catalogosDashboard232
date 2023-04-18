package com.example.catalogosDashboard.CatalogosNomina.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.catalogosDashboard.CatalogosNomina.Entity.c_OrigenRecursoEntity;

public interface c_OrigenRecursoRepository extends JpaRepository<c_OrigenRecursoEntity, Integer> {
    List<c_OrigenRecursoEntity> findAll();
    Optional<c_OrigenRecursoEntity> findByCod(String cod);
    // Optional<c_OrigenRecursoEntity> findByC_OrigenRecurso(String c_Origen_Recurso);
}
