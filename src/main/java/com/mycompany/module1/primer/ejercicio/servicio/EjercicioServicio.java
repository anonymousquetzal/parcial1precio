/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.module1.primer.ejercicio.servicio;

import com.mycompany.module1.primer.ejercicio.modelo.Producto;
import jakarta.enterprise.context.RequestScoped;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Leticia Boch
 */
@RequestScoped
public class EjercicioServicio implements Serializable {
    public static List<Producto> paisDatasource = new ArrayList<>();
    
    public List<Producto> buscarProductos() {


        return paisDatasource;
    }

    public void agregarProducto(Producto producto) {
        MathContext mc = new MathContext(2);
        producto.setId(paisDatasource.size() + 1);        
        producto.setPrecioSinIVA(producto.getPrecio().divide(new BigDecimal(1.12), mc));          
        producto.setIva(producto.getPrecioSinIVA().multiply(new BigDecimal(.12), mc) );
        paisDatasource.add(producto);
    }
    
}
