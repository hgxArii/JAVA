
package com.krakedev;

public class TestRectangulo {

    public static void main(String[] args) {

        Rectangulo r1 = new Rectangulo();
        r1.base = 4;
        r1.altura = 2;

        int resultadoArea = r1.calcularArea();
        double resultadoPerimetro = r1.calcularPerimetro();

        System.out.println("Resultado del area: " + resultadoArea);
        System.out.println("Resultado del perimetro: " + resultadoPerimetro);

    }

}
