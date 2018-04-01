/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmlab;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author pigrick
 */
public class FibIte {
    
    public static int[] fibIterative(int n){
        int[] result= new int[n];
        int count = 0;
        result[count++] = 0;
        result[count++] = 1;
        while(count < n ){
            result[count] = result[count -2] + result[count - 1];
            count++;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fibIterative(10)));
        ArrayList<Integer> aaaa = new ArrayList<>();
        
    }
    
}
