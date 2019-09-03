/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.figurasgeometricas;

/**
 * Esta clase se encarga de hallar el área y volumen del cubo a partir de su
 * altura y radio
 *
 * @author luis fernando, angie manrique
 */
public class Cubo extends Figura3d {

    /**
     * Esta variable guarda el valor ingresado como lado del cubo
     */
    private double lado;

    /**
     * Constructor de la clase
     *
     * @param lado
     */
    public Cubo(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    /**
     * Método encargado de calcular el área del cubo
     *
     * @return área hallada
     */
    @Override
    public String hallarArea() {
        return "El area del Cubo es " + 6 * (lado * lado);
    }

    /**
     * Método encargado de calcular el volumen del cubo
     *
     * @return volumen hallado
     */

    @Override
    public String hallarVolumen() {
        return "El Volumen del Cubo es " + lado * lado * lado;

    }

    /**
     * Método que imprime el área y volumen del cubo
     */
    @Override
    public void imprimir() {
        System.out.println(hallarArea());
        System.out.println(hallarVolumen());
    }
}
