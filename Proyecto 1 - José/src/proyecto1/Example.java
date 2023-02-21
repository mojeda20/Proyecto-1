/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

public class Example {
    int costo[];
    int camino[];
    boolean visitado[];
    int[][]graf;
    
 
 
    public void dijks(Grafo grafo){
    	this.costo = new int[grafo.getNumVerts()];
    	this.camino = new int[grafo.getNumVerts()];
    	this.visitado = new boolean[grafo.getNumVerts()];
    	this.graf = grafo.getMatAd();
 
    	visitado[0] = true;
	camino[0] = 1;
	costo[0] = 0;
    }
    
    public void infin(int nver){
	for(int i=0;i<nver;i++){
	    for(int j=0;j<nver;j++){
		if(graf[i][j]==0){
		    graf[i][j]=10000;
                }
            }
        }    
    }
 
    public int indi(int nver){
	int aux=10000;
	int in=0;
	for(int i=1;i<nver;i++){
	    if(visitado[i]==false){
		if(costo[i]<aux){
		    aux=costo[i];
		    in=i;
		}
	    }
        }
	return in;
    }
 
    public void dijks1(int nver){
	int i;
	int j=0;
	int ind=0;
	for(i=1;i<nver;i++){
	    visitado[i]=false;
	    costo[i]=graf[0][i];
	    camino[i]=0;
	}
 
	for(i=0;i<nver;i++){
	    ind=indi(nver);
	    if(ind!=0){
		visitado[ind]=true;
		for(j=0;j<nver;j++){
		    if(graf[ind][j]!=10000){
			if(visitado[j]==false){
			    if((costo[ind]+graf[ind][j])<costo[j]){
			        costo[j]=costo[ind]+graf[ind][j];
			        camino[j]=ind;
			    }
                        }
                    }    
		}
	    }
	}
    }
 
    public void camin(int ver){
	if(ver!=0){
	camin(camino[ver]);
	System.out.print(" "+(ver+1)+",");
        }
    }
 
    public void Imprime(int nver){
	System.out.println("\nCAMINOS MÍNIMOS DESDE EL ORIGEN HASTA CADA VÉRTICE\n");
	for(int i=1;i<nver;i++){
	    System.out.print("\t De 1 a "+(i+1)+" =");
	    camin(i);
	    System.out.print(" = "+costo[i]+"\n");
			//System.out.println("\n");
	}
    }
}
