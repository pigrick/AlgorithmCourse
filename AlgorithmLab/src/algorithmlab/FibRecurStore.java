/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmlab;

import java.util.Arrays;


/**
 *
 * @author pigrick
 */
public class FibRecurStore {
    
    public static int fibRecurStore(int n){
        int[] store = new int[n];
        Arrays.fill(store, -1);
        if(n == 1 || n == 0){
            return n;
        }
        store[0] = 0;
        store[1] = 1;
        return fibRecur(n - 2, store) + fibRecur(n - 1, store);
    }
    public static int fibRecur(int n, int[] store){
        //System.out.println(Arrays.toString(store));
        if(store[n] == -1){
            store[n] = fibRecur(n - 1, store) + fibRecur(n - 2, store);
        } 
        return store[n];        
    }
    
    public static int fib(int n){
        if(n == 0 || n == 1){
            return n;
        }
        return fib(n-2) + fib(n-1);
    }
    
    public static int fibIterative(int n){
        int[] result= new int[n+1];
        int count = 0;
        result[count++] = 0;
        result[count++] = 1;
        while(count < n +1 ){
            result[count] = result[count -2] + result[count - 1];
            count++;
        }
        return result[n];
    }
    
    public static void main(String[] args) {
        long start = System.nanoTime();
        System.out.println(fibRecurStore(40));
        System.out.println("fibrecurstore : " + (System.nanoTime() - start));
        start = System.nanoTime();
        System.out.println(fib(40));
        System.out.println("fib : " + (System.nanoTime() - start));
        start = System.nanoTime();
        System.out.println(fibIterative(40));
        System.out.println("fibItera : " + (System.nanoTime() - start));
      
    }
}
