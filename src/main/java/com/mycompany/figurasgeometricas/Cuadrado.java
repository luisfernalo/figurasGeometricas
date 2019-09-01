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
public class Cuadrado extends Figura2d{
    private int lado;

    public Cuadrado(int lado, int x, int y) {
        super(x, y);
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
        
    @Override
    public String hallarArea() {
        return "El area del Cuadrado es "+lado*lado;
    }
    @Override
    public String hallarPerimetro(){
        return "El perimetro del Cuadrado es "+lado*4;
    }

  
    
}
