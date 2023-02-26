/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_1;

/**
 *
 * @author valery
 */
public class NodoLista {
    private Vertice vert;
    private NodoLista next;

    public NodoLista(Vertice vert) {
        this.vert = vert;
        this.next = null;
    }

    public Vertice getVert() {
        return vert;
    }

    public void setVert(Vertice vert) {
        this.vert = vert;
    }

    public NodoLista getNext() {
        return next;
    }

    public void setNext(NodoLista next) {
        this.next = next;
    }
    
    
    
    
}
