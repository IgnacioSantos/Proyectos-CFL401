/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santos.test.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Programación
 */
public class SantosTestArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        
        ArrayList elem = new ArrayList();
        Scanner teclado = new Scanner(System.in);
        ArrayList <Integer> elem2 = new ArrayList();
        boolean bandera = true;
        int numero;
        
        
        
        elem.add("Perro");
        elem.add(4);
        elem.add(7);
        
        System.out.println(elem);
        
        /*while (bandera){
        
        numero = teclado.nextInt();
        
            if (numero>=0) {
                elem2.add(numero);
            }else{
                bandera =!bandera;
            }
        }
            System.out.println(elem2);*/
            
            try{
                numero = teclado.nextInt();
                System.out.println(numero);
            }catch (Exception e){
                System.out.println("No ingresaste un numero");
            }
    }
    
}
