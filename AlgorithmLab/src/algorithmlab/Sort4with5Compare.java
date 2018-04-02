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
public class Sort4with5Compare {
    
    public static int[] sort4with5Compare(int[] n){
        int upperbig, lowerBig, biggest, upperSmall, lowerSmall, smallest, upperMiddle, lowerMiddle;
        if(n[0] > n[1]){
            upperbig = n[0];
            upperSmall = n[1];
        } else {
            upperbig = n[1];
            upperSmall = n[0];
        }
        if(n[2] >  n[3]){
            lowerBig = n[2];
            lowerSmall = n[3];
        } else {
            lowerBig = n[3];
            lowerSmall = n[2];
        }
        if(upperSmall > lowerSmall){
            upperMiddle = upperSmall;
            smallest = lowerSmall;
        } else {
            upperMiddle = lowerSmall;
            smallest = upperSmall;
        }
        if(upperbig > lowerBig){
            lowerMiddle = lowerBig;
            biggest = upperbig;
        } else {
            lowerMiddle = upperbig;
            biggest = lowerBig;
        }
        if(upperMiddle > lowerMiddle){
            int[] a = {smallest, lowerMiddle, upperMiddle, biggest};
            return a;
        } else {
            int[] a = {smallest, upperMiddle, lowerMiddle, biggest};
            return a;
        }
    }
    
    public static void main(String[] args) {
        int[] b = {2,3,5,1};
        System.out.println(Arrays.toString(sort4with5Compare(b)));
    }
    
}
