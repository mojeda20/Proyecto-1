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
    private Object[] element;
    private int numVertice;
    private Lista info;
    private boolean visitado;
    
    
    public Vertice(String name, Lista info){
        this.name= name;
        this.info= info;
        numVertice= -1;
        this.visitado= false;
    }

    public Vertice(String name, int cantElement) {
        this.name = name;
        this.element = new Object[cantElement];
        this.numVertice = -1;
        this.visitado= false;

    }
    
    public Vertice(String name, Object[] element) {
        this.name = name;
        this.element = element;
        this.numVertice = -1;
        this.visitado= false;

    } 

    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }
    
    
    
    public Vertice(String name) {
        this.name = name;
        this.element = null;
        this.numVertice = -1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object[] getElement() {
        return element;
    }

    public void setElement(Object[] element) {
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

    @Override
    public String toString() {
        return "Vertice{" + "name=" + name + ", element" + Arrays.toString(element) + ", numVertice=" + numVertice + '}';
    }
    
    
}
