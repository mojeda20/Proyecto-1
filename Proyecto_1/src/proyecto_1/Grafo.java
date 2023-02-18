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
    private int numVerts;
    private int MaxVerts;
    private Vertice [] verts;
    private int [][] matAd;
    
    public Grafo(int mx){
        matAd = new int[mx][mx];
        verts = new Vertice[mx];
        for (int i = 0; i < mx; i++) {
            for (int j = 0; i < mx; i++) {
                matAd[i][j] = 0;
            }
        }
        numVerts = 0;
    }  
    
    public void nuevoVertice(Vertice nom) {
        boolean esta = numVertice(nom) >= 0;
        if (!esta) {
            Vertice v = new Vertice(nom.getName(), nom.getElement(), nom.getNumVertice());
            v.asigVertice(numVerts);
            verts[numVerts++] = v;
            System.out.println("El vertil vertice ha sido agregado exitosamente.");
        }else{
            System.out.println("El vertice ya ha sido agregado.");
        }
    }

    public int numVertice(Vertice vs) {
        Vertice v = new Vertice(vs.getName());
        boolean encontrado = false;
        int i = 0;
        for (; (i < numVerts) && !encontrado;) {
            encontrado = verts[i].getName().equals(v.getName());
            if (!encontrado) {
                i++;
            }
        }
        return (i < numVerts) ? i : -1;
    }
    
    public int nuevoArco(Vertice a, Vertice b, int peso) throws Exception {
        int va,vb;
        va  = numVertice(a);
        vb = numVertice(b);
        if (va  < 0 || vb < 0) {
            throw new Exception("Vértice no existe");
        }
        matAd[va][vb] = 1;
        return peso;
    }
    
    public boolean adyacente(Vertice a, Vertice b) throws Exception {
        int va,vb;
        va  = numVertice(a);
        vb = numVertice(b);
        if (va < 0 || vb < 0) throw new Exception ("Vértice no existe");
        return matAd[va][vb] == 1;
    }
}
