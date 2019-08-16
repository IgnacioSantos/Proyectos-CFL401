/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testherencia;

/**
 *
 * @author Programación
 */
public abstract class Animales {//abstract sierve para no poder declarar nada de esta clase osea crear una mascota de esta clase

    protected String nombre;
    protected int patas;
    protected int energia;
    protected int vidas;

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    Animales(String nombre, int patas, int energia, int vidas) {
        this.nombre = nombre;
        this.patas = patas;
        this.energia = energia;
        this.vidas = vidas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public void comer(String nomComida) {
        if (energia < 30) {
            energia = energia + 15;
        }
    }

    public void dormir(int horas) {
        if (energia < 100) {
            energia = energia + (horas * 2);
        } else {
            setEnergia(100);
        }

    }

    public void morir() {
        setEnergia(0);

    }

    public void aveFenix(Animales animal) {
        if (animal.getEnergia() == 0) {

            System.out.println("Revivido");

            animal.setEnergia(1);

        }
    }

    public void matarAtodos(Animales animales) {

    }

    public void restarUnaVida() {
        vidas = vidas - 1;
    }

    public void restarEnergia(int energia) {
        this.energia = energia;
    }

}
