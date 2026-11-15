/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.daw.calculadora;

/**
 *
 * @author pavel
 */
public class Calculadora {
    // Suma dos números
    public double sumar(double a, double b) {
        return a + b;
    }
    
    // Resta el segundo número al primero
    public double restar(double a, double b) {
        return a - b;
    }
    
    // Multiplica dos números
    public double multiplicar(double a, double b) {
        return a * b;
    }
    
    // Divide el primer número entre el segundo
    public double dividir(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException(
                    "No se puede dividir entre cero"
            );
        }
        return a / b;
    }
    
    // Potencia la base por el exponente
    public double potencia(double base, double exponente){
        double num = base;
        
        for (int i=1; i<= exponente;i++){
        num*=base;
        }
        
        return num;
    }
}
