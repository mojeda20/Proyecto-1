/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

import static Ventanas.Principal.func;
import static Ventanas.Principal.matriz;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import proyecto_1.Funciones;
import proyecto_1.Grafo;
import proyecto_1.ListaSimple;
import proyecto_1.Stock_produc;
import proyecto_1.Vertice;
import proyecto_1.helpers;

/**
 *
 * @author moise
 */
public class Cargar_Datos extends javax.swing.JFrame {

    public static Principal v1;

    public Cargar_Datos(Principal v1) {
        initComponents();
        this.v1 = v1;
        v1.setVisible(false);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TITULO_Principal = new javax.swing.JLabel();
        Ruta_Fichero = new javax.swing.JTextField();
        Buscar_Archivo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Archivo_Cargado = new javax.swing.JTextArea();
        cargar_grafo = new javax.swing.JButton();
        Volver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TITULO_Principal.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        TITULO_Principal.setText("Cargar Datos");
        jPanel1.add(TITULO_Principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));
        jPanel1.add(Ruta_Fichero, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 290, -1));

        Buscar_Archivo.setText("Buscar Archivo");
        Buscar_Archivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buscar_ArchivoActionPerformed(evt);
            }
        });
        jPanel1.add(Buscar_Archivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 110, -1));

        Archivo_Cargado.setColumns(20);
        Archivo_Cargado.setRows(5);
        jScrollPane1.setViewportView(Archivo_Cargado);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 288, 178));

        cargar_grafo.setText("Guardar");
        cargar_grafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargar_grafoActionPerformed(evt);
            }
        });
        jPanel1.add(cargar_grafo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 80, 20));

        Volver.setText("Volver");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });
        jPanel1.add(Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        this.setVisible(false);
        Principal ventana1 = new Principal();
        ventana1.setVisible(true);
    }//GEN-LAST:event_VolverActionPerformed

    private void Buscar_ArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Buscar_ArchivoActionPerformed
        //Creo el Objeto JFileChooser
        JFileChooser fc = new JFileChooser();

        //Creo el filtro
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.TXT", "txt");

        //Le indico el filtro
        fc.setFileFilter(filtro);

        //Abrimos la ventana, guardamos la op seleccionada por el usuario
        int seleccion = fc.showOpenDialog(this);

        //Si el usario presiona aceptar
        if (seleccion == JFileChooser.APPROVE_OPTION) {

            //Selecciono el fichero
            File fichero = fc.getSelectedFile();

            //Escribir la ruta del fichero
            this.Ruta_Fichero.setText(fichero.getAbsolutePath());

            try ( FileReader fr = new FileReader(fichero)) {
                String cadena = "";
                int valor = fr.read();
                while (valor != -1) {
                    cadena = cadena + (char) valor;
                    valor = fr.read();
                }
                this.Archivo_Cargado.setText(cadena);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ningún archivo.");
        }
    }//GEN-LAST:event_Buscar_ArchivoActionPerformed

    private void cargar_grafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargar_grafoActionPerformed
        String archivo_txt = Archivo_Cargado.getText();
        //Repleace pertinentes para poder realizar una funcion que descomponga en el txt
        String replace = archivo_txt.replaceAll("Rutas;", "&");
        String txt = replace.replaceAll("Almacenes;", "&");
       
        //Descomponer el txt, de aquí hasta el final será el contendio de la funcion crear grafo a partir de un txt dado
        String[] info = txt.split("&");
        
        String[] info_almacenes = info[1].split(";");
        
        Grafo grafo = new Grafo(info_almacenes.length);
        helpers help = new helpers();
//
//        //Crear el grafo
        for (int i = 0; i < info_almacenes.length - 1; i++) {
            String[] almacen = info_almacenes[i].split(":");           
            String name = almacen[0].replaceAll("\nAlmacen ", ""); //Nombre del vertice que se creará
            String[] productos = almacen[1].split("\n");           //Productos del almacen

            //Crear el arreglo de objetos que contendrá el vertice
            ListaSimple product = new ListaSimple();
            for (int j = 1; j < productos.length; j++) {
                String[] info_produc = productos[j].split(",");
                String nombre = info_produc[0];
                int cantidad = help.ValidarNumeros(info_produc[1]);

                //Crear el objeto que irá al arreglo contenido en el vertice
                Stock_produc stock1 = new Stock_produc(nombre, cantidad);

                //Agg el objeto al arreglo
                product.InsertarInicio(stock1);
            }

            //Crear el vertice con el nombre y el arreglo previamente creado
            Vertice v = new Vertice(name, product);
            //Meter el vertice en el grafo
            grafo.nuevoVertice(v);
        }
        String[] rutas = info[2].split(";");
        for (int i = 0; i < rutas.length-1; i++) {
            if (i > 0) {
                String[] ruta = rutas[i].split(",");

                grafo.newEdge(ruta[0], ruta[1], Integer.parseInt(ruta[2]));
            }
        }
//        grafo.nuevoArco(grafo.vertice(0), grafo.vertice(1), 10);
//        grafo.nuevoArco(grafo.vertice(0), grafo.vertice(2), 20);
//        grafo.nuevoArco(grafo.vertice(1), grafo.vertice(2), 5);
//        grafo.nuevoArco(grafo.vertice(1), grafo.vertice(3), 8);
//        grafo.nuevoArco(grafo.vertice(2), grafo.vertice(3), 4);
//        grafo.nuevoArco(grafo.vertice(2), grafo.vertice(4), 13);
//        grafo.nuevoArco(grafo.vertice(3), grafo.vertice(4), 3);
//        grafo.nuevoArco(grafo.vertice(4), grafo.vertice(1), 25);
        
        matriz = grafo;
        try {
            System.out.println(matriz.devolverPeso(matriz.vertice(0), matriz.vertice(1)));
        } catch (Exception ex) {
            Logger.getLogger(Cargar_Datos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cargar_grafoActionPerformed

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
            java.util.logging.Logger.getLogger(Cargar_Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cargar_Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cargar_Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cargar_Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cargar_Datos(v1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Archivo_Cargado;
    private javax.swing.JButton Buscar_Archivo;
    private javax.swing.JTextField Ruta_Fichero;
    private javax.swing.JLabel TITULO_Principal;
    private javax.swing.JButton Volver;
    private javax.swing.JButton cargar_grafo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
