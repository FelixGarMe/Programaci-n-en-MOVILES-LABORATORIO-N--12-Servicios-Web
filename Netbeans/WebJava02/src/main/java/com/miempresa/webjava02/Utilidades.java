package com.miempresa.webjava02;

public class Utilidades {
    public static int mayor(int a, int b, int c) {
        int mayor = a;

        if (b > mayor) {
            mayor = b;
        }

        if (c > mayor) {
            mayor = c;
        }

        return mayor;
    }
}
