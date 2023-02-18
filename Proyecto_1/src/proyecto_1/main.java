/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_1;

/**
 *
 * @author moise
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Grafo grafo = new Grafo(5);

        String nombre_v1 = "Almacen A:";
        Vertice v1 = new Vertice(nombre_v1);

        String nombre_v2 = "Almacen B:";
        Vertice v2 = new Vertice(nombre_v2);

        String nombre_v3 = "Almacen C:";
        Vertice v3 = new Vertice(nombre_v3);

        grafo.nuevoVertice(v1);
        grafo.nuevoVertice(v2);
        grafo.nuevoVertice(v3);

        grafo.nuevoVertice(v3);

        System.out.println(grafo.numVertice(v1));
        System.out.println(grafo.numVertice(v2));
        System.out.println(grafo.numVertice(v3));

        grafo.nuevoArco(v1, v2,15);

//        int num = 1;
//        int num_repro = 1003443;
//        int age = 1992;
//        String name = "Hallelujah";
//        String artist = "Lonard Cohen";
//        String idioma = "Español";
//        
//        Cancion song1 = new Cancion(num, name, artist, num_repro, age, idioma);
//        
//        grafo1.insertarArista(1, song1);
//        
//        grafo1.imprimirGrafo();
        
    }
    
}
