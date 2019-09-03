/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.figurasgeometricas;

/**
 * Esta clase hereda de la clase Figura2d y se encarga de hallar el área y
 * perimetro del circulo
 *
 * @author luis fernando, angie manrique
 */
public class Circulo extends Figura2d {

    /**
     * Variable que guarda el valor ingresado por el usuario como radio
     */
    private int radio;

    public Circulo(int radio) {
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    /**
     * Método encargado de calcular el área del circulo
     *
     * @return área hallada
     */
    @Override
    public String hallarArea() {
        return "El area del Circulo es " + Math.PI * (radio * radio);
    }

    /**
     * Método encargado de calcular el perimetro del circulo
     *
     * @return perimetro hallado
     */
    @Override
    public String hallarPerimetro() {
        return "el Perimetro del circulo es " + 2 * Math.PI * radio;

    }

    /**
     * Método encargado de la impresión del área y el perimetro del circulo
     *
     */
    @Override
    public void imprimir() {
        System.out.println(hallarArea());
        System.out.println(hallarPerimetro());
    }

}
