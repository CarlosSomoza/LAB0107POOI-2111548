/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeometricas;

/**
 *
 * @author carlo
 */
public class Punto {

    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    Punto() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double calcularDistancia() {
        return Math.sqrt(x * x + y * y);
    }

    public double calcularDistancia(Punto otroPunto) {
        double deltaX = this.x - otroPunto.getX();
        double deltaY = this.y - otroPunto.getY();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public double calcularDistancia(double xOrigen, double yOrigen) {
        double deltaX = this.x - xOrigen;
        double deltaY = this.y - yOrigen;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public int retornarCuadrante() {
        if (x > 0 && y > 0) {
            return 1;
        } else if (x < 0 && y > 0) {
            return 2;
        } else if (x < 0 && y < 0) {
            return 3;
        } else if (x > 0 && y < 0) {
            return 4;
        } else {
            return 0;
        }
    }

    public static Punto retornarPuntoMasCercano(Punto[] puntos) {
        if (puntos.length == 0) {
            System.out.println("La lista de puntos está vacía.");
            return null;
        }

        Punto puntoMasCercano = puntos[0];
        double distanciaMasCorta = puntoMasCercano.calcularDistancia();

        for (int i = 1; i < puntos.length; i++) {
            double distancia = puntos[i].calcularDistancia();
            if (distancia < distanciaMasCorta) {
                puntoMasCercano = puntos[i];
                distanciaMasCorta = distancia;
            }
        }

        return puntoMasCercano;
    }

}
