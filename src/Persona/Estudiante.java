/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persona;

/**
 *
 * @author carlo
 */
public class Estudiante extends Persona {

    private int edad;    
    private String curso;
    private float calificacion;

    public Estudiante(int edad, String curso, float calificacion, int id, String nombre, String apellido) {
        super(id, nombre, apellido);
        this.edad = edad;
        this.curso = curso;
        this.calificacion = calificacion;
    }
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    } 
}
