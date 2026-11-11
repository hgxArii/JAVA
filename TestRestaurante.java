package com.krakedev;

public class TestRestaurante {

    public static void main(String[] args) {

        // Crear los dos restaurantes
        Restaurante rest1 = new Restaurante();
        Restaurante rest2 = new Restaurante();

        // RESTAURANTE 1 AGREGADO
        System.out.println("=========Restaurante 1 : agregado=========");
        System.out.println("nombre: " + rest1.nombre);
        System.out.println("direccion: " + rest1.direccion);
        System.out.println("calificacion: " + rest1.calificacion);

        // Modificar atributos del restaurante 1
        rest1.nombre = "El Buen Sabor";
        rest1.direccion = "Av. Amazonas, Quito";
        rest1.calificacion = 4.5f;

        // RESTAURANTE 1 VALORES AGREGADOS
        System.out.println("=========Restaurante 1 : valor agregado=========");
        System.out.println("nombre: " + rest1.nombre);
        System.out.println("direccion: " + rest1.direccion);
        System.out.println("calificacion: " + rest1.calificacion);


        // RESTAURANTE 2 AGREGADO
        System.out.println("=========Restaurante 2 : agregado=========");
        System.out.println("nombre: " + rest2.nombre);
        System.out.println("direccion: " + rest2.direccion);
        System.out.println("calificacion: " + rest2.calificacion);

        // Modificar atributos del restaurante 2
        rest2.nombre = "La Casa del Chef";
        rest2.direccion = "Cumbaya, Quito";
        rest2.calificacion = 4.8f;

        // RESTAURANTE 2 VALORES AGREGADOS
        System.out.println("=========Restaurante 2 : valor agregado=========");
        System.out.println("nombre: " + rest2.nombre);
        System.out.println("direccion: " + rest2.direccion);
        System.out.println("calificacion: " + rest2.calificacion);

    }
}