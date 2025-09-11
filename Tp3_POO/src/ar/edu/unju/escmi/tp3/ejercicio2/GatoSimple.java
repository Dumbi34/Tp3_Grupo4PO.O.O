package ar.edu.unju.escmi.tp3.ejercicio2;

public class GatoSimple {
    private String nombre;
    private String color;
    private String raza;
    private int edad;
    private double peso;
    private String sexo;

    public GatoSimple(String nombre, String color, String raza, int edad, double peso, String sexo) {
        this.nombre = nombre;
        this.color = color;
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
        this.sexo = sexo;
    }

    public void maullar() {
        System.out.println("Miauu");
    }

    public void ronronear() {
        System.out.println("prrrr");
    }

    public void comer(String comida) {
        if (comida.equalsIgnoreCase("pescado")) {
            System.out.println("Que rico ¡Gracias!!");
        } else {
            System.out.println("Lo siento, yo solo como pescado");
        }
    }

    public void pelear(GatoSimple gatoContrincante) {
        if (this.sexo.equalsIgnoreCase("hembra")) {
            System.out.println("No me gusta peleaar");
        } else if (gatoContrincante.sexo.equalsIgnoreCase("hembra")) {
            System.out.println("No peleo contra gatitas");
        } else {
            System.out.println("¡Ven aquí que te vas a enterar!");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}