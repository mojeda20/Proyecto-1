/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_1;

/**
 *
 * @author moise
 */
public class Grafo {
    
    //Atributos de la clase grafo
    private ListaSimple vertices;
    private ListaSimple lista_ady;
    
    //Constructores de la Clase Grafo
    public Grafo() {
        this.vertices = new ListaSimple();
        this.lista_ady = new ListaSimple();
    }

    public Grafo(ListaSimple vertices, ListaSimple lista_ady) {
        this.vertices = vertices;
        this.lista_ady = lista_ady;
    }
    
    public void insertarElemento(Object dato){
        Vertice new_vertice = new Vertice(dato);
        vertices.InsertarFinal(new_vertice);
    }
}
