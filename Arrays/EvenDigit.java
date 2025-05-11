package com.arrayDatastructure;

// Q. find the no of elements in array in which they have even number of digits
public class EvenDigit {
    public static void main(String[] args) {
        int[] arr = {12, 455, 7888, 45};
//        System.out.println(findNumbers(arr));

        System.out.println(digit2(4545454));

    }

    static int digit2(int num) {
        if (num < 0) {
            num = num * -1;
        }
        if (num == 0) {
            return 1;
        }
        return (int) (Math.log10(num)) + 1;
    }


    static int findNumbers(int[] num) {
        int count = 0;
        for (int element : num) {
            if (even(element)) {
                count++;
            }
        }

        return count;
    }


    static boolean even(int element) {
        // function to check whether the number contains even digit or not
        // 1.either count the digits
        // 2.or else convert that number into string and then take the length.
        int numberofdigit = digits(element);
        if (numberofdigit % 2 == 0) {
            return true;
        }

        return false;
    }

    static int digits(int num) {
        if (num < 0) {
            num = num * -1;
        }
        if (num == 0) {
            return 1;
        }
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;// num=/10
        }
        return count;
    }
}

