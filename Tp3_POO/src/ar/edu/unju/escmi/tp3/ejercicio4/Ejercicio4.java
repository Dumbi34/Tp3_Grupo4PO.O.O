package ar.edu.unju.escmi.tp3.ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cliente[] clientes = new Cliente[4];
        int contador = 0;
        int opcion;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1 - Crear cliente");
            System.out.println("2 - Mostrar cliente por DNI");
            System.out.println("3 - Mostrar todos los clientes");
            System.out.println("4 - Mostrar clientes por categoría");
            System.out.println("5 - Salir");
            System.out.print("Elija una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    if (contador < clientes.length) {
                        System.out.print("Ingrese DNI: ");
                        int dni = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Ingrese nombre: ");
                        String nombre = sc.nextLine();
                        System.out.print("Ingrese categoría (una letra): ");
                        char categoria = sc.next().charAt(0);

                        clientes[contador] = new Cliente(dni, nombre, categoria);
                        contador++;
                        System.out.println("Cliente creado con éxito.");
                    } else {
                        System.out.println("No se pueden agregar más clientes (límite 4).");
                    }
                    break;

                case 2:
                    System.out.print("Ingrese el DNI a buscar: ");
                    int dniBuscado = sc.nextInt();
                    boolean encontrado = false;
                    for (Cliente c : clientes) {
                        if (c != null && c.getDni() == dniBuscado) {
                            System.out.println(c);
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("No se encontró el DNI.");
                    }
                    break;

                case 3:
                    System.out.println("Lista de clientes:");
                    for (Cliente c : clientes) {
                        if (c != null) {
                            System.out.println(c);
                        }
                    }
                    break;

                case 4:
                    System.out.print("Ingrese la categoría a buscar: ");
                    char catBuscada = sc.next().charAt(0);
                    boolean alguno = false;
                    for (Cliente c : clientes) {
                        if (c != null && c.getCategoria() == catBuscada) {
                            System.out.println(c);
                            alguno = true;
                        }
                    }
                    if (!alguno) {
                        System.out.println("No se encontraron clientes en esa categoría.");
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 5);

        sc.close();
    }
}