/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.figurasgeometricas;

/**
 *
 * @author luis fernando
 */
public class Cubo extends Figura3d{
    private double lado;

    public Cubo(double lado, int x, int y) {
        super(x, y);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    @Override
    public String hallarArea() {
        return "El area del Cubo es "+6*(lado*lado);
    }

    
    @Override
    public String hallarVolumen() {
        return "El Volumen del Cubo es "+lado*lado*lado;
    
    }
}
