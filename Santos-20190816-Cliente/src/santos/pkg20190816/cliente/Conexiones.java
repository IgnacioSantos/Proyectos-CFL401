/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santos.pkg20190816.cliente;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Programación
 */
public class Conexiones {
    private final int PUERTO = 3232;
    private final String ip = "localhost";
    protected ServerSocket serverSocket;
    protected Socket clienteSocket;
    protected DataInputStream entrada;
    protected DataOutputStream salida;
    
    
    public Conexiones(String tipo) throws IOException{
        if (tipo.equals("servidor")){
        
        serverSocket =new ServerSocket(PUERTO);
        clienteSocket=new Socket();
        
        }else{
            clienteSocket = new Socket(ip,PUERTO);
        }
    }
}
