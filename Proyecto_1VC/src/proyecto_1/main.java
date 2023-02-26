/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_1;

import Ventanas.Principal;
import java.util.Arrays;

/**
 *
 * @author moise
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        //Principal v1 = new Principal();
        //v1.setVisible(true);

        
        Grafo grafo = new Grafo(5);

        String nombre_v1 = "A";
        
        Stock_produc p1 = new Stock_produc("RAM",4);
        Stock_produc p2 = new Stock_produc("Pantalla",1);
        Stock_produc p3 = new Stock_produc("Memoria",2);
        
        Stock_produc[] arreglo = new Stock_produc[3];
        arreglo[0] = p1;
        arreglo[1] = p2;
        arreglo[2] = p3;     
        Vertice v1 = new Vertice(nombre_v1, arreglo);
        
        //Segundo Vertice
        String nombre_v2 = "B";
        
        Stock_produc p_1 = new Stock_produc("Audifonos",5);
        Stock_produc p_2 = new Stock_produc("Microfonos",2);
        
        Stock_produc[] arreglo1 = new Stock_produc[2];
        arreglo[0] = p_1;
        arreglo[1] = p_2;
        Vertice v2 = new Vertice(nombre_v2, arreglo1);
        
        //Tercer Vertice
        String nombre_v3 = "C";
        
        Stock_produc p_0 = new Stock_produc("Audifonos",5);
        
        Stock_produc[] arreglo2 = new Stock_produc[1];
        arreglo2[0] = p_0;
        
        Vertice v3 = new Vertice(nombre_v3, arreglo2);

        
        //Añadir vertices al grafo
        grafo.nuevoVertice(v1);
        grafo.nuevoVertice(v2);
        grafo.nuevoVertice(v3);

        grafo.nuevoArco(v1, v2,15);
        grafo.nuevoArco(v3, v2, 30);
        grafo.nuevoArco(v1, v3, 45);
        
    }
    
}
