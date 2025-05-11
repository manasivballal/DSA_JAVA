package com.arrayDatastructure;
// linear search is the operation performed to search the elements in the array ..
public class LinearSearchDemo {
    public static void main(String[] args) {
        int[] arr={34,57,789,25,68};
        int ans=linearSearch(arr,57);
        System.out.println(ans);
    }

    static int linearSearch(int[]arr, int target){

        if(arr.length==0){
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            int element=arr[index];
            if(element==target){
                return index;
            }


        }// if not any target is found then return the -1 as a
           return -1;
    }

    // search and return the element
    static int linearSearch1(int[]arr, int target){

        if(arr.length==0){
            return Integer.MAX_VALUE;
        }

        for (int element : arr) {
            if (element == target) {
                return element;
            }


        }// if not any target is found then return the -1 as a
        return Integer.MAX_VALUE;
    }

   // search and return true or false if element is found
    static boolean linearSearch3(int[]arr, int target){

        if(arr.length==0){
            return false;
        }

        for (int index = 0; index < arr.length; index++) {
            int element=arr[index];
            if(element==target){
                return true;
            }


        }// if not any target is found then return the -1 as a
        return false;
    }

}
