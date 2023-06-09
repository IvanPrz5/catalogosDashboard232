package com.example.catalogosDashboard.CatalogosNomina.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.catalogosDashboard.CatalogosNomina.Entity.c_PeriodicidadPagoEntity;

public interface c_PeriodicidadPagoRepository extends JpaRepository<c_PeriodicidadPagoEntity, String>{
    List<c_PeriodicidadPagoEntity> findAll();
    Optional<c_PeriodicidadPagoEntity> findById(String id);
}
