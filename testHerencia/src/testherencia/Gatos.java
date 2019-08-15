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
public class Gatos extends Animales {

    private int cantPelos;

    public Gatos(String nombre, int patas, int cantPelos) {
        super(nombre, patas, 100, 7);// se utiliza para la re-utilizacion del contructor PADRE
        this.cantPelos = cantPelos;

        /*this.patas = patas;
        this.cantPelos = cantPelos;
        energia = 100;*/
    }

    public int getCantPelos() {
        return cantPelos;
    }

    public void setCantPelos(int cantPelos) {
        this.cantPelos = cantPelos;
    }

    public void correr() {
        energia = energia - 5;
    }

    public void jugar() {
        energia = energia - 10;
    }

    @Override
    public void comer(String nomComida) {
        if (energia >= 100) {
            energia = 100;
        } else if (energia == 100) {
            System.out.println("Estoy lleno");
        } else if (nomComida.equals("Raza")) {
            energia = energia + 15;
        }

    }

    public void jugarCon(Gatos gato) {
        if (energia > 20) {
            jugar();
            gato.jugar();

        }
    }

    public void jugarCon(Aves ave) {
        ave.morir();

    }

    @Override
    public void dormir(int horas) {
        if (energia < 100) {
            energia = energia + (horas * 2);
        }
    }

    public void jugarConPerros() {

        int elec = (int) (Math.random() * 5 + 1);
        switch (elec) {
            case 1:

                if (vidas > 0) {
                    vidas = 0;
                    System.out.println("Se murio");
                }

                break;
            case 2:
                if (energia>1){
                    restarEnergia(10);
                }

                break;
            case 3:
                if (vidas > 0) {
                    vidas = 0;
                    System.out.println("Se murio");
                    
                    
                }

                break;
            case 4:
                System.out.println("Entre en el caso: " + 4);

                break;
            case 5:
                System.out.println("Entre en el caso: " + 5);

                break;
            default:

        }
    }
}
