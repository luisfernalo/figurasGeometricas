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
public class Esfera extends Figura3d {
    private double radio;

    public Esfera(double radio, int x, int y) {
        super(x, y);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String hallarVolumen() {
        return "El Volumen de la Esfera es "+4*Math.PI*radio*radio;
    }
    @Override
    public String hallarArea(){
        return "El Area de la Esfera es "+4*Math.PI*radio*radio+" --- "+"El Volumen de la Esfera es "+(4/3)*Math.PI*(radio*radio*radio);
    }
    
}
