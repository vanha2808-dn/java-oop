package org.example;

public class ExercisesLevel3 {
    private int[] numbers;
    private int target;
    private String str;

    public ExercisesLevel3(int[] numbers, int target) {
        this.numbers = numbers;
        this.target = target;
    }

    public ExercisesLevel3(String str) {
        this.str = str;
    }

    public int[] twoSum() {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1};
    }

    public String longestPalindrome() {
        if (str == null || str.length() < 1) return "";

        int start = 0;
        int end = 0;

        for (int i = 0; i < str.length(); i++) {
            int len1 = expandFromCenter(str, i, i);     // odd-length palindrome
            int len2 = expandFromCenter(str, i, i + 1); // even-length palindrome
            int len = Math.max(len1, len2);

            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return str.substring(start, end + 1);
    }

    private int expandFromCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() &&
                s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1; // length of palindrome
    }


}
