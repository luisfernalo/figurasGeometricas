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
public class Cilindro extends Figura3d {
        private double altura;
        private double radio;

    public Cilindro(double altura, double radio, int x, int y) {
        super(x, y);
        this.altura = altura;
        this.radio = radio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String hallarVolumen() {
        return "El Volumen del Cilindro es "+ (Math.PI*(radio*radio))*altura;
    }
        @Override
    public String hallarArea(){
        return "El Area del Cilindro es "+2*Math.PI*radio*(altura+radio);
    }
        
}
