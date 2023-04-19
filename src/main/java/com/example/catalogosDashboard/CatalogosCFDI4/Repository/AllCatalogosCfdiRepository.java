package com.example.catalogosDashboard.CatalogosCFDI4.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.catalogosDashboard.CatalogosCFDI4.Entity.AllCatalogosCfdiEntity;

public interface AllCatalogosCfdiRepository extends JpaRepository <AllCatalogosCfdiEntity, Integer> {
    
}