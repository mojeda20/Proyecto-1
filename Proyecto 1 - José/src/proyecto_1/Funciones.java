/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_1;

public class Funciones {
    public String showProduct(Grafo grafo){
        String info = "";
        for (int i = 0; i < grafo.getNumVerts(); i++) {
            info = info+grafo.vertice(i).getElement().Transformar()+"\n";     
        }
        return info;
    }
}
