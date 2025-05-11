package com.arrayDatastructure;
import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {
        System.out.println("enter the array numbers");
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[6];
        for (int row = 0; row < arr.length; row++) {
            arr[row]=sc.nextInt();

        }
        for (int row = 0; row < arr.length; row++) {
            System.out.print(arr[row]+" ");

        }
    }
}
