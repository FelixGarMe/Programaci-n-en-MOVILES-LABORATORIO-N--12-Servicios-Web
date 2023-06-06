/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mienpresa.funciones;

public class OperacionesDiversas{

    public double raizCuadrada(double numero) {
        return Math.sqrt(numero);
    }

    public double raizCubica(double numero) {
        return Math.cbrt(numero);
    }

    public double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    public int valorAbsoluto(int numero) {
        return Math.abs(numero);
    }

    public int factorial(int numero) {
        int factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
