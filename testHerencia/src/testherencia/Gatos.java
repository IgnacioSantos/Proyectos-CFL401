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

    public void jugarCon(Perros perro) {

        int elec = (int) (Math.random() * 5 + 1);
        switch (elec) {
            case 1:

                while (vidas > 0) {

                    if (energia > 0) {
                        restarEnergia(10);
                    } else if (energia < 0) {
                        energia = 0;
                    } else if (energia == 0) {
                        restarUnaVida();
                        energia = 1;
                    }

                }

                break;
            case 2:
                if (energia > 1) {
                    restarEnergia(10);
                } else if (energia < 1) {
                    energia = 1;
                }

                break;
            case 3:
                while (vidas > 0) {

                    if (energia > 0) {
                        restarEnergia(10);
                    } else if (energia < 0) {
                        energia = 0;
                    } else if (energia == 0) {
                        restarUnaVida();
                        energia = 1;
                    }

                }

                break;
            case 4:
                int probabilidad = (int) (Math.random() * 21);

                if (energia > 1) {
                    energia = energia - probabilidad;
                }

                break;
            case 5:
                if (energia > 20) {
                    jugar();
                    perro.jugar();
                }

                break;
            default:

        }
    }
}
