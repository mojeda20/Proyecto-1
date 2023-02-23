/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

public class Dijkstra {
    int[] distances;
    int[] route;
    boolean[] visited;
    int[][]grafo;
    int origin;

    public Dijkstra(Grafo grafo, int origin) {
        this.distances = new int[grafo.getNumVerts()];
        this.route = new int[grafo.getNumVerts()];
        this.visited = new boolean[grafo.getNumVerts()];
        this.grafo = grafo.getMatAd();
        this.origin = origin-1;
    }
      
    /*Inicializa los valores de los arreglos con respecto al origen*/
    public void dijksInit(){
    	visited[this.origin] = true;
	route[this.origin] = 1;
	distances[this.origin] = 0;
    }
 
    /*Convierte la matriz de adyacencia del grafo en una matriz de pesos*/
    public void infinity(int nver){
	for (int i = 0; i < nver; i++){
	    for (int j = 0; j < nver; j++){
		if (grafo[i][j] == 0){
		   grafo[i][j] = 10000;
                }
            }
        }    
    }

    /*Retorna un entero que se refiere a una posición de los arreglos para usarlo en la función shorterPath*/
    public int indi(int nver){
        int aux = 10000;
	int in = 0;   
	for (int i = 0; i < nver; i++){ /*Inicial i = 0*/
	    if (visited[i] == false){
		if (distances[i] < aux){
		    aux = distances[i];
		    in = i;
	        }
            }
	}
	return in;
    }

   /*Determina los caminos más cortos desde el origen hacia los otros vértices*/ 
   public void shorterPath(int nver){
	int j = 0;
	int ind = 0;
        for(int i = 0; i < nver; i++){
	        visited[i] = false;
	        distances[i] = grafo[origin][i];
	        route[i] = 0;
            }
	    for (int i = 0; i < nver; i++){ /*PROBANDO || inicial = 0*/
	        ind = indi(nver);
	        if (ind != origin){ /*VALOR INICIAL = 0*/
	            visited[ind] = true;
		    for (j = 0; j < nver; j++){ /*NO CAMBIAR j = 0*/
		        if (grafo[ind][j] != 10000){
			    if (visited[j] == false){
			        if ((distances[ind] + grafo[ind][j]) < distances[j]){
			    	    distances[j] = distances[ind] + grafo[ind][j];
				    route[j] = ind;
			        }
                            }
                        }
		    }
	        }
	    }	
    }

    /*Retorna los vértices que se visitan en la ruta más corta para llegar del vértice al destino*/
    public void returnPath(int ver){
        if (ver != 0){
	    returnPath(route[ver]);
	    System.out.print(" "+(ver+1)+" ->");
        }    
    }

    /*Imprime los vértices y la distancia que se recorre desde el origen hasta los demás vértices*/
    public void printPaths(int nver){
	System.out.println("\nDirección y caminos mínimos para cada vértice\n");
	for (int i = 0; i < nver; i++){
	    System.out.print("\t De "+(origin+1)+" a "+(i+1)+" =");
	    returnPath(i);
	    System.out.print(" = "+distances[i]+"\n");
	}
    }
    
    /*Recibe un vértice destino y muestra solo la ruta y la distancia para llegar hasta ese vértice*/
    public void Path(int destiny){
        System.out.println("\nCamino mínimo para llegar al vértice "+(destiny));
        System.out.print("\t De "+(origin+1)+ " a "+(destiny)+" =");
        returnPath(destiny-1);
        System.out.print(" = "+distances[destiny-1]+"\n");
    }
}    
