/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_1;

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
