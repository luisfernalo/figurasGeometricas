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
public class Rectangulo extends Figura2d{
    
    private double base;
    private double altura;
    
    public Rectangulo(double base, double altura, int x, int y) {
        super(x, y);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    @Override
    public String hallarArea() {
        return "El area del Rectangulo es "+base*altura+" --- "+"El perimetro del Rectagulo es "+(base*2)+(altura*2);    
    }
    @Override
    public String hallarPerimetro(){
        return "El perimetro del Rectagulo es "+(base*2)+(altura*2);
    }
}
