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
public class sort012 {
    
    public static void swap(int[]a, int m, int n){
        int temp = a[m];
        a[m] = a[n];
        a[n] = temp;
    }
    
    public static int[] sort012(int[] a){
        int current = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] == 0){
                swap(a, i, current);
                current++;
            }
        }
        for(int i = current; i < a.length; i++){
            if(a[i] == 1){
                swap(a, i, current);
                current++;
            }
        }
        return a;
    }
    
    public static void main(String[] args) {
        int[] a = {1,2,0,1,2,0,1,0,2,1};
        System.out.println(Arrays.toString(sort012(a)));
    }
}
