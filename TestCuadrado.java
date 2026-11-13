package com.krakedev;

public class TestCuadrado {

    public static void main(String[] args) {

        Cuadrado c1 = new Cuadrado();
        c1.lado = 4;

        Cuadrado c2 = new Cuadrado();
        c2.lado = 3;

        Cuadrado c3 = new Cuadrado();
        c3.lado = 5;

        double area1 = c1.calcularArea();
        double perimetro1 = c1.calcularPerimetro();

        double area2 = c2.calcularArea();
        double perimetro2 = c2.calcularPerimetro();

        double area3 = c3.calcularArea();
        double perimetro3 = c3.calcularPerimetro();

        System.out.println("El area del cuadrado es: " + area1);
        System.out.println("El perimetro del cuadrado es: " + perimetro1);

        System.out.println("El area del cuadrado es: " + area2);
        System.out.println("El perimetro del cuadrado es: " + perimetro2);

        System.out.println("El area del cuadrado es: " + area3);
        System.out.println("El perimetro del cuadrado es: " + perimetro3);

    }

}
