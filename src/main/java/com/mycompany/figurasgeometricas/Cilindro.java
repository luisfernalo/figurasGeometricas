/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.figurasgeometricas;

/**
 * Esta clase se encarga de hallar el área y volumen del cilindro a partir de su
 * altura y radio
 *
 * @author luis fernando, angie manrique
 */
public class Cilindro extends Figura3d {

    /**
     * Esta variable guarda el valor ingresado como altura del cilindro
     */
    private double altura;
    /**
     * Esta variable guarda el valor ingresado como radio del cilindro
     */
    private double radio;

    /**
     * Constructor de la clase
     *
     * @param altura valor altura del cilindro
     * @param radio valor radio del cilindro
     */
    public Cilindro(double altura, double radio) {
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

    /**
     * Método encargado de hallar el volumen del cilindro
     *
     * @return retorna el volumen
     */
    @Override
    public String hallarVolumen() {
        return "El Volumen del Cilindro es " + (Math.PI * (radio * radio)) * altura;
    }

    /**
     * Método encargado de hallar el área del cilindro
     *
     * @return retorna el área
     */
    @Override
    public String hallarArea() {
        return "El Area del Cilindro es " + 2 * Math.PI * radio * (altura + radio);
    }

    /**
     * Método que imprime el área y volumen del cilindro
     */
    @Override
    public void imprimir() {
        System.out.println(hallarArea());
        System.out.println(hallarVolumen());
    }
}
