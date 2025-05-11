package com.arrayDatastructure;
// finding element in 2-Dimension

import java.util.Arrays;

public class  SearchIn2D {
    public static void main(String[] args) {
        int[][] arr = {{12, 45, 9}, {15, 78, 95}, {145, 85}, {4, 8, 30}};
        int target = 78;
//        System.out.print(max(arr));
        System.out.print(searchMin(arr));
        int[] ans = search(arr, target);// format will be in the form of(row,col)
//        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }

            }

        }
        return new int[]{-1, -1};
    }

    // searching max in 2D array
    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE; // -457512121
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }

            }

        }
        return max;
    }


    // searching minimum value in 2D array
    static int searchMin(int[][] arr) {
        int min = Integer.MAX_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] < min) {
                    min = arr[row][col];
                }

            }

        }
        return min;
    }


}
