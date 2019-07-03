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
Mascotas mascotas;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        
        ArrayList elem = new ArrayList();
        Scanner teclado = new Scanner(System.in);
        ArrayList <Integer> elem2 = new ArrayList();
        ArrayList <Mascotas> mascotas = new ArrayList();//se genera una variable de tipo de dato mascotas en un arreglo del tipo de dato
        Mascotas perro1 = new Mascotas("Tory",4,22);//new creas un nuevo objeto de atributos para el elemento
        Mascotas gato1 = new Mascotas("Mish",3,10);
        Mascotas loro1 = new Mascotas("Poly",2,25);
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
            
            /*try{
                numero = teclado.nextInt();
                System.out.println(numero);
            }catch (Exception e){
                System.out.println("No ingresaste un numero");
            }*/
            
            mascotas.add(perro1);
            
            System.out.println(mascotas);//solo con el nombre del objeto mostrara una posicion en la memoria
            
            mascotas.add(gato1);
            mascotas.add (loro1);
            
            System.out.println(mascotas);//al agregar varias mascotas se muestra las posiciones que tiene cada tipo de dato
            
            
            
    }
    
}
