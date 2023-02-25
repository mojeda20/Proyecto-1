/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

public class Funciones {
    public void crearGrafo(String txt, Grafo grafo){        
        String[] info = txt.split("&");
        
        String[] info_almacenes = info[0].split(";");
        
        for (int i = 0; i < info_almacenes.length-1; i++) {
            String[] almacen = info_almacenes[i].split(":");
            String nombre = "";
            for (int j = 1; j < almacen.length; j++) {
                    String[] productos = almacen[j].split("\n");
                    Stock_produc[] stock = new Stock_produc[productos.length];
                    for (int k = 0; k < productos.length; k++) {
                        String[] info_produc = productos[k].split(",");
                        Stock_produc stock1 = new Stock_produc(info_produc[0], Integer.parseInt(info_produc[1]));
                        stock[k] = stock1;
                    }
                    Vertice v = new Vertice(nombre, stock);
                    grafo.nuevoVertice(v);
            }
        }
        grafo.getNumVerts();
        
        String[] info_paths = info[1].split("\n");
        for (int i = 0; i < info_paths.length; i++) {
            String[] path = info_paths[i].split(",");
            String nameVer1 = path[0];
            String nameVer2 = path[1];
            int weight = Integer.parseInt(path[2]);
            Vertice vert1 = grafo.searchVertice(nameVer1);
            Vertice vert2 = grafo.searchVertice(nameVer2);
            grafo.nuevoArco(vert1, vert2, weight);
        }
    }
}
