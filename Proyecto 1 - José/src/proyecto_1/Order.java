/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_1;

import javax.swing.JOptionPane;

public class Order {
    private String almacen;
    private String product;
    private int quantity;
    private Grafo grafo;

    public Order(String almacen, String product, int quantity, Grafo grafo) {
        this.almacen = almacen;
        this.product = product;
        this.quantity = quantity;
        this.grafo = grafo;
    }
    
    public Vertice searchVertice(String name){
        for (int i = 0; i < grafo.getVerts().length; i++) {
            if (grafo.getVerts()[i].getName().equals(name)){
                return grafo.getVerts()[i];
            }
        }
        JOptionPane.showMessageDialog(null, "El almacen "+name+"no existe.");
        return null;
    }
    
//    public Stock_produc searchProduct(Vertice almacen, String nameProduct){
//        ListaSimple productos = almacen.getElement();
//        
//    }
    
    public void showProduct(Grafo grafo){
        for (int i = 0; i < grafo.getNumVerts(); i++) {
            grafo.vertice(i).getElement().Transformar();
            
        }
    }
}
