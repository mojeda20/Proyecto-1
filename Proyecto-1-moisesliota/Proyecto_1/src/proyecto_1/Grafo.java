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
    
    //Atributos de la clase
    private boolean dirigido;
    private int maxNodos;
    private int numVertices;
    private ListaSimple list_ady [];
    
    //Constructores de la clase 
    public Grafo(boolean d) {
        this.maxNodos = this.numVertices = 0;
        this.dirigido = d;
    }
    
    public Grafo(int n, boolean d) {
        this.maxNodos = n;
        this.numVertices = 0;
        this.dirigido = d;
        this.list_ady = new ListaSimple[n];
    }
    
    public void imprimirGrafo(){
        for (int i = 0; i < numVertices; i++) {
            System.out.println("Vertice" + i + ": ");
            list_ady[i].mostrar();
        }
    }
    
    public void insertarArista(int i, Object j){
        if(i >= numVertices){
            System.out.println("Error, no exise el vertice del grafo");
        }else{
            list_ady[i].InsertarFinal(j);
        }
    }
    
    public void insertarVertice(int n){
        if(n >(maxNodos - numVertices)){
            System.out.println("Se supera el numero de nodos maximo del grafo");
        }else{
            for (int i = numVertices; i < numVertices + n; i++) {
                list_ady[i] = new ListaSimple();
                numVertices += n;
            }
        }
    }
}
