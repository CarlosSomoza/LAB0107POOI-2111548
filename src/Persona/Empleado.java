/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persona;

/**
 *
 * @author carlo
 */
public class Empleado extends Persona {

    private int salario;
    private int desempenio;

    public Empleado(int id, String nombre, String apellido, int salario, int desempenio) {
        super(id, nombre, apellido); 
        this.salario = salario;
        this.desempenio = desempenio;
    }
    public int getSalario() {
        return salario;
    }
    public int getSalarioAnual() {
        return salario * 12;
    }
    public int getSalarioAnual(int desempenio) {
        if (desempenio >= 7 && desempenio <= 10) {
            return (int) (salario * 12 * 1.05);
        } else if (desempenio >= 5 && desempenio < 7) {
            return (int) (salario * 12 * 1.02);
        } else if (desempenio >= 3 && desempenio < 5) {
            return (int) (salario * 12 * 1.01);
        } else {
            return salario * 12;
        }
    }
}
