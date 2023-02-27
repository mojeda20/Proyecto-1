/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_1;

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
