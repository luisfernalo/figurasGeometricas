/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.figurasgeometricas;

/**
 *
 * @author luis fernando, angie manrique
 */
public class Esfera extends Figura3d {

    /**
     * variable que guarda el valor ingresado por el usuario como radio de la
     * esfera
     */
    private double radio;

    /**
     * Constructor de la clase
     *
     * @param radio
     */
    public Esfera(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     * Método encargado de calcular el volumen de la esfera
     *
     * @return volumen hallado
     */
    @Override
    public String hallarVolumen() {
        return "El Volumen de la Esfera es " + (1.333 * Math.PI * (Math.pow(radio, 3)));
    }

    /**
     * Método encargado de calcular el área de la esfera
     *
     * @return área hallada
     */
    @Override
    public String hallarArea() {
        return "El área de la Esfera es " + 4 * Math.PI * radio * radio;
    }

    /**
     * Método que imprime el área y volumen de la esfera
     */
    @Override
    public void imprimir() {
        System.out.println(hallarArea());
        System.out.println(hallarVolumen());
    }
}
