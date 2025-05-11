package com.arrayDatastructure;
// by setting range searching the element
public class SearchInRange {
    public static void main(String[] args) {
        //Q. search for 3 in the range of index[1,4]
        int[] arr={18,12,-7,3,14,20};
       System.out.println( searchRange(arr,12,0,4));
    }
    static int searchRange(int[] arr,int target,int start,int end){
        if(arr.length==0){
            return -1;
   }
        for (int index = start; index <end; index++) {
            // check for every element at every index
            int element=arr[index];
            if(element==target){
                return index;

            }

        }
        return -1;
    }

}
