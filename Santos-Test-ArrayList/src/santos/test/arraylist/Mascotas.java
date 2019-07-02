/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santos.test.arraylist;

/**
 *
 * @author Programación
 */
public class Mascotas {
    private String animales;
    private int patas;
    private int edad;

    public Mascotas(String animales, int patas, int edad) {
        this.animales = animales;
        this.patas = patas;
        this.edad = edad;
    }

    public String getAnimales() {
        return animales;
    }

    public void setAnimales(String animales) {
        this.animales = animales;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
