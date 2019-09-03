/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.figurasgeometricas;

/**
 * Esta clase hereda de la clase Figura2d y se encarga de hallar el área y
 * perimetro del cuadrado
 *
 * @author luis fernando, angie manrique
 */
public class Cuadrado extends Figura2d {

    /**
     * variable que guarda el valor del lado que ingresa el usuario
     */
    private int lado;

    /**
     * Constructor de la clase
     *
     * @param lado
     */
    public Cuadrado(int lado) {
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    /**
     * Método encargado de calcular el área del cuadrado
     *
     * @return área hallada
     */
    @Override
    public String hallarArea() {
        return "El area del Cuadrado es " + lado * lado;
    }

    /**
     * Método encargado de calcular el perimetro del cuadrado
     *
     * @return perimetro hallado
     */
    @Override
    public String hallarPerimetro() {
        return "El perimetro del Cuadrado es " + lado * 4;
    }

    /**
     * Método encargado de la impresión del área y el perimetro del cuadrado
     *
     */
    @Override
    public void imprimir() {
        System.out.println(hallarArea());
        System.out.println(hallarPerimetro());
    }

}
