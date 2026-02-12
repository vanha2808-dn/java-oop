package org.example;

import java.util.Arrays;
import java.util.Collections;

public class ExercisesLevel1 {
    private String str;
    private int[] arr;
    private int number;
    public ExercisesLevel1(String str) {
        this.str = str;
    }
    public ExercisesLevel1(int[] arr) {
        this.arr = arr;
    }
    public ExercisesLevel1(int number) { this.number = number; }

    public int sumEven() {
        int sum = 0;
        for (int i = 0; i <= number; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
    public boolean isNumber() {
        if (str == null || str.trim().isEmpty()) {
            return false;
        }
        return str.trim().matches(".*\\d.*");
    }

    public String getFirstLetters() {
        String[] words = str.trim().split("\\s+");

        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(word.charAt(0)).append(" ");
            }
        }
        return result.toString().toUpperCase().trim();
    }

    public int countWords() {
        return str.trim().split("\\s+").length;
    }

    public void resultOfSecondMaxInt() {
        int[] array = (int[]) arr;
        if (array.length == 1) {
            System.out.println("Integer.MIN_VALUE");
        } else {
            int[] sorted = Arrays.stream(array)
                    .boxed().sorted(Collections.reverseOrder())
                    .mapToInt(Integer::intValue)
                    .toArray();
            for (int i = 0; i < sorted.length; i++) {
                if (sorted[i] < sorted[0]) {
                    System.out.println(sorted[i]);
                }
            }
        }
    }

    public String removeVowels() {
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

    public boolean isVowel(char c) {
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
