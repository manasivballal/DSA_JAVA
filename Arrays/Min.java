package com.arrayDatastructure;

public class Min {
    public static void main(String[] args) {
        int[] arr={12,85,35,8,1};
        // Q. to find minimum value in array
        System.out.println(findMin(arr));

    }
    static int findMin(int[]arr){
        int min=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            //12
            if(arr[i]<min){
                min=arr[i];

            }


        }
        return min;
    }

}
