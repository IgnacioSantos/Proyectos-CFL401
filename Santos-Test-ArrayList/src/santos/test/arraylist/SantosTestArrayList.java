/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santos.test.arraylist;

import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.Iterator;
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
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hola Mundo");
        
        ArrayList elem = new ArrayList();
        Scanner teclado = new Scanner(System.in);
        ArrayList <Integer> elem2 = new ArrayList();
        ArrayList <Mascotas> mascotas = new ArrayList();//se genera una variable de tipo de dato mascotas en un arreglo del tipo de dato
        Mascotas perro1 = new Mascotas("Tory",4,22);//new creas un nuevo objeto de atributos para el elemento
        Mascotas gato1 = new Mascotas("Mish",3,10);
        Mascotas loro1 = new Mascotas("Poly",2,25);
        boolean bandera = true; boolean bandera2 = true;
        int numero;
        String nombre;
        int patas,edad;
        
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
            
            mascotas.add(new Mascotas("Tory",4,22));//genera un nuevo elemento para colocarlo en la memoria
            
            System.out.println(mascotas);//solo con el nombre del objeto mostrara una posicion en la memoria
            
            mascotas.add(new Mascotas("Mish",3,10));
            mascotas.add(new Mascotas("Poly",2,25));
            
            System.out.println(mascotas);//al agregar varias mascotas se muestra las posiciones que tiene cada tipo de dato
            
            while (bandera2) {
            
                System.out.println("Ingrese el nombre de la mascota o ingrese salir para cerrar el programa: ");
                nombre = teclado.nextLine();
                if (nombre.equals("Salir")||nombre.equals("salir")) {
                    bandera2 = !bandera2;
                }else{
                
                    System.out.println("Ingrese la cantidad de patas que tiene: ");
                
                patas = teclado.nextInt();
                /*try{
                patas = teclado.nextInt();
                }catch(Exception e){
                    System.out.println("No ingreso un numero");
                }*/
                System.out.println("Ingrese la edad actual: ");
                edad = teclado.nextInt();
                
                mascotas.add(new Mascotas(nombre,patas,edad));
                teclado.nextLine();//siempre se le agregar para evitar saltarse el pedido de cualquier info ingresado por el usuario
                
                
                    //System.out.println(mascotas);
                    
                    
                    }
                }
            Iterator it = mascotas.iterator();
                    
                    //it.hasNext();//significa si hay un proximo elemento y esto devuelve un valor true o false
                    //it.next();//sirve para conseguir el proximo elemento
                    while (it.hasNext()) {//se puede crear variables provisorias que muere dentro del while
                        Mascotas mascota = (Mascotas) it.next();//se sugiere crear una variable auxiliar
                        
                        //System.out.println(((Mascotas) it.next()).getNombres());// la parte (mascotas) tomara el tipo de dato el it.next() lo agarra y se la asigna a getNombres()
                        
                        System.out.println(mascota.getNombres()+" "+mascota.getPatas()+" "+mascota.getEdad());
                        
        }
            /*String nombre;
            int patas,edad;
            
            nombre = teclado.nextLiine();
            
            while (!nombre.equals("salir"){// (!nombre.toUppercase().equals("salir".toUppercase()){
            patas = teclado.nextInt();
            edad = teclado.nextInt();
            mascotas.add(new Mascotas(nombre,patas,edad));
            teclado.nextLine();
            nombre = teclado.nextLine();
            }
            System.out.Println(mascotas);
            */
            
    }
    
}
