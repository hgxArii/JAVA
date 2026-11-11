
package com.krakedev;

public class TestPlato {

    public static void main(String[] args) {

        // Crear tres objetos Plato
        Plato platoA = new Plato();
        Plato platoB = new Plato();
        Plato platoC = new Plato();


        // PLATO A AGREGADO
        System.out.println("=========Plato A : agregado=========");
        System.out.println("nombre: " + platoA.nombre);
        System.out.println("Tipo: " + platoA.tipo);
        System.out.println("Precio: " + platoA.precio);
        System.out.println("disponible:" + platoA.disponible);

        // Modificar Plato A
        platoA.nombre = "coctel de camarones";
        platoA.tipo = "Plato fuerte";
        platoA.precio = 5.0f;
        platoA.disponible = true;

        // PLATO A VALORES AGREGADOS
        System.out.println("=========Plato A : valor agregado=========");
        System.out.println("nombre: " + platoA.nombre);
        System.out.println("Tipo: " + platoA.tipo);
        System.out.println("Precio: " + platoA.precio);
        System.out.println("disponible:" + platoA.disponible);


        // PLATO B AGREGADO
        System.out.println("=========Plato B : agregado=========");
        System.out.println("nombre: " + platoB.nombre);
        System.out.println("Tipo: " + platoB.tipo);
        System.out.println("Precio: " + platoB.precio);
        System.out.println("disponible:" + platoB.disponible);

        // Modificar Plato B
        platoB.nombre = "Sushi";
        platoB.tipo = "Entrada";
        platoB.precio = 8.5f;
        platoB.disponible = false;

        // PLATO B VALORES AGREGADOS
        System.out.println("=========Plato B : valor agregado=========");
        System.out.println("nombre: " + platoB.nombre);
        System.out.println("Tipo: " + platoB.tipo);
        System.out.println("Precio: " + platoB.precio);
        System.out.println("disponible:" + platoB.disponible);


        // PLATO C AGREGADO
        System.out.println("=========Plato C : agregado=========");
        System.out.println("nombre: " + platoC.nombre);
        System.out.println("Tipo: " + platoC.tipo);
        System.out.println("Precio: " + platoC.precio);
        System.out.println("disponible:" + platoC.disponible);

        // Modificar Plato C
        platoC.nombre = "cheescake";
        platoC.tipo = "Postre";
        platoC.precio = 2.5f;
        platoC.disponible = true;

        // PLATO C VALORES AGREGADOS
        System.out.println("=========Plato C : valor agregado=========");
        System.out.println("nombre: " + platoC.nombre);
        System.out.println("Tipo: " + platoC.tipo);
        System.out.println("Precio: " + platoC.precio);
        System.out.println("disponible:" + platoC.disponible);

    }
}

