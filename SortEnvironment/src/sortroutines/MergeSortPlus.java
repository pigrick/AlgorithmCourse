/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortroutines;

import java.util.Arrays;
import java.util.Random;
import runtime.Sorter;

/**
 *
 * @author pigrick
 */
public class MergeSortPlus extends Sorter {

    final int ARRAY_SIZE = 33;
    final int MAX_VAL = 1000;
    int[] theArray;

    public int[] sort(int[] input) {
        int n = input.length;
        int[] tempStorage = new int[n];
        theArray = input;
        mergeSortPlus(tempStorage, 0, n - 1);
        return theArray;
    }

    /**
     * Merges the ranges [lowerPointer,upperPointer-1] and
     * [upperPointer,upperBound] in place
     */
    private void merge(int[] tempStorage, int lowerPointer, int upperPointer, int upperBound) {
        int j = 0; //tempStorage index
        int lowerBound = lowerPointer;
        int n = upperBound - lowerBound + 1; //total number of elements to rearrange

        //view the range [lowerBound,upperBound] as two arrays
        //[lowerBound, mid], [mid+1,upperBound] to be merged
        int mid = upperPointer - 1;

        while (lowerPointer <= mid && upperPointer <= upperBound) {
            if (theArray[lowerPointer] < theArray[upperPointer]) {
                tempStorage[j++] = theArray[lowerPointer++];
            } else {
                tempStorage[j++] = theArray[upperPointer++];
            }
        }
        //left array may still have elements -- insert them into tempStorage
        while (lowerPointer <= mid) {
            tempStorage[j++] = theArray[lowerPointer++];
        }
        //right array may still have elements -- insert these into tempStorage
        while (upperPointer <= upperBound) {
            tempStorage[j++] = theArray[upperPointer++];
        }
        //replace the range [lowerBound,upperBound] in theArray with 
        //the range [0,n-1] just created in tempStorage
        for (j = 0; j < n; ++j) {
            theArray[lowerBound + j] = tempStorage[j];
        }

    }

    void insertionSort(int lower, int upper) {
        if(theArray == null || theArray.length <= 1){
            return;
        }
        int temp = 0;
        int j = 0;
        for(int i = lower; i <= upper;i++){
            temp = theArray[i];
            j=i;
            while(j > lower && temp < theArray[j-1]){
                theArray[j] = theArray[j-1];
                j--;
            }
            theArray[j] = temp;
        }
    }

    void mergeSortPlus(int[] tempStorage, int lower, int upper) {

        if (lower == upper) {
            return;
        } else {
            int mid = (lower + upper) / 2;
            if(mid - lower <= 20){
                insertionSort(lower, mid);
                insertionSort(mid+1, upper);
            } else {
                mergeSortPlus(tempStorage, lower, mid);  //sort left half
                mergeSortPlus(tempStorage, mid + 1, upper); //sort right half
                
            }
            merge(tempStorage, lower, mid + 1, upper); //merge them
        }
    }

    //set up routines
    public static void main(String[] args) {
        MergeSortPlus ms = new MergeSortPlus();
        //ms.testMerge();
        ms.testMergeSortPlus();
//        int[] arr = {5,4,2,3,1,9};
//        ms.insertionSort(arr, 2, 5);
//        System.out.println(Arrays.toString(arr));
    }

    public void testMerge() {

        //create an array whose left half is sorted and whose
        //right half is sorted
        loadArray();
        int n = theArray.length;
        int[] tempStorage = null;
        int half = n / 2;
        tempStorage = new int[n];
        mergeSortPlus(tempStorage, 0, half);
        tempStorage = new int[n];
        mergeSortPlus(tempStorage, (n / 2) + 1, n - 1);

        //begin display -- start with left half sorted, right half sorted
        System.out.println();
        System.out.println("an array with left half sorted and right half sorted:");
        displayArray(theArray);
        System.out.println();
        System.out.println("merging the two halves...");

        //call the merge method and display results
        tempStorage = new int[n];
        merge(tempStorage, 0, half + 1, n - 1);
        displayArray(theArray);
    }

    public void testMergeSortPlus() {
        loadArray();
        System.out.println("initial array:");
        displayArray(theArray);
        int n = theArray.length;
        int[] tempStorage = new int[n];
        mergeSortPlus(tempStorage, 0, n - 1);
        System.out.println();
        System.out.println("sorted array:");
        displayArray(theArray);

    }

    private void loadArray() {
        theArray = new int[ARRAY_SIZE];
        Random r = new Random();
        int next = 0;
        for (int i = 0; i < ARRAY_SIZE; ++i) {
            next = r.nextInt();
            next = Math.abs(next % MAX_VAL);
            //System.out.println("next int "+next);
            theArray[i] = Math.abs(next);
        }
    }

    private void displayArray(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
    }

}
