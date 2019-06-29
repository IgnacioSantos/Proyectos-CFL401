/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santos.proyecto.lunes;

/**
 *
 * @author Programación
 */
public class PersonaCorta {
    private static String apellido;
    private static String nombre;
    private static int edad;

    public PersonaCorta(String apellido, String nombre, int edad) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
