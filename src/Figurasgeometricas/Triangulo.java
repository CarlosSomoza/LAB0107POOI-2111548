/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeometricas;

/**
 *
 * @author carlo
 */
public class Triangulo {
    private Punto vertice1;
    private Punto vertice2;
    private Punto vertice3;

    public Triangulo() {
        this(new Punto(), new Punto(), new Punto());
    }

    public Triangulo(Punto vertice1, Punto vertice2, Punto vertice3) {
        this.vertice1 = vertice1;
        this.vertice2 = vertice2;
        this.vertice3 = vertice3;
    }

    private double calcularDistancia(Punto p1, Punto p2) {
        double dx = p1.getX() - p2.getX();
        double dy = p1.getY() - p2.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    public double getPerimetro() {
        double lado1 = calcularDistancia(vertice1, vertice2);
        double lado2 = calcularDistancia(vertice2, vertice3);
        double lado3 = calcularDistancia(vertice3, vertice1);
        return lado1 + lado2 + lado3;
    }

    public String getTipo() {
        double lado1 = calcularDistancia(vertice1, vertice2);
        double lado2 = calcularDistancia(vertice2, vertice3);
        double lado3 = calcularDistancia(vertice3, vertice1);

        if (lado1 == lado2 && lado2 == lado3) {
            return "Equilátero";
        } else if (lado1 == lado2 || lado2 == lado3 || lado3 == lado1) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }

    public double getArea() {
        return 0.0;
    }

    public boolean isRegular() {
        double lado1 = calcularDistancia(vertice1, vertice2);
        double lado2 = calcularDistancia(vertice2, vertice3);
        double lado3 = calcularDistancia(vertice3, vertice1);

        return lado1 == lado2 && lado2 == lado3;
    }

    @Override
    public String toString() {
        return "Triángulo [vértice1=" + vertice1 + ", vértice2=" + vertice2 + ", vértice3=" + vertice3 + "]";
    }
}