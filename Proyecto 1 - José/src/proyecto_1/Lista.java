/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_1;

public class Lista {
    private Nodo pFirst;
    private Nodo pLast;
    private NodoLista p2first; //apuntador al primer nodo de Nodolista
    private NodoLista p2Last; //apuntador al nodo final de Nodolista
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
            this.getpLast().setPnext(info);
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
        
//    public String mostrarProductos() {
//        String aux="";
//        NodoLista auxiliar= this.getP2first();
//        for (int i = 0; i < getSize(); i++) {
//            System.out.println("Almacen " + auxiliar.getVert().getName() + ": \n" + auxiliar.getVert().getData() + "\n");
//        }
//        return aux;
//    }
   

//Métodos para mostrar los almacenes
    
    public String print() {
        String aux = "";
        if (!isEmpty()) {
            Nodo nodoAux = this.getpFirst();
            while (nodoAux != null) {
                aux += nodoAux.getName() + " " + nodoAux.getDato()+ "\n"; //getexistencias reemplazado por getDato
                nodoAux = nodoAux.getPnext();
            }
            return aux;
        }
        return "";
    }

    public String printProducts() {
        String aux = "";

        NodoLista nodoAux = this.getP2first();
        while (nodoAux != null) {
            aux += "Almacen" + " " + nodoAux.getVert().getName();
            nodoAux = nodoAux.getNext();
        }
        return aux;
    }
}
