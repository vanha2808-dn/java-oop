package org.example;

public class ExercisesLevel3 {
    private int[] numbers;
    int target;

    public ExercisesLevel3(int[] numbers, int target) {
        this.numbers = numbers;
        this.target = target;
    }

    public int[] twoSum() {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                return new int[]{left + 1, right + 1}; // +1 vì index bắt đầu từ 1
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{-1, -1}; // nếu không tìm thấy
    }
}
