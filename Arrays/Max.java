package com.arrayDatastructure;

public class Max {
    public static void main(String[] args) {
        int[]arr={1,45,87,4,56,854,98};
        System.out.println(max(arr));
        System.out.println(maxRange(arr,2,4));
    }
// adding the edge cases.
    static int max(int[]arr){
        if(arr.length==0){
            return -1;
        }
        int maxVal=arr[0];
        for (int i = 1; i < arr.length; i++) {

            if(arr[i]>maxVal){
                maxVal=arr[i];
            }

        }
        return maxVal;
    }
    static int maxRange(int[]arr,int start,int end){
        int maxVal=arr[start];
        if(end>start){
            return -1;

        }
        if(arr.length==0){
            return -1;
        }
        for (int i = start; i < end; i++) {

            if(arr[i]>maxVal){
                maxVal=arr[i];
            }

        }
        return maxVal;
    }

}
