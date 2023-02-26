/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_1;

import java.util.Arrays;

/**
 *
 * @author moise
 */
public class Vertice {
    private String name;
    private ListaSimple element;
    private int numVertice;
    private boolean fueVisitado;

    public Vertice(String name, int cantElement) {
        this.name = name;
        this.element = new ListaSimple();
        this.numVertice = -1;
        this.fueVisitado = false;
    }
    
    public Vertice(String name, ListaSimple element) {
        this.name = name;
        this.element = element;
        this.numVertice = -1;
        this.fueVisitado = false;
    } 
    
    public Vertice(String name) {
        this.name = name;
        this.element = null;
        this.numVertice = -1;
        this.fueVisitado = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListaSimple getElement() {
        return element;
    }

    public void setElement(ListaSimple element) {
        this.element = element;
    }

    public int getNumVertice() {
        return numVertice;
    }

    public void setNumVertice(int numVertice) {
        this.numVertice = numVertice;
    }
    
    public boolean equals(Vertice n) {
        return name.equals(n.name);
    }
    
    public void asigVertice(int n){
        numVertice = n;
    }
    
    public boolean isFueVisitado() {
        return fueVisitado;
    }

    public void setFueVisitado(boolean fueVisitado) {
        this.fueVisitado = fueVisitado;
    }

    @Override
    public String toString() {
        return "Vertice{" + "name=" + name + ", element: " + element.Transformar() + ", numVertice=" + numVertice + '}';
    } 
}
