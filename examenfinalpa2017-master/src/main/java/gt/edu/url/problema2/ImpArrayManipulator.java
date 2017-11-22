/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.problema2;

/**
 *
 * @author diego
 */
public class ImpArrayManipulator<E> implements ArrayManipulator<E> {

    @Override
    public int subsets(List<E> set) {
        
    
         
    }
    public void heap(int n, int[] a) {
	int tmp;
	if(n == 1) {
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
	}
	else {	
		for(int i = 0; i < (n-1); i++) {
			heap(n-1, a);
			if(n % 2 == 0) {
				tmp = a[i];
				a[i] = a[n-1];
				a[n-1] = tmp;
			}
			else {
				tmp = a[0];
				a[0] = a[n-1];
				a[n-1] = tmp;
			}
		}
		heap(n-1, a);
	}
}
