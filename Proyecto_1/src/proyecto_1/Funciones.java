/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_1;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author moise
 */
public class Funciones {
    
//    public void crearGrafo(String txt, Grafo grafo){        
//        String[] info = txt.split("&");
//        
//        String[] info_almacenes = info[1].split(";");
//        
//        for (int i = 0; i < info_almacenes.length-1; i++) {
//            String[] almacen = info_almacenes[i].split(":");
//            String nombre = "";
//            for (int j = 1; j < almacen.length; j++) {
//                    String[] productos = almacen[j].split("\n");
//                    Stock_produc[] stock = new Stock_produc[productos.length];
//                    for (int k = 0; k < productos.length; k++) {
//                        String[] info_produc = productos[k].split(",");
//                        Stock_produc stock1 = new Stock_produc(info_produc[0], Integer.parseInt(info_produc[1]));
//                        stock[k] = stock1;
//                    }
////                    Vertice v = new Vertice(nombre, stock);
//                    grafo.nuevoVertice(v);
//            }
//        }
//        
//        grafo.getNumVerts();
//        
//    }
    
    public Grafo uploadGrafo(String archivo) {
        Grafo matriz = new Grafo();
        String txt = archivo;

        if (!"".equals(txt) && !txt.isEmpty()) {
            String[] txtSplit = txt.split("Rutas;");

            for (int i = 0; i < txtSplit.length; i++) {

                if (txtSplit[i].contains(";") && !txt.isEmpty()) {
                    String[] almacenes = txtSplit[i].split(";");
                    for (int j = 0; j < almacenes.length; j++) {
                        if (almacenes[j].contains(":")) {
                            ListaSimple lista = new ListaSimple();
                            String[] almacen = almacenes[j].split("\n");
                            for (int k = 0; k < almacen.length; k++) {

                                if (k > 1) {
                                    String[] productos = almacen[k].split(",");

                                    Stock_produc stock = new Stock_produc(productos[0], Integer.parseInt(productos[1]));
                                    lista.InsertarFinal(stock);
                                }

                            }
                            String[] a = almacen[1].split(" ");
                            String b = a[1].replace(":", "");
                            Vertice vertice = new Vertice(b, lista);
                            matriz.nuevoVertice(vertice);
                        }

                    }
                }
            }
            String[] rutas = txtSplit[1].split("\n");
            for (int i = 0; i < rutas.length; i++) {
                if (i > 0) {
                    String[] ruta = rutas[i].split(",");

                    matriz.newEdge(ruta[0], ruta[1], Integer.parseInt(ruta[2]));
                }
            }

        }

        return matriz;
    }
}
