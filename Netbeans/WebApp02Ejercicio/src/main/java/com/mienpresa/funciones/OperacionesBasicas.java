/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mienpresa.funciones;

public class OperacionesBasicas {
    
    public int suma(int a, int b) {
        return a + b;
    }
    
    public int resta(int a, int b) {
        return a - b;
    }
    
    public int multiplicacion(int a, int b) {
        return a * b;
    }
    
    public double division(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero.");
        }
        return a / b;
    }
    
}
