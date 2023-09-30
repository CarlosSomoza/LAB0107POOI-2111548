package Animales;

public class Gato {
    private String nombre;
    private String raza;
    private String color;
    private int edad;

    public Gato() {
    }

    public String getTipoRaza() {
        return raza;
    }

    public int getEdad() {
        return edad;
    }

    public String getVacunas() {
        return "Vacunas del gato";
    }
}

