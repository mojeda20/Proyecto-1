/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

public class Dijkstra {
    private int [][] distances;
    private int [] last;
    private int [] minorDist;
    private boolean[] vertices;
    private int origin;
    private int numVert;

    public Dijkstra(Grafo grafo, int origin) {
        this.distances = grafo.getMatAd();
        this.last = new int[numVert];
        this.minorDist = new int[numVert];
        this.vertices = new boolean[numVert];
        this.origin = origin;
        this.numVert = grafo.getNumVerts();
    }
    
    public void shorterPath(){
        for (int i = 0; i < numVert; i++) {
            vertices[i] = false;
            minorDist[i] = distances[origin][i];
            last[i] = origin;
        }
        vertices[origin] = true;
        minorDist[origin] = 0;
        for (int i = 0; i < numVert; i++) {
            int v = minimum(); /* selecciona vértice no marcado de menor distancia */
            vertices[v] = true;
            for (int j = 0; j < numVert; j++) {
                if (!vertices[j]){
                    if ((minorDist[v]+distances[v][j]) < minorDist[j]){
                        minorDist[j] = minorDist[v] + distances[v][j];
                        last[j] = v;
                    }
                }
            }
        }
    }
    
    public int minimum(){ /*Retorna el vértice con el camino más corto*/
        int mx = 10000;
        int v = 1;
        for (int i = 0; i < numVert; i++) {
            if (!vertices[i] && (minorDist[i] <= mx)){
                mx = minorDist[i];
                v = i;
            }      
        }
        return v;
    }
    
    
    public void path(int v){ /*Recibe como parámetro el vector al que se quiere ir*/
        int previous = last[v];
        if (v != origin){
            path(previous);
            System.out.print("--> V" + v);
        } else{
            System.out.print("V" + origin);
        }
    }  
}
