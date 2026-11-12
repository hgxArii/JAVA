package com.krakedev;

public class Calculadora {

    public double sumar(int a, int b) {
        double resultado;
        resultado = a + b;
        return resultado;
    }

    public int restar(int a, int b) {
        int resultado;
        resultado = a - b;
        return resultado;
    }

    public double multiplicar(double valor1, double valor2) {
        return valor1 * valor2;
    }

    public double dividir(double dividendo, double divisor) {
        if (divisor == 0) {
            System.out.println("Error: No se puede dividir para cero.");
            return 0;
        }
        return dividendo / divisor;
    }

    public double promediar(double valor1, double valor2, double valor3) {
        return (valor1 + valor2 + valor3) / 3;
    }

    public void mostrarResultado() {
        System.out.println("Ahorita no joven, Salí al almuerzo. Regreso en 15 minutos");
    }
}
