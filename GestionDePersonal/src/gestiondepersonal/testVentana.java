/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiondepersonal;

import java.awt.Color;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author Programación
 */
public class testVentana extends javax.swing.JFrame {

    /**
     * Creates new form testVentana
     */
    public testVentana() {
        initComponents();
        apellido.setEnabled(Boolean.FALSE);
        apellido.setEditable(Boolean.FALSE);
        id.setEnabled(Boolean.FALSE);
        id.setEditable(Boolean.FALSE);
        nombre.setEnabled(Boolean.FALSE);
        nombre.setEditable(Boolean.FALSE);
        columnas.setEnabled(Boolean.FALSE);
        columnas.setEditable(Boolean.FALSE);
        nomTablaCrear.setEnabled(Boolean.FALSE);
        nomTablaCrear.setEditable(Boolean.FALSE);
        nomTablaIngresar.setEnabled(Boolean.FALSE);
        nomTablaIngresar.setEditable(Boolean.FALSE);
        nomTablaExiste.setEnabled(Boolean.FALSE);
        nomTablaExiste.setEditable(Boolean.FALSE);
        nomTablaBorrar.setEnabled(Boolean.FALSE);
        nomTablaBorrar.setEditable(Boolean.FALSE);
        nomTablaActualizar.setEnabled(Boolean.FALSE);
        nomTablaActualizar.setEditable(Boolean.FALSE);
        btnCrear.setEnabled(Boolean.FALSE);
        btnBorrar.setEnabled(Boolean.FALSE);
        btnActualizar.setEnabled(Boolean.FALSE);
        btnExiste.setEnabled(Boolean.FALSE);
        btnIngresar.setEnabled(Boolean.FALSE);
        estadoActual.setForeground(Color.RED);

    }

    public JTextField getApellido() {
        return apellido;
    }

    public void setApellido(JTextField apellido) {
        this.apellido = apellido;
    }

    public JButton getBtnActualizar() {
        return btnActualizar;
    }

    public void setBtnActualizar(JButton btnActualizar) {
        this.btnActualizar = btnActualizar;
    }

    public JButton getBtnBorrar() {
        return btnBorrar;
    }

    public void setBtnBorrar(JButton btnBorrar) {
        this.btnBorrar = btnBorrar;
    }

    public JButton getBtnConectar() {
        return btnConectar;
    }

    public void setBtnConectar(JButton btnConectar) {
        this.btnConectar = btnConectar;
    }

    public JButton getBtnCrear() {
        return btnCrear;
    }

    public void setBtnCrear(JButton btnCrear) {
        this.btnCrear = btnCrear;
    }

    public JButton getBtnExiste() {
        return btnExiste;
    }

    public void setBtnExiste(JButton btnExiste) {
        this.btnExiste = btnExiste;
    }

    public JButton getBtnIngresar() {
        return btnIngresar;
    }

    public void setBtnIngresar(JButton btnIngresar) {
        this.btnIngresar = btnIngresar;
    }

    public JTextField getColumnas() {
        return columnas;
    }

    public void setColumnas(JTextField columnas) {
        this.columnas = columnas;
    }

    public JTextField getId() {
        return id;
    }

    public void setId(JTextField id) {
        this.id = id;
    }

    public JTextField getNomTablaActualizar() {
        return nomTablaActualizar;
    }

    public void setNomTablaActualizar(JTextField nomTablaActualizar) {
        this.nomTablaActualizar = nomTablaActualizar;
    }

    public JTextField getNomTablaBorrar() {
        return nomTablaBorrar;
    }

    public void setNomTablaBorrar(JTextField nomTablaBorrar) {
        this.nomTablaBorrar = nomTablaBorrar;
    }

    public JTextField getNomTablaCrear() {
        return nomTablaCrear;
    }

    public void setNomTablaCrear(JTextField nomTablaCrear) {
        this.nomTablaCrear = nomTablaCrear;
    }

    public JTextField getNomTablaExiste() {
        return nomTablaExiste;
    }

    public void setNomTablaExiste(JTextField nomTablaExiste) {
        this.nomTablaExiste = nomTablaExiste;
    }

    public JTextField getNomTablaIngresar() {
        return nomTablaIngresar;
    }

    public void setNomTablaIngresar(JTextField nomTablaIngresar) {
        this.nomTablaIngresar = nomTablaIngresar;
    }

    public JTextField getNombre() {
        return nombre;
    }

    public void setNombre(JTextField nombre) {
        this.nombre = nombre;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        apellido = new javax.swing.JTextField();
        btnCrear = new javax.swing.JButton();
        textoInforme = new javax.swing.JLabel();
        nomTablaCrear = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        nomTablaActualizar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        nomTablaBorrar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnIngresar = new javax.swing.JButton();
        nomTablaIngresar = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        columnas = new javax.swing.JTextField();
        btnExiste = new javax.swing.JButton();
        nomTablaExiste = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        estadoActual = new javax.swing.JLabel();
        btnConectar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("testventana");

        jLabel2.setText("id:");

        jLabel3.setText("nombre:");

        jLabel4.setText("apellido:");

        btnCrear.setText("Crear");
        btnCrear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCrearMouseClicked(evt);
            }
        });

        textoInforme.setText("texto de informe");

        jLabel6.setText("Tabla:");

        jLabel7.setText("Tabla:");

        jLabel8.setText("Tabla:");

        btnActualizar.setText("Actualizar");
        btnActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizarMouseClicked(evt);
            }
        });

        btnBorrar.setText("Borrar");
        btnBorrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBorrarMouseClicked(evt);
            }
        });

        btnIngresar.setText("Ingresar");
        btnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIngresarMouseClicked(evt);
            }
        });

        jLabel9.setText("Tabla:");

        btnExiste.setText("Existe");
        btnExiste.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExisteMouseClicked(evt);
            }
        });

        jLabel10.setText("Tabla:");

        estadoActual.setText("Desconectado");

        btnConectar.setText("Conectar");
        btnConectar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConectarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(apellido))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(textoInforme, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nomTablaCrear))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nomTablaActualizar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nomTablaBorrar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nomTablaIngresar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nomTablaExiste, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnActualizar)
                                    .addComponent(btnBorrar)
                                    .addComponent(btnIngresar)
                                    .addComponent(btnExiste))
                                .addGap(0, 69, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(columnas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCrear))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addComponent(btnConectar))
                            .addComponent(estadoActual))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textoInforme)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(nomTablaCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrear)
                    .addComponent(columnas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(nomTablaIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIngresar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizar)
                    .addComponent(jLabel7)
                    .addComponent(nomTablaActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBorrar)
                    .addComponent(jLabel8)
                    .addComponent(nomTablaBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExiste)
                    .addComponent(jLabel10)
                    .addComponent(nomTablaExiste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estadoActual)
                    .addComponent(btnConectar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExisteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExisteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExisteMouseClicked

    private void btnBorrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBorrarMouseClicked

    private void btnActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarMouseClicked

    private void btnIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIngresarMouseClicked

    private void btnCrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCrearMouseClicked

    private void btnConectarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConectarMouseClicked
        if (estadoActual.getText().equals("Desconectado")) {
            habilitar();
            if (GestionDePersonal.getConexionDb() != null) {
            //GestionDePersonal.mostrar();
                System.out.println(GestionDePersonal.getConexionDb().conectarADB());
        }else{
                
                try {
                    GestionDePersonal.setConexionDb(new ConexionDB("127.0.0.1",3306,"proyecto_test","programador","cfl401"));
                } catch (IOException | SQLException ex) {
                    Logger.getLogger(testVentana.class.getName()).log(Level.SEVERE, null, ex);
                }
                //GestionDePersonal.mostrar();
                System.out.println(GestionDePersonal.getConexionDb().conectarADB());
        }
            //
        } else {
            deshabilitar();

        }
    }//GEN-LAST:event_btnConectarMouseClicked
private void habilitar(){
    estadoActual.setText("Conectado");
            btnConectar.setText("Desconectar");
            apellido.setEnabled(Boolean.TRUE);
            apellido.setEditable(Boolean.TRUE);
            id.setEnabled(Boolean.TRUE);
            id.setEditable(Boolean.TRUE);
            nombre.setEnabled(Boolean.TRUE);
            nombre.setEditable(Boolean.TRUE);
            columnas.setEnabled(Boolean.TRUE);
            columnas.setEditable(Boolean.TRUE);
            nomTablaCrear.setEnabled(Boolean.TRUE);
            nomTablaCrear.setEditable(Boolean.TRUE);
            nomTablaIngresar.setEnabled(Boolean.TRUE);
            nomTablaIngresar.setEditable(Boolean.TRUE);
            nomTablaExiste.setEnabled(Boolean.TRUE);
            nomTablaExiste.setEditable(Boolean.TRUE);
            nomTablaBorrar.setEnabled(Boolean.TRUE);
            nomTablaBorrar.setEditable(Boolean.TRUE);
            nomTablaActualizar.setEnabled(Boolean.TRUE);
            nomTablaActualizar.setEditable(Boolean.TRUE);
            btnCrear.setEnabled(Boolean.TRUE);
            btnBorrar.setEnabled(Boolean.TRUE);
            btnActualizar.setEnabled(Boolean.TRUE);
            btnExiste.setEnabled(Boolean.TRUE);
            btnIngresar.setEnabled(Boolean.TRUE);
            estadoActual.setForeground(Color.GREEN);
}

private void deshabilitar(){
    estadoActual.setText("Desconectado");
            btnConectar.setText("Conectar");
            apellido.setEnabled(Boolean.FALSE);
            apellido.setEditable(Boolean.FALSE);
            id.setEnabled(Boolean.FALSE);
            id.setEditable(Boolean.FALSE);
            nombre.setEnabled(Boolean.FALSE);
            nombre.setEditable(Boolean.FALSE);
            columnas.setEnabled(Boolean.FALSE);
            columnas.setEditable(Boolean.FALSE);
            nomTablaCrear.setEnabled(Boolean.FALSE);
            nomTablaCrear.setEditable(Boolean.FALSE);
            nomTablaIngresar.setEnabled(Boolean.FALSE);
            nomTablaIngresar.setEditable(Boolean.FALSE);
            nomTablaExiste.setEnabled(Boolean.FALSE);
            nomTablaExiste.setEditable(Boolean.FALSE);
            nomTablaBorrar.setEnabled(Boolean.FALSE);
            nomTablaBorrar.setEditable(Boolean.FALSE);
            nomTablaActualizar.setEnabled(Boolean.FALSE);
            nomTablaActualizar.setEditable(Boolean.FALSE);
            btnCrear.setEnabled(Boolean.FALSE);
            btnBorrar.setEnabled(Boolean.FALSE);
            btnActualizar.setEnabled(Boolean.FALSE);
            btnExiste.setEnabled(Boolean.FALSE);
            btnIngresar.setEnabled(Boolean.FALSE);
            estadoActual.setForeground(Color.RED);
            
}
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(testVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(testVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(testVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(testVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new testVentana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellido;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnConectar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnExiste;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JTextField columnas;
    private javax.swing.JLabel estadoActual;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nomTablaActualizar;
    private javax.swing.JTextField nomTablaBorrar;
    private javax.swing.JTextField nomTablaCrear;
    private javax.swing.JTextField nomTablaExiste;
    private javax.swing.JTextField nomTablaIngresar;
    private javax.swing.JTextField nombre;
    private javax.swing.JLabel textoInforme;
    // End of variables declaration//GEN-END:variables
}
