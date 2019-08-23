/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santos.pkg20190816.servidor;

import java.io.IOException;

/**
 *
 * @author Programación
 */
public class Santos20190816Servidor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        Server servidor = new Server();
        
        servidor.procesar();
        servidor.cerrar();
    }
    
}
