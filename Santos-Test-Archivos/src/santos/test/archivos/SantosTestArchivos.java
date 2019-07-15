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
    
    private static VentanaLogin ventana;
    private static Ventana ventana2;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*agregarArchivoTexto();
        leerArchivoTexto();
        VentanaLogin ventana = new VentanaLogin();//creamos un objeto del tipo de dato (VentanaLogin)
        Ventana ventana2 = new Ventana();*/

        //ventana.setVisible(true);//hacemos que se muestre al usuario ya que debe tener un valor true para eso
        //se tiene que agregar /** y terminar con*/ para hacer la documentacion de la funcion de cada clase
        //ventana2.setVisible(true);
        /*Testeo test = new Testeo();
        Testeo test2 = new Testeo();
        test.setApellido("firu");
        test2.setApellido("LG");
        
        System.out.println(test.getApellido());
        System.out.println(test2.getApellido());
        
        test.setApellido("firu");
        
        System.out.println(test.getApellido());
        System.out.println(test2.getApellido());*/
 /*Testeo.setApellido("Loco");//le asignamos a la clases sea public static
        
        System.out.println(Testeo.getApellido());*/
        mostrarLogin();
        
    }
    
    private static void agregarArchivoTexto() {
        FileWriter file = null;//la clase que va a conectarse con el archivo dentro del parentesis puede haber (ruta al archivo,sobreescribir)-("texto.txt",false)
        PrintWriter escritor = null;
        try {
            file = new FileWriter("texto.txt", false);//tener las conexiones true sobreescribe el archivo si es false lo borra el contenido y empieza de nuevo
            escritor = new PrintWriter(file);//se tiene que pasar por parentesis el enlace
            escritor.println("Hola");//mandamos una escritura en string
            //escritor.print("edad:");
            //escritor.print(JOptionPane.showInputDialog(null, "escribi algo");
            escritor.flush();//generara una memoria llamada Buffer y lo graba en el archivo
            escritor.close();//hace que el programa cierre
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    
    private static void leerArchivoTexto() {
        FileReader file = null;//genera un archivo
        BufferedReader lector = null;//leera el archivo

        try {
            file = new FileReader("users.txt");//encuentra un archivo y lo tratara de leerlo e interpretarlo
            lector = new BufferedReader(file);//generara una memoria llamada Buffer y lo graba en el PC
            String texto = lector.readLine();//le asignamos una variable e inicialezamos para su lectura

            while (texto != null) {//cuando es distinto a null seguira mostrando el contenido que tiene el texto
                //System.out.println(texto);
                System.out.println(texto.split(";;;")[0]);//separa los contenidos en base a su especificacion dentro de los (" ")
                System.out.println(texto.split(";;;")[1] + "\n");//tambien se transforma en un array de string
                texto = lector.readLine();
                /*
                try{
                String[] tp;
                String texto = lector.readLine();
                
                while (texto!=null){
                
                tp = texto.split(";;;");
                System.out.println(tp [0]);
                System.out.println(tp [1]+"\n");
                texto = texto.readLine();
                }
                }catch(IOExeption ex){
                
                }
                 */
            }
            lector.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    /**
     * el metodo mostraLogin va a mostrar una ventana para hacer Login.
     */
    public static void mostrarLogin() {
        ventana = new VentanaLogin();//creamos un objeto del tipo de dato (VentanaLogin)
        ventana.setVisible(true);
        
    }
    
    public static void mostrarVentanaPrincipal() {
        ventana.setVisible(false);
        ventana2 = new Ventana();
        ventana2.setVisible(true);
    }
}
