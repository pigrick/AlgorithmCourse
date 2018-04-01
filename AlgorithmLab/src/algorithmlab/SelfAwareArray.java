/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmlab;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author pigrick
 */
public class SelfAwareArray {
    
    public static boolean selfAwareArray1(int[] arr){
        Map<Integer,Integer> tempmap = new HashMap<>();   
        for(int i = 0; i < arr.length; i++){
           tempmap.put(arr[i], tempmap.getOrDefault(arr[i], 0)+1);
        }
        for(int i = 0; i < arr.length; i++){
            System.out.println(i + " " + tempmap.getOrDefault(i, 0));
            if(arr[i] != tempmap.getOrDefault(i, 0)){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        int[] check = {6,1,0,0,0,0,1,0};
        System.out.println(selfAwareArray1(check));
    }
}
