/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_1;

/**
 *
 * @author moise
 */
public class Arista {
    
    //Atributos de la clase Arista
    private Vertice origen;
    private Vertice destino;
    private int peso;
    
    //Getter and Setter
    public Vertice getOrigen() {
        return origen;
    }

    public void setOrigen(Vertice origen) {
        this.origen = origen;
    }

    public Vertice getDestino() {
        return destino;
    }

    public void setDestino(Vertice destino) {
        this.destino = destino;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    
    
}
