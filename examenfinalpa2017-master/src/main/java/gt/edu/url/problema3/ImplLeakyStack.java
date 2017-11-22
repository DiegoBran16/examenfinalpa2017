/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.problema3;

/**
 *
 * @author diego
 */
public class ImplLeakyStack<E> implements LeakyStack<E>{
    CircularLinkedList lista= new CircularLinkedList();
    @Override
    public int size() {
        int n=0;
        n=lista.size();
        return n;
    }

    @Override
    public boolean isEmpty() {
     return size()==0;
    }

    @Override
    public E saveHistory(E e) {
        lista.addLast(e);
        return e;
    }

    @Override
    public E actual() {
        E e = 
       return 
        
    }

    @Override
    public E undo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
