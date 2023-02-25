/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import javax.swing.JOptionPane;

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
            Vertice v = new Vertice(nom.getName(), nom.getElement());
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
    
    public Vertice vertice(int posicion){
        if(posicion <= this.getNumVerts()){
            Vertice v = this.getVerts()[posicion];
            return v;
        }
        return null;
    }
    
    public Vertice nombre_vertice(String name){
        for (int i = 0; i < getNumVerts(); i++) {
            if(verts[i].getName().equalsIgnoreCase(name)){
                return verts[i];
            }
        }
        return null;
    }
    
        public String nombreVertice(Vertice vs) {
        Vertice v = new Vertice(vs.getName(), vs.getElement());
        boolean encontrado = false;
        int i = 0;
        for (; (i < numVerts) && !encontrado;) {
            encontrado = verts[i].getName().equals(v.getName());
            if (!encontrado) {
                i++;
            }
        }
        return (i < numVerts) ? vs.getName() : null;
    }
    
    public int nuevoArco(Vertice a, Vertice b, int peso){
        int va,vb;
        va  = numVertice(a);
        vb = numVertice(b);
        if (va  < 0 || vb < 0) {
            return -1;
        }
        matAd[va][vb] = peso;
        return peso;
    }
    
    public boolean adyacente(Vertice a, Vertice b) throws Exception {
        int va,vb;
        va  = numVertice(a);
        vb = numVertice(b);
        if (va < 0 || vb < 0) throw new Exception ("Vértice no existe");
        return matAd[va][vb] != 0;
    }
    
    public int devolverPeso(Vertice a, Vertice b) throws Exception{
        if(adyacente(a,b)){
            int va = numVertice(a);
            int vb = numVertice(b); 
            
            for (int i = 0; i < numVerts; i++) {
               for (int j= 0; j < numVerts; j++) {
                   if(i == va && j == vb){
                       return matAd[i][j];
                   }
                } 
            }
                    
        }
        
        return -1;
    }

    public int getNumVerts() {
        return numVerts;
    }

    public void setNumVerts(int numVerts) {
        this.numVerts = numVerts;
    }

    public int getMaxVerts() {
        return MaxVerts;
    }

    public void setMaxVerts(int MaxVerts) {
        this.MaxVerts = MaxVerts;
    }

    public Vertice[] getVerts() {
        return verts;
    }

    public void setVerts(Vertice[] verts) {
        this.verts = verts;
    }

    public int[][] getMatAd() {
        return matAd;
    }

    public void setMatAd(int[][] matAd) {
        this.matAd = matAd;
    }
    
    public Vertice searchVertice(String vertice_name){
        for (int i = 0; i < verts.length; i++) {
            if (verts[i].getName().equalsIgnoreCase(vertice_name)){
                return verts[i];
            }
        }
        JOptionPane.showMessageDialog(null, "Vértice no encontrado");
        return null;
    }
}
