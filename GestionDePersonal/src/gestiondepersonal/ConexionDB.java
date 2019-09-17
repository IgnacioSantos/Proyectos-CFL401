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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Programación
 */
public class ConexionDB {

    private String ip;
    private int puerto;
    private String baseDeDatos;
    private String usuario;
    private String contrasenia;
    private Connection conexion;
    private Statement flujoConexion;

    public ConexionDB(String ip, int puerto, String baseDeDatos, String usuario, String contrasenia) throws IOException, SQLException {
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

    public void crearTabla(String tabla, String columna) throws SQLException {
        flujoConexion.execute("CREATE TABLE IF NOT EXISTS " + tabla + "(" + columna + ");");
    }

    public ResultSet consultar(String consulta) throws SQLException {
        return flujoConexion.executeQuery("SELECT * FROM accesos;");
    }

    public void insertar(String tabla, String columnas, String valores, String condiciones) throws SQLException {
        if (columnas == null) {
            flujoConexion.execute("INSERT INTO " + tabla + " VALUES(" + valores + ")" + condiciones + ");");
        } else {
            flujoConexion.execute("INSERT INTO " + tabla + " (" + columnas + ") VALUES(" + valores + ")" + condiciones + ");");
        }
    }

    public int actualizar(String tabla, String valoresNuevos, String condicion) throws SQLException {
        return flujoConexion.executeUpdate("UPDATE " + tabla + " SET " + valoresNuevos + " WHERE " + condicion + ";");
    }

    public void cerrarConexion() throws SQLException {
        if (flujoConexion != null) {
            flujoConexion.close();

        }

        if (conexion != null) {
            conexion.close();
        }

    }
}
