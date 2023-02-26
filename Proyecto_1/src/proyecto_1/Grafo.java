/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_1;

import javax.swing.JOptionPane;

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
    
    
        //Método  para encontrar el numero del vertice
    
    public int numeroVertice(String string){
        
        boolean vertEncontrado= false;
        Vertice vertice= new Vertice(string);
        int i = 0;
        for (; i < this.getNumVerts() && !vertEncontrado;) {
            vertEncontrado= verts[i].equals(vertice);
            if (!vertEncontrado){
                i++;
            }
         
            
        }
        if (i< getNumVerts()){
            return i;   
        }else{
            return -1;
        }
   
    }
    
    
    //Metodo para obtener los vertices que no han sido visitados
    
    public int VerticesNoVisitados(int vert){
        
        for (int j = 0; j < getNumVerts(); j++) {
            if(matAd[vert][j]!=0 && !verts[j].isFueVisitado()){
                return j;
            }  
        }
        return -1;
    }
    
    
    
    public Lista Dfs(Grafo matriz, String name){
        
        Lista vis= new Lista();
        int v= matriz.numeroVertice(name);
        
        if (v<0){
            JOptionPane.showMessageDialog(null, "No se ha encontrado el vertice. Verifique que exista.");
            return vis;
        } else{
            matriz.verts[v].setFueVisitado(true);
            int u= matriz.VerticesNoVisitados(v);
            if(u!=-1 && !matriz.verts[u].isFueVisitado()){
                Dfs(matriz, (String) matriz.verts[u].getName());
            }
            
            for (int i = 0; i < matriz.getNumVerts(); i++) {
                if(matriz.verts[i].isFueVisitado()){
                    NodoLista nodo= new NodoLista(matriz.verts[i]);
                    vis.insertar_nl(nodo);
                }
                
            }
            
            for (int i = 0; i < matriz.getNumVerts(); i++) {
                
                if (!matriz.verts[i].isFueVisitado()){
                    Dfs(matriz, matriz.verts[i].getName());
                }
                
            }
            
            return vis;
        }
        
    }
    
        //Recorrido del grafo por Breadth-first search
    
    public Lista Bfs(Grafo matriz, String name){
        
        int n1, n2;
        
        int clave= 100;
        
        int[] est_aux;
        
        Lista a = new Lista();
        
        n2= matriz.numeroVertice(name);
        
        if (n2>0){
            
            Cola colita = new Cola();
            est_aux= new int[matriz.getNumVerts()];
            for (int i=0; i< matriz.getNumVerts(); i++){
                est_aux[i]= clave;
            }
            
            est_aux[n2]=0;
            
            colita.encolar(n2);
            
            while(!colita.isEmpty()){
                Integer cw;
                cw = colita.desencolar();
                n1= cw;
                System.out.println(matriz.verts[n1]+ "fue visitado.");
                
                n1 = cw;
                NodoLista nodo = new NodoLista(matriz.verts[n1]);
                a.insertar_nl(nodo);
                for (int u = 0; u < matriz.getNumVerts(); u++) {
                    if ((matriz.getMatAd()[n1][u] != 0) && (est_aux[u] == clave) && (matriz.verts[n1] != null)) {
                        est_aux[u] = est_aux[n1] + 1;
                        colita.encolar(u);
                    }
                }
            }
            return a;
        }
        return null;
    }

    
    
    
    
    
}
