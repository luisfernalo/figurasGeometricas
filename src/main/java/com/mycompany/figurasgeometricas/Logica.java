/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.figurasgeometricas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author luis fernando, angie manrique
 */
public class Logica {

    ArrayList<Operaciones> figurasGeometricas = new ArrayList<Operaciones>();

    public void Principal() {
        Menu();
    }

    public void Menu() {

        int continuar = 0;
        do {
            System.out.println("--Figuras geométricas--");
            System.out.println("1- triangulo");
            System.out.println("2- cuadrado");
            System.out.println("3- circulo");
            System.out.println("4- cubo");
            System.out.println("5- cilindro");
            System.out.println("6- esfera");
            System.out.println("Elija una figura: ");
            Scanner seleccione = new Scanner(System.in);
            int seleccion = seleccione.nextInt();
            switch (seleccion) {
                case 1:
                    Triangulo();
                    break;
                case 2:
                    Cuadrado();
                    break;
                case 3:
                    Circulo();
                    break;
                case 4:
                    Cubo();
                    break;
                case 5:
                    Cilindro();
                    break;
                case 6:
                    Esfera();
                    break;
            }
            System.out.println("Desea continuar 1=si 0=no");
            Scanner decision = new Scanner(System.in);
            continuar = Integer.parseInt(decision.nextLine());
        } while (continuar == 1);
        Imprimir();
    }

    public void Triangulo() {
        System.out.println("--Triángulo--");
        Scanner valores = new Scanner(System.in);
        System.out.println("digite lado 1");
        int lado1 = valores.nextInt();
        System.out.println("digite lado 2");
        int lado2 = valores.nextInt();
        System.out.println("digite lado 3");
        int lado3 = valores.nextInt();
        Triangulo t1 = new Triangulo(lado1, lado2, lado3);
        figurasGeometricas.add(t1);
    }

    public void Cuadrado() {
        System.out.println("--Cuadrado--");
        Scanner ladovalor = new Scanner(System.in);
        System.out.println("Digite lado");
        int lado = ladovalor.nextInt();
        Cuadrado c1 = new Cuadrado(lado);
        figurasGeometricas.add(c1);
    }

    public void Circulo() {
        System.out.println("--Circulo--");
        Scanner valorescirculo = new Scanner(System.in);
        System.out.println("digite radio");
        int radio = valorescirculo.nextInt();
        Circulo c1 = new Circulo(radio);
        figurasGeometricas.add(c1);
    }

    private void Cubo() {
        System.out.println("--Cubo--");
        Scanner valorescubo = new Scanner(System.in);
        System.out.println("digite lado");
        int lado = valorescubo.nextInt();
        Cubo c1 = new Cubo(lado);
        figurasGeometricas.add(c1);
    }

    private void Cilindro() {
        System.out.println("--Cilindro--");
        Scanner valorescilindro = new Scanner(System.in);
        System.out.println("digite altura");
        int altura = valorescilindro.nextInt();
        System.out.println("digite radio");
        int radio = valorescilindro.nextInt();
        Cilindro c1 = new Cilindro(altura, radio);
        figurasGeometricas.add(c1);
    }

    private void Esfera() {
        System.out.println("--Esfera--");
        Scanner valoresesfera = new Scanner(System.in);
        System.out.println("digite radio");
        int radio = valoresesfera.nextInt();
        Esfera e1 = new Esfera(radio);
        figurasGeometricas.add(e1);
    }

    private void Imprimir() {

        for (Operaciones figura : figurasGeometricas) {
            if (figura instanceof Triangulo) {
                ((Triangulo) figura).imprimir();
            } else if (figura instanceof Cuadrado) {
                ((Cuadrado) figura).imprimir();
            } else if (figura instanceof Circulo) {
                ((Circulo) figura).imprimir();
            } else if (figura instanceof Cubo) {
                ((Cubo) figura).imprimir();
            } else if (figura instanceof Cilindro) {
                ((Cilindro) figura).imprimir();
            } else if (figura instanceof Esfera) {
                ((Esfera) figura).imprimir();
            }
        }
    }
}
