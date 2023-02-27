/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_1;

/**
 *
 * @author Usuario
 */
public class Nodo {
    private String name;
    private Object dato; //Variable donde se guardará el valor
    private Nodo pnext; //Variable para enlazar los nodos
//    private int exist;
    //Constructor vacio
    public Nodo(){
        
    }
    
    //Constructor de la clase nodo si le paso solo la info
    public Nodo(Object dato, String name) {
        this.dato = dato;
        this.pnext = null;
        this.name= name;
//        this.exist= exist;
    }

    Nodo(Object dato) {
        this.dato = dato;
    }
    
    
   
    //Metodos get y set para los atrubutos
    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public Nodo getPnext() {
        return pnext;
    }

    public void setPnext(Nodo pnext) {
        this.pnext = pnext;
    } 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public int getExist() {
//        return exist;
//    }
//
//    public void setExist(int exist) {
//        this.exist = exist;
//    }
}
