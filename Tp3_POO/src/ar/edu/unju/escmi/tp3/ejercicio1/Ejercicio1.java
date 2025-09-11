package ar.edu.unju.escmi.tp3.ejercicio1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        ArrayList<Persona> listaPersonas = new ArrayList<>();

        do {
            System.out.println("\n=====================================");
            System.out.println("------MENÚ de OPCIONES-------");
            System.out.println("1-- Crear Objeto con Constructor por Defecto");
            System.out.println("2-- Crear Objeto con Constructor Parametrizados");
            System.out.println("3-- Crear objeto con Constructor (dni, nombre, fechaNacimiento)");
            System.out.println("4-- Mostrar personas");
            System.out.println("5-- Salir");
            System.out.print("Ingresá una opción: ");
            opc = sc.nextInt();
            sc.nextLine();

            switch (opc) {
                case 1: {
                    System.out.println("--- Creando Persona con Constructor por Defecto ---");
                    Persona persona = new Persona();

                    System.out.print("Ingrese el DNI: ");
                    persona.setDni(sc.nextInt());
                    sc.nextLine();

                    System.out.print("Ingrese el nombre: ");
                    persona.setNombre(sc.nextLine());

                    System.out.print("Ingrese el domicilio: ");
                    persona.setDomicilio(sc.nextLine());

                    System.out.print("Ingrese la provincia: ");
                    persona.setProvincia(sc.nextLine());

                    System.out.print("Ingrese la fecha de nacimiento [AAAA-MM-DD]: ");
                    persona.setFechaNacimiento(LocalDate.parse(sc.nextLine()));

                    listaPersonas.add(persona);
                    System.out.println("Persona agregada con éxito.\n");
                    break;
                }
                case 2: {
                    System.out.println("--- Creando Persona con Constructor Parametrizado ---");
                    System.out.print("Ingrese el DNI: ");
                    int dni = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Ingrese el nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Ingrese la fecha de nacimiento [AAAA-MM-DD]: ");
                    LocalDate fechaNacimiento = LocalDate.parse(sc.nextLine());

                    System.out.print("Ingrese el domicilio: ");
                    String domicilio = sc.nextLine();

                    System.out.print("Ingrese la provincia: ");
                    String provincia = sc.nextLine();

                    Persona persona = new Persona(dni, nombre, fechaNacimiento, domicilio, provincia);
                    listaPersonas.add(persona);
                    System.out.println("Persona agregada con éxito.\n");
                    break;
                }
                case 3: {
                    System.out.println("--- Creando Persona con Constructor (dni, nombre, fechaNacimiento) ---");
                    System.out.print("Ingrese el DNI: ");
                    int dni = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Ingrese el nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Ingrese la fecha de nacimiento [AAAA-MM-DD]: ");
                    LocalDate fechaNacimiento = LocalDate.parse(sc.nextLine());

                    Persona persona = new Persona(dni, nombre, fechaNacimiento);
                    listaPersonas.add(persona);
                    System.out.println("Persona agregada con éxito. Provincia se asignó a 'Jujuy' por defecto.\n");
                    break;
                }
                case 4: {
                    System.out.println("--- MosTrando personas ---");
                    if (listaPersonas.isEmpty()) {
                        System.out.println("No hay personas para mostrar.\n");
                    } else {
                        for (Persona p : listaPersonas) {
                            p.mostrarDatos();
                            System.out.println("-------------------------------------");
                        }
                    }
                    break;
                }
                case 5: {
                    System.out.println("Saliendo...");
                    break;
                }
                default: {
                    System.out.println("incorrecto .Por favor, ingresate una opción válida.");
                }
            }
        } while (opc != 5);
        sc.close();
    }
}
