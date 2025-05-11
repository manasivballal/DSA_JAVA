package com.arrayDatastructure;

public class NotFixedCol {
    public static void main(String[] args) {
        int arr[][]={{1,3,45,5},
                {100},
                {65,7}};
        for (int row = 0; row <arr.length ; row++) {
            for (int col = 0; col <arr[row].length; col++) {
                System.out.print(arr[row][col]+" ");
            }
          System.out.println();
        }


    }
}
// here array are the one which has fixed number of number/memory allocation.
// but if we want to add random elements without stating the size then we use arraylist.
