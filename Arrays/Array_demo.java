package com.arrayDatastructure;

import java.util.Arrays;

// int rnos declaration of array is done at compile time
//rnos=new int[5] initialisation takes places and memory is allocated in heap is done
// at run time.
// dnyamic memory allocation -> depends on JVM may not be continuous.
public class Array_demo {
    public static void main(String[] args) {
        int rnos[] = {1,5,8,445};
        System.out.println(Arrays.toString(rnos));
        System.out.println(rnos[0]);
        String arr[] = new String[8]; // non primitive -> string.
        System.out.println(arr[0]);
        for (int num : rnos) { // for every element in array print the element
            System.out.print(num + " "); // here num represents t0he elements of th array
        }

        // array for objects for example string
        // arrays are mutable
        // strings are immutable


    }
}
