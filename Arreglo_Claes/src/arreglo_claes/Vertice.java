/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglo_claes;

/**
 *
 * @author moise
 */
public class Vertice {
    private String name;
    private ListaSimple products;
    private int numVert;
    private boolean fueVisitado;
    
    public Vertice(String name) {
        this.name = name;
        this.products = new ListaSimple();
        numVert = -1;
        this.fueVisitado = false;
    }
    
    public Vertice(String name, ListaSimple data) {
        this.name = name;
        this.products = data;
        numVert = -1;
        this.fueVisitado = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListaSimple getProducts() {
        return products;
    }

    public void setProducts(ListaSimple products) {
        this.products = products;
    }

    public int getNumVert() {
        return numVert;
    }

    public void setNumVert(int numVert) {
        this.numVert = numVert;
    }

    public boolean isFueVisitado() {
        return fueVisitado;
    }

    public void setFueVisitado(boolean fueVisitado) {
        this.fueVisitado = fueVisitado;
    } 
}
