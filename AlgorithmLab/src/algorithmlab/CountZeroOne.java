/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmlab;

/**
 *
 * @author pigrick
 */
public class CountZeroOne {
    public static int[] countZeroOne(int[] n){
        int[] result = new int[2];
        if(n == null){
            return result;
        }
        if(n[n.length-1] == 0 ){
            result[0] = n.length;
            return result;
        }
        int start = 0;
        int end = n.length-1;
        int mid = end/2;
        while(start < end){            
            if(n[mid] == 0){
                start = mid +1;
            } else {
                end = mid;
            }
            mid = (end + start) /2;
        }
        result[0] = mid;
        result[1] = n.length - mid;
            
        return result;
        
    }
    public static void main(String[] args) {
        int[] a = {0,0,0};
        int[] r = countZeroOne(a);
        System.out.println(r[0]);
        System.out.println(r[1]);
    }
}
