/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santos.test.archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Programación
 */
public class SantosTestArchivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        agregarArchivoTexto();
        leerArchivoTexto();
        
    }
    
    private static void agregarArchivoTexto(){
        FileWriter file = null;
        PrintWriter escritor = null;
        try {
            file = new FileWriter("texto.txt",false);//tener las conexiones true sobreescribe el archivo si es false lo borra el contenido y empieza de nuevo
            escritor = new PrintWriter(file);
            escritor.println("Hola");
            escritor.flush();//generara una memoria llamada Buffer y lo graba en el archivo
            escritor.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
         
    }
    
    private static void leerArchivoTexto(){
        FileReader file = null;
        BufferedReader lector = null;
        
        try{
            file = new FileReader("users.txt");
            lector = new BufferedReader(file);//generara una memoria llamada Buffer y lo graba en el PC
            String texto = lector.readLine();//le asignamos una variable e inicialezamos para su lectura
            
            while(texto!=null){//cuando es distinto a null seguira mostrando el contenido que tiene el texto
                System.out.println(texto.split(";;;")[0]);//separa los contenidos en base a su especificacion dentro de los (" ")
                System.out.println(texto.split(";;;")[1]);//tambien se transforma en un array de string
                texto = lector.readLine();
            }
            lector.close();
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
