/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.module1.primer.ejercicio.modelo;

import java.math.BigDecimal;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 *
 * @author Leticia Boch
 */
@Data
@EqualsAndHashCode(of = "id")
@ToString(of = {"precio", "iva", "precioSinIVA"})
public class Producto {
    
    private Integer id;
    
    private String nombre;
    
    private BigDecimal precio;
    
    private BigDecimal iva;
    
    private BigDecimal precioSinIVA;
    
}
