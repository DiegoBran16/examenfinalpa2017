/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.problema2;



import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author diego
 * @param <E>
 */
public class ArrayList<E> implements List<E>{
	
	
        
	public static final int CAPACITY = 1;
	private E[] data;
	private int size = 0;
            /**
             * 
             * constructor 
             */
	public ArrayList() {
		this(CAPACITY);
	}
            /**
             * 
             * asigna la capacidad inicial del arreglo
             * @param capacity 
             */
	public ArrayList(int capacity) {
		data = (E[]) new Object[capacity];
	}
            /**
             * retorna la cantidad de elementos 
             * @return 
             */
	public int size() {
		return size;
	}
            /**
             * verifica si esta vacio
             * @return 
             */
	public boolean isEmpty() {
		return size == 0;
	}

	public E get(int i) {
		checkIndex(i, size);
		return data[i];
	}
            /**
             * cambia el valor deun  elemento en una pocsicion estaecida
             * @param i
             * @param e
             * @return 
             */
	public E set(int i, E e) {
		checkIndex(i, size);
		E temp = data[i];
		data[i] = e;
		return temp;
	}
            /**
             * 
             * añade un elemento en una posicion establecida
             * @param i
             * @param e 
             */
	public void add(int i, E e) {
		checkIndex(i, size + 1);
		if (size == data.length)
			resize(2 * data.length);
		for (int k = size - 1; k >= i; k--)
			data[k + 1] = data[k];
		data[i] = e; 
		size++;

	}
            /**
             * elimina un elemento del arreglo
             * @param i
             * @return
             * @throws IndexOutOfBoundsException 
             */
	public E remove(int i) throws IndexOutOfBoundsException {
		checkIndex(i, size);
		E temp = data[i];
		for (int k = i; k < size - 1; k++)
			data[k] = data[k + 1];
		data[size - 1] = null;
		size--;
		return temp;
	}
                /**
                 * verifica si el indice es valido 
                 * @param i
                 * @param n
                 * @throws IndexOutOfBoundsException 
                 */
	protected void checkIndex(int i, int n) throws IndexOutOfBoundsException {
		if (i < 0 || i >= n)
			throw new IndexOutOfBoundsException("Illegal index: " + i);
	}

	/**
	 * duplica el tamaño del arreglo al no tener posiciones disponibles
	 * @param capacity
	 */
	protected void resize(int capacity) {
		E[] temp = (E[]) new Object[capacity];
		for (int k=0; k < size; k++)
			temp[k] = data[k];
		data = temp;
	}

    @Override
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}