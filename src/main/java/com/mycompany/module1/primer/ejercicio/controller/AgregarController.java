/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.module1.primer.ejercicio.controller;

import com.mycompany.module1.primer.ejercicio.modelo.Producto;
import com.mycompany.module1.primer.ejercicio.servicio.EjercicioServicio;
import jakarta.annotation.PostConstruct;
import java.io.Serializable;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import lombok.Getter;

/**
 *
 * @author Leticia Boch
 */
@Named
@ViewScoped
public class AgregarController implements Serializable {
    
    @Inject 
    private EjercicioServicio ejercicioServicio;
   
    @Getter
    private Producto producto;
    @Getter
    private List<Producto> productoList;
    
    @PostConstruct
    public void init() {
        this.producto = new Producto();
        this.productoList = new ArrayList<>();//150 added
    }
    public void agregar() {
        
        producto.setId(this.productoList.size() + 1);        
        this.productoList.add(producto);       //150 added 
//        this.producto.setCreadoEl(new Date());//128
        ejercicioServicio.agregarProducto(producto);
        this.producto = new Producto();   //initialize again     

    }
    
}
