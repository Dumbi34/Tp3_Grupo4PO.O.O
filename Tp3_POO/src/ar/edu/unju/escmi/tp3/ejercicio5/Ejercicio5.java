package ar.edu.unju.escmi.tp3.ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Producto[] productos = new Producto[3];
        int contador = 0;
        int opcion;

        do {
            System.out.println("\n--- MENÚ DE PRODUCTOS ---");
            System.out.println("1 - Crear producto");
            System.out.println("2 - Mostrar productos");
            System.out.println("3 - Modificar precio de producto");
            System.out.println("4 - Mostrar productos que superen un precio");
            System.out.println("5 - Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    if (contador < productos.length) {
                        Producto p = new Producto();
                        System.out.print("Ingrese código: ");
                        p.setCodigo(scanner.nextLine());
                        System.out.print("Ingrese descripción: ");
                        p.setDescripcion(scanner.nextLine());
                        System.out.print("Ingrese precio: ");
                        p.setPrecio(scanner.nextDouble());
                        scanner.nextLine();
                        productos[contador++] = p;
                        System.out.println("Producto creado exitosamente.");
                    } else {
                        System.out.println("No se pueden agregar más productos.");
                    }
                    break;

                case 2:
                    System.out.println("\n--- LISTA DE PRODUCTOS ---");
                    for (Producto p : productos) {
                        if (p != null) {
                            System.out.println(p);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Ingrese código del producto a modificar: ");
                    String codigoMod = scanner.nextLine();
                    boolean encontrado = false;
                    for (Producto p : productos) {
                        if (p != null && p.getCodigo().equals(codigoMod)) {
                            System.out.print("Ingrese nuevo precio: ");
                            p.setPrecio(scanner.nextDouble());
                            scanner.nextLine();
                            System.out.println("Precio actualizado.");
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Producto no encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("Ingrese precio mínimo: ");
                    double precioMin = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("\n--- PRODUCTOS CON PRECIO MAYOR A $" + precioMin + " ---");
                    for (Producto p : productos) {
                        if (p != null && p.getPrecio() > precioMin) {
                            System.out.println(p);
                        }
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}
