package ar.edu.unju.escmi.tp3.ejercicio4;

public class Cliente {
    private int dni;
    private String nombre;
    private char categoria;

    public Cliente(int dni, String nombre, char categoria) {
        this.dni = dni;
        this.nombre = nombre;
        this.categoria = categoria;
    }

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public char getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return "Cliente [DNI=" + dni + ", Nombre=" + nombre + ", Categoría=" + categoria + "]";
    }
}