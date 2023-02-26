/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglo_claes;

import javax.swing.JOptionPane;

/**
 *
 * @author moise
 */
public class Grafo {
    private int numVerts;
    private int maxVerts;
    private Vertice[] verts;
    private int[][] matAd;

    public Grafo(int mx) {
        this.matAd = new int[mx][mx];
        this.verts = new Vertice[mx];
        for (int i = 0; i < mx; i++) {
            for (int j = 0; i < mx; i++) {
                    this.matAd[i][j] = 0;
            }
        }
        this.numVerts = 0;
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

    public int getNumVerts() {
        return numVerts;
    }

    public void setNumVerts(int numVerts) {
        this.numVerts = numVerts;
    }

    public int getMaxVerts() {
        return maxVerts;
    }

    public void setMaxVerts(int maxVerts) {
        this.maxVerts = maxVerts;
    }
    
    public int numVertice(String vs) {
        Vertice v = new Vertice(vs);
        boolean encontrado = false;
        int i = 0;
        for (; (i < this.getNumVerts()) && !encontrado;) {
            encontrado = verts[i].equals(v);

            if (!encontrado) {
                i++;
            }
        }
        return (i < getNumVerts()) ? i : -1;
    }

    public void newVertice(String nom, ListaSimple data) {
        boolean esta = numVertice(nom) >= 0;
        if (!esta) {
            Vertice v = new Vertice(nom, data);
            v.setNumVert(getNumVerts());
            verts[numVerts++] = v;

        } else {
            JOptionPane.showMessageDialog(null, "El vertice ya existe");
        }
    }
    
    public void verticeSolo(String nom) {
        boolean esta = numVertice(nom) >= 0;
        if (!esta) {
            Vertice v = new Vertice(nom);
            v.setNumVert(getNumVerts());
            verts[numVerts++] = v;
        } else {
            JOptionPane.showMessageDialog(null, "El vertice ya existe");
        }
    }
    
    public void nuevoArco(String a, String b, int peso) {
        int va,vb;
        va  = numVertice(a);
        vb = numVertice(b);
        if (va  < 0 || vb < 0) {
            JOptionPane.showMessageDialog(null, "El vertice no existe");
        } else {
            this.matAd[va][vb] = peso;
        }
    }
    
    public void nuevo_Arco(String a, String b, int peso) {
        int va,vb;
        va  = numVertice(a);
        vb = numVertice(b);
        if (va  < 0 || vb < 0) {
            JOptionPane.showMessageDialog(null, "El vertice no existe");
        } else {
            this.matAd[va][vb] = peso;
        }
    }
    
    public void VerMat() {
        for (int[] matAd1 : getMatAd()) {
            for (int j = 0; j < matAd1.length; j++) {
                System.out.print(" " + matAd1[j] + " ");
            }
            System.out.println("");
        }
    }

    public int getVerticeNoVisitado(int v) {
        for (int j = 0; j < getNumVerts(); j++) {
            if ((matAd[v][j] != 0) && (!verts[j].isFueVisitado())) {
                return j;
            }
        }
        return -1;
    }

    public boolean adyacente(String a, String b) {
        int va,vb;
        va  = numVertice(a);
        vb = numVertice(b);
        if (va  < 0 || vb < 0) {
            JOptionPane.showMessageDialog(null, "El vertice no existe");
            return false;
        } else {
            return getMatAd()[va][vb] != 0;
        }
    }
    
}
