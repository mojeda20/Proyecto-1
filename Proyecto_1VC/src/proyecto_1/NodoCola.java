/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_1;

/**
 *
 * @author valery
 */
public class NodoCola {
    
    private NodoCola pnextcola;
    private int data;
    private int size;

    public NodoCola() {
        this.pnextcola = null;
        this.data = data;
        this.size = 0;
    }

    public NodoCola getPnextcola() {
        return pnextcola;
    }

    public void setPnextcola(NodoCola pnextcola) {
        this.pnextcola = pnextcola;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    
    
    
}
