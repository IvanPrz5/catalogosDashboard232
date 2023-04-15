package com.example.catalogosDashboard.CatalogosCFDI4.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.catalogosDashboard.CatalogosCFDI4.Entity.c_Impuesto;

public interface c_ImpuestoRepository extends JpaRepository<c_Impuesto, String> {
   /*  public void guardar(c_Impuesto registro){
        registro.add(registro);
    } */
}
