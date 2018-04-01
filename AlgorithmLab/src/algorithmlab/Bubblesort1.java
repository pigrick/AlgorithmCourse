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
public class Bubblesort1 {
    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    
    public static void bubblesort(int[] arr){
       int n;
       for(n = 0; n < arr.length-1; n++){
           if(arr[n] > arr[n+1]){
               break;
           }
       } 
       if(n == arr.length-1 ){
           System.out.println("Already sorted");
           return;
       }
        
       for(int i = 0 ; i < arr.length;i++){
           for(int j = 0; j < arr.length - 1; j++){
               if(arr[j] > arr[j+1]){
                   swap(arr, j, j+1);
               }
           }
        }
    }
    public static void main(String[] args) {
        int[] a = {3,6,4,1,2,5, 8 , -9, 9,7 ,4 ,1};
        int[] b = {3,4,5,6};
        bubblesort(a);
        System.out.println(Arrays.toString(a));
        bubblesort(a);
    }
}
