/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_1;

/**
 *
 * @author valery
 */
public class Lista {
    
    private Nodo pFirst;
    private Nodo pLast;
    private NodoLista p2first;
    private NodoLista p2Last;
    private int size;
    
    

    public Lista() {
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;
    }

    public Nodo getpFirst() {
        return pFirst;
    }

    public void setpFirst(Nodo pFirst) {
        this.pFirst = pFirst;
    }

    public Nodo getpLast() {
        return pLast;
    }

    public void setpLast(Nodo pLast) {
        this.pLast = pLast;
    }

    public NodoLista getP2first() {
        return p2first;
    }

    public void setP2first(NodoLista p2first) {
        this.p2first = p2first;
    }

    public NodoLista getP2Last() {
        return p2Last;
    }

    public void setP2Last(NodoLista p2Last) {
        this.p2Last = p2Last;
    }


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    
    
    public boolean isEmpty(){
        return this.getpFirst()== null;
    }
    
    public boolean isEmptyNL(){
        return this.getP2first()==null;
    }
    
    //Para este método de insertar se utiliza la clase Nodo
    
    public void Insertar(Nodo info) {
        if (isEmpty()) {
            this.setpFirst(info);
            this.setpLast(info);
    
        } else {
            this.getpLast().setpNext(info);
            this.setpLast(info);
        }
        size++;
    
    }
    
    //Para este método de insertar se utiliza la clase NodoLista
        public void insertar_nl(NodoLista info) {
        if (isEmpty()) {
            this.setP2first(info);
            this.setP2Last(info);
        } else {
            this.getP2Last().setNext(info);
            this.setP2Last(info);
        }
        setSize(getSize() + 1);
    }
    
}
