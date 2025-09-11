package ar.edu.unju.escmi.tp3.ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        GatoSimple gatoPrincipal = null;

        do {
            System.out.println("\n=====================================");
            System.out.println("------MENÚ de GATOSS-------");
            System.out.println("1-- Crear gato simple");
            System.out.println("2-- Dar de comer a un gato simple");
            System.out.println("3-- Mostrar todos los gatos");
            System.out.println("4-- Crear gato contrincante para pelear con un gato simple");
            System.out.println("5-- Salir");
            System.out.print("Ingrese una opción: ");
            opc = sc.nextInt();
            sc.nextLine();

            switch (opc) {
                case 1: {
                    System.out.println("---* Creando Gato Simple *---");
                    System.out.print("Ingrese el nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Ingrese el color: ");
                    String color = sc.nextLine();
                    System.out.print("Ingrese la raza: ");
                    String raza = sc.nextLine();
                    System.out.print("Ingrese la edad: ");
                    int edad = sc.nextInt();
                    System.out.print("Ingrese el peso: ");
                    double peso = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Ingrese el sexo (macho/hembra): ");
                    String sexo = sc.nextLine();

                    gatoPrincipal = new GatoSimple(nombre, color, raza, edad, peso, sexo);
                    System.out.println("Gato simple creado con éxito.\n");
                    break;
                }
                case 2: {
                    if (gatoPrincipal == null) {
                        System.out.println("Primero tenes que crear un gato en la opción 1.\n");
                    } else {
                        System.out.print("Ingrese la comida para el gato: ");
                        String comida = sc.nextLine();
                        gatoPrincipal.comer(comida);
                        System.out.println();
                    }
                    break;
                }
                case 3: {
                    if (gatoPrincipal == null) {
                        System.out.println("Primero tenes que crear un gato en la opción 1.\n");
                    } else {
                        System.out.println("--- Datos del Gato Simple ---");
                        System.out.println("Nombre: " + gatoPrincipal.getNombre());
                        System.out.println("Color: " + gatoPrincipal.getColor());
                        System.out.println("Raza: " + gatoPrincipal.getRaza());
                        System.out.println("Edad: " + gatoPrincipal.getEdad());
                        System.out.println("Peso: " + gatoPrincipal.getPeso());
                        System.out.println("Sexo: " + gatoPrincipal.getSexo());
                        System.out.print("El gato maulla: ");
                        gatoPrincipal.maullar();
                        System.out.print("El gato ronronea: ");
                        gatoPrincipal.ronronear();
                        System.out.println();
                    }
                    break;
                }
                case 4: {
                    if (gatoPrincipal == null) {
                        System.out.println("Primero tenes que crear un gato simple en la opción 1.\n");
                    } else {
                        System.out.println("---* Creando Gato Contrincante para la pelea *---");
                        System.out.print("Ingrese el nombre del contrincante: ");
                        String nombre = sc.nextLine();
                        System.out.print("Ingrese el sexo del contrincante (macho/hembra): ");
                        String sexo = sc.nextLine();

                        GatoSimple gatoContrincante = new GatoSimple(nombre, "desconocido", "desconocida", 0, 0, sexo);
                        gatoPrincipal.pelear(gatoContrincante);
                        System.out.println();
                    }
                    break;
                }
                case 5: {
                    System.out.println("Saliendo...");
                    break;
                }
                default: {
                    System.out.println("incorrectisimo Por favor, intentá de nuevo.\n");
                }
            }
        } while (opc != 5);
        sc.close();
    }
}