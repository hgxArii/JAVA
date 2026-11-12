package com.krakedev;

public class TestCalculadora {

    public static void main(String[] args) {

        Calculadora c1 = new Calculadora();

        double r1;

        r1 = c1.sumar(4, 2);

        System.out.println("Resultado Suma: " + r1);

        int r2;
        r2 = c1.restar(4, 2);

        System.out.println("Resultado Resta: " + r2);
        Calculadora calculadora = new Calculadora();

        double resultadoMultiplicacion = calculadora.multiplicar(10, 5);
        System.out.println("Resultado de la multiplicacion: " + resultadoMultiplicacion);

        double resultadoDivision = calculadora.dividir(10, 2);
        System.out.println("Resultado de la division: " + resultadoDivision);

        double resultadoPromedio = calculadora.promediar(10, 8, 9);
        System.out.println("Resultado del promedio: " + resultadoPromedio);

        calculadora.mostrarResultado();
    }
}