package org.example;

import java.util.LinkedHashSet;
import java.util.Set;

public class ExercisesLevel2 {
    private double income;
    private String str;

    public ExercisesLevel2(double income) {
        this.income = income;
    }
    public ExercisesLevel2(String str) {
        this.str = str;
    }

    public int getTaxLevel() {
        if (income <= 5_000_000) return 1;
        else if (income <= 10_000_000) return 2;
        else if (income <= 18_000_000) return 3;
        else if (income <= 32_000_000) return 4;
        else if (income <= 52_000_000) return 5;
        else if (income <= 80_000_000) return 6;
        else return 7;
    }

    public double calculateTax() {
        int level = getTaxLevel();

        switch (level) {
            case 1: return income * 0.05;
            case 2: return income * 0.10;
            case 3: return income * 0.15;
            case 4: return income * 0.20;
            case 5: return income * 0.25;
            case 6: return income * 0.30;
            case 7: return income * 0.35;
            default: return 0;
        }
    }

    public boolean isPalindrome() {
        if (str == null) return false;

        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    public String removeDuplicateChars() {
        if (str == null) return null;

        Set<Character> set = new LinkedHashSet<>();

        for (char c : str.toCharArray()) {
            set.add(c);
        }

        StringBuilder result = new StringBuilder();
        for (char c : set) {
            result.append(c);
        }

        return result.toString();
    }
}
