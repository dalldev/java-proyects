package com.mycompany.sort;

import java.util.Random;

public class Sort {

    public static void main(String[] args) {
        
        int[] array = fillArray(10);
        readArray(array);
        
        int[] ascendingArray = sortAscendingArray(array);
        readArray(ascendingArray);
    }
    
    public static int[] fillArray(int x) {
        int[] array = new int[x];
        Random aler = new Random();
        
        for (int i = 0; i < array.length; i++) {
            array[i] = aler.nextInt(11);
        }
        
        return array;
    }
    
    public static void readArray (int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%4d", array[i]); 
        }
        System.out.println("");
    }
    
    // ascendinng = min - max 
    public static int[] sortAscendingArray (int[] array) { 
        int[] cache = new int[array.length];
        
        for (int j = 0; j < cache.length; j++) {
            int min = array[0];
            int location = 0;
            
            // get min
            for (int i = 0; i < array.length; i++) {
                if (min >= array[i] ) {
                    location = i;
                    min = array[i];                
                }
            }
            
            cache[j] = array[location];
            array[location] = 9999;
        }
        
        return cache;
    }
    
    // descending max - min;
}
