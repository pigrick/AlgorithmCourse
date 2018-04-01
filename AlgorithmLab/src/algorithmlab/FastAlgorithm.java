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
public class FastAlgorithm {
    
    public static boolean fastAlgorithm(int[] nums){
        int mid;
        int start = 0;
        int end = nums.length -1;
        
        while(start <= end){
            mid = (end + start) / 2;
            if(nums[mid] == mid  ){
                return true;
            } else if(nums[mid] < mid){
                start = mid+1;        
            } else {
                end = mid - 1;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        int[] num = {};
        System.out.println(fastAlgorithm(num));
    }
}
