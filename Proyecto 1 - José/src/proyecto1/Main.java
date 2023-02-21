/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

/**
 *
 * @author Usuario
 */
public class Main {

    public static void main(String[] args) throws Exception {
        Grafo grafo = new Grafo (5);
        Vertice a = new Vertice("A");
        Vertice b = new Vertice("B");
        Vertice c = new Vertice("C");
        Vertice d = new Vertice("D");
        Vertice e = new Vertice("E");
        
        grafo.nuevoVertice(a);
        grafo.nuevoVertice(b);
        grafo.nuevoVertice(c);
        grafo.nuevoVertice(d);
        grafo.nuevoVertice(e);
        
        grafo.nuevoArco(a, b, 10);
        grafo.nuevoArco(a, c, 20);
        grafo.nuevoArco(a, d, 25);
        grafo.nuevoArco(b, c, 5);
        
//        PARA USAR EL DIJKSTRA DE Example
        Dijkstra2 caminito = new Dijkstra2();
        caminito.dijks(grafo);
	caminito.infin(grafo.getNumVerts());
	caminito.dijks1(grafo.getNumVerts());
	caminito.Imprime(grafo.getNumVerts());
        caminito.Path(2);
          
    }
    
}
