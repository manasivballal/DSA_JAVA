package com.arrayDatastructure;
// representing string as a character array and finding the targeted char in string .

import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args) {
        String str = "manasi";
        char target = 's';
        System.out.println(Arrays.toString(str.toCharArray()));
        System.out.println(search(str, target));
    }

    static boolean search(String str, char target) {
        if (str.isEmpty()) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }

}
