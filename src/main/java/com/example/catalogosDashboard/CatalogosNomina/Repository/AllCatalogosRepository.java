package com.example.catalogosDashboard.CatalogosNomina.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.catalogosDashboard.CatalogosNomina.Entity.AllCatalogosEntity;

public interface AllCatalogosRepository extends JpaRepository <AllCatalogosEntity, Integer> {
    
}
