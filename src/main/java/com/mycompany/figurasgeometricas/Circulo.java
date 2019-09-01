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
public class Circulo extends Figura2d{
    private int radio;

    public Circulo(int radio, int x, int y) {
        super(x, y);
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
    
    @Override
    public String hallarArea() {
        return "El area del Circulo es "+Math.PI*(radio*radio);
    }

    @Override
    public String hallarPerimetro() {
        return "el Perimetro del circulo es "+2*Math.PI*radio;
    
    }

   
}
