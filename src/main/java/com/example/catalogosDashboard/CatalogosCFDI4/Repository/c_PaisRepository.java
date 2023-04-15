package com.example.catalogosDashboard.CatalogosCFDI4.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.catalogosDashboard.CatalogosCFDI4.Entity.c_Pais;

public interface c_PaisRepository extends JpaRepository<c_Pais, String> {
    /* public List<c_Pais> findByPaisAndDescripcion(String cPais, String descripcion); */
}
