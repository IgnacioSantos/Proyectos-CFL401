/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiondepersonal;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Programación
 */

public class Conexiones {
    private String ip;
    private int puerto;
    private String baseDeDatos;
    private String usuario;
    private String contrasenia;
    private Connection conexion;
    private Statement flujoConexion;
    private DataInputStream flujoEntrada;
    private DataOutputStream flujoSalida;
    
    
    
    public Conexiones(String ip,int puerto,String baseDeDatos,String usuario,String contrasenia) throws IOException, SQLException{
        this.ip = ip;
        this.puerto = puerto;
        this.baseDeDatos = baseDeDatos;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        conexion = DriverManager.getConnection("jdbc:mariadb://" + ip + ":" + puerto + "/" + baseDeDatos + "?user=" + usuario + "&password=" + contrasenia);
        flujoConexion = conexion.createStatement();
        
        
    /*    if (tipo.equals("servidor")){
        
        serverSocket =new ServerSocket(PUERTO);
        clienteSocket=new Socket();
        
        }else{
            clienteSocket = new Socket(ip,PUERTO);
        }
    }
    public BaseDeDatos(String ip, String puerto, String usuario, String contrasenia, String nombreDeBd) throws SQLException {
        this.ip = ip;
        this.puerto = puerto;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.nombreDeBd = nombreDeBd;
        conexion = DriverManager.getConnection("jdbc:mariadb://" + ip + ":" + puerto + "/" + nombreDeBd + "?user=" + usuario + "&password=" + contrasenia);
        consultor = conexion.createStatement();
    }
    */
    }   
}
