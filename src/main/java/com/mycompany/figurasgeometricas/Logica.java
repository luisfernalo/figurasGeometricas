/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.figurasgeometricas;

import java.util.Scanner;

/**
 *
 * @author luis fernando
 */
public class Logica {
    Figura figurasGeometricas[] = new Figura[10];
    int contador=0;
    int continuar=0;
    public void Principal() {
        
        System.out.println("Que Figura quiere");
        System.out.println("1- rectangulo");
        System.out.println("2- cuadrado");
        System.out.println("3- circulo");
        System.out.println("4- cubo");
        System.out.println("5- cilindro");
        System.out.println("6- esfera");
        Menu();
        
    }
    public void Menu(){
        do{
            Scanner seleccione=new Scanner(System.in);
            int seleccion =seleccione.nextInt();
            switch(seleccion){
                case 1:
                    Rectangulo();
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
            Scanner decision=new Scanner(System.in);
            continuar =decision.nextInt();
        }while(continuar==1);
        Imprimir();
    }
    public void Rectangulo(){
        Scanner valores=new Scanner(System.in);
        System.out.println("digite base");
        int base = valores.nextInt();
        System.out.println("digite altura");
        int altura = valores.nextInt();
        figurasGeometricas[contador]= new Rectangulo(base,altura,0,0);
        contador++;
    }
    public void Cuadrado(){
        Scanner ladovalor=new Scanner(System.in);
        System.out.println("digite lado");
        int lado = ladovalor.nextInt();
        figurasGeometricas[contador]= new Cuadrado(lado,0,0);
        contador++;
    }
    public void Circulo(){
        Scanner valorescirculo=new Scanner(System.in);
        System.out.println("digite radio");
        int radio = valorescirculo.nextInt();
        figurasGeometricas[contador]= new Circulo(radio,0,0);
        contador++; 
    }
    private void Cubo() {
        Scanner valorescubo=new Scanner(System.in);
        System.out.println("digite lado");
        int lado = valorescubo.nextInt();
        figurasGeometricas[contador]= new Cubo(lado,0,0);
        contador++; 
    }
    private void Cilindro() {
        Scanner valorescilindro=new Scanner(System.in);
        System.out.println("digite altura");
        int altura = valorescilindro.nextInt();
        System.out.println("digite radio");
        int radio = valorescilindro.nextInt();
        figurasGeometricas[contador]= new Cilindro(altura,radio,0,0);
        contador++; 
    }
    private void Esfera() {
        Scanner valoresesfera=new Scanner(System.in);
        System.out.println("digite radio");
        int radio = valoresesfera.nextInt();
        figurasGeometricas[contador]= new Esfera(radio,0,0);
        contador++; 
    }
    private void Imprimir() {
        for(Figura figura: figurasGeometricas ){
            if(figura instanceof Rectangulo){
                ((Rectangulo) figura).hallarArea();
                ((Rectangulo) figura).hallarPerimetro();
            }else if(figura instanceof Cuadrado){
                ((Cuadrado) figura).hallarArea();
                ((Cuadrado) figura).hallarPerimetro();
            }else if(figura instanceof Circulo){
                ((Circulo) figura).hallarArea();
                ((Circulo) figura).hallarPerimetro();
            }else if(figura instanceof Cubo){
                ((Cubo) figura).hallarArea();
                ((Cubo) figura).hallarVolumen();
            }else if(figura instanceof Cilindro){
                ((Cilindro) figura).hallarArea();
                ((Cilindro) figura).hallarVolumen();
            }else if(figura instanceof Esfera){
                ((Esfera) figura).hallarArea();
                ((Esfera) figura).hallarVolumen();
            }
            System.out.println("");
                    
            //System.out.println(figura.hallarArea());
        }
    }
}