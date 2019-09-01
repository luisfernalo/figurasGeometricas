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
public abstract class Figura2d extends Figura {

    public Figura2d(int x, int y) {
        super(x, y);
    }
    public abstract String hallarPerimetro();
   
}
