/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.module1.primer.ejercicio.controller;

import com.mycompany.module1.primer.ejercicio.modelo.Producto;
import com.mycompany.module1.primer.ejercicio.servicio.EjercicioServicio;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Leticia Boch
 */
@Named
@ViewScoped
public class MostrarController implements Serializable {
    @Inject 
    private EjercicioServicio ejercicioServicio;
    
    private List<Producto> productoList;

        
    @PostConstruct
    public void init() {
        this.productoList = this.ejercicioServicio.buscarProductos();
    }

    public List<Producto> getProductoList() {
        return productoList;
    }
    
}
