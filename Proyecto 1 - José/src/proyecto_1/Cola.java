/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_1;

public class Cola {
    private NodoCola head, tail;
    private int size;

    public Cola() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public NodoCola getHead() {
        return head;
    }

    public void setHead(NodoCola head) {
        this.head = head;
    }

    public NodoCola getTail() {
        return tail;
    }

    public void setTail(NodoCola tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    
    public boolean isEmpty(){
        return head == null;
    }
    

    
    public void encolar(int num){
        NodoCola node = new NodoCola();
        if (isEmpty()) {
            setHead(node);
            setTail(node);
        } else {
            node = getTail().getPnextcola();   
        }
        size++;
      
    }
    

//    
//    @Override
//    public Nodo despachar(){
//        if (!isEmpty()){
//            Nodo pointer = getHead();
//            setHead(pointer.getNext());
//            pointer.setNext(null);
//            if (getHead() == null){
//                setTail(null);
//            }
//            size--;
//            return pointer;
//        }
//        return null;
//    }
//    
   
    public Integer desencolar(){
        if (!isEmpty()){
            NodoCola pointer = getHead();
            setHead(pointer.getPnextcola());
            pointer.setPnextcola(null);
            if (getHead() == null){
                setTail(null);
            }
            size--;
            return size;
        }
        return null;
    }
    
//    @Override
//    public void printQueue(){
//        Nodo pointer = getHead();
//        while (pointer != null) {
//            System.out.println("NODO:"+pointer.getElement());
//            pointer = pointer.getNext();
//        }
//    }
//    
//}
}
