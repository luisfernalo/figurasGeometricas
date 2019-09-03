/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.figurasgeometricas;

/**
 * Esta clase hereda de la clase Figura2d y se encarga de hallar el área y
 * perimetro del triángulo y su clasificación por tipo
 *
 * @author luis fernando, angie manrique
 */
public class Triangulo extends Figura2d {

    /**
     * Variable que guarda el valor ingresado por el usuario como lado 1 del
     * triangulo
     */
    private double lado1;
    /**
     * Variable que guarda el valor ingresado por el usuario como lado 2 del
     * triangulo
     */
    private double lado2;
    /**
     * Variable que guarda el valor ingresado por el usuario como lado 3 del
     * triangulo
     */
    private double lado3;

    /**
     * Constructor de la clase
     *
     * @param lado1
     * @param lado2
     * @param lado3
     */
    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    /**
     * Método encargado de calcular el área del triángulo
     *
     * @return área hallada
     */
    @Override
    public String hallarArea() {
        double semiperimetro = (lado1 + lado2 + lado3) / 2;
        return "El área del triángulo es " + Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));
    }

    /**
     * Método encargado de calcular el perimetro del triángulo
     *
     * @return perimetro hallado
     */
    @Override
    public String hallarPerimetro() {
        return "El perimetro del triángulo es " + (lado1 + lado2 + lado3);
    }

    /**
     * Método encargado de clasificar el triángulo según su tipo
     *
     * @return string con tipo de lado
     */
    public String tipoTriangulo() {
        if (lado1 == lado2 && lado2 == lado3) {
            return "El triángulo es equilatero";
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            return "El triángulo es Isoceles";
        } else if (lado1 != lado2 || lado1 != lado3 || lado3 != lado2) {
            return "El triángulo es Escaleno";
        }
        return "";
    }

    /**
     * Método de la impresión del área, el perimetro y la clasificación del
     * triángulo
     *
     */
    @Override
    public void imprimir() {
        System.out.println(hallarArea());
        System.out.println(hallarPerimetro());
        System.out.println(tipoTriangulo());
    }
}
