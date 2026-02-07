package org.example;

import java.lang.reflect.Array;
import java.util.Scanner;

public class BaiTap1 {
    public static void main(String[] args) {
        System.out.println("Nhập chuỗi:");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println("Chuỗi vừa nhập đã xoá các kí tự nguyên âm: ");
        System.out.println(removeVowels(input));
    }

    public static String removeVowels(String str) {
        String lowerString = str.toLowerCase();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < lowerString.length() ; i ++) {
            char c = lowerString.charAt(i);
            if (!isVowel(c)) {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static boolean isVowel(char c) {
        Vowel[] v = Vowel.values();
        for (Vowel i: v) {
            if(i.getValue() == c) {
                return true;
            }
        }
        return false;
    }
    public enum Vowel {
        A('a'),
        E('e'),
        I('i'),
        O('o'),
        U('u');

        private final char value;

        Vowel(char value) {
            this.value = value;
        }

        public char getValue() {
            return value;
        }
    }
}
