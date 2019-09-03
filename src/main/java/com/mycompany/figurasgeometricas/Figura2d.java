/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.figurasgeometricas;

/**
 * Clase padre que contiene el método en común de las figuras 2d hallar
 * perimetro
 *
 * @author luis fernando, Angie Manrique
 */
public abstract class Figura2d implements Operacion {

    /**
     * Constructor de la clase
     */
    public Figura2d() {
    }

    /**
     * Método que halla el perimetro
     *
     * @return y retorna el valor obtenido
     */
    public abstract String hallarPerimetro();

}
