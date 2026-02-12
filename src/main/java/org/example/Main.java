package org.example;

import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
            Scanner sc = new Scanner(System.in);
            String input;

            do {
                System.out.print("Nhập cấp độ (1, 2, 3): ");
                input = sc.nextLine();
            } while (!input.matches("[123]"));

            switch (input) {
                case "1" -> level1();
                case "2" -> level2();
                case "3" -> level3();
            }
    }

    public static void level1() {
        bt1Level1();
        bt2Level1();
        bt3Level1();
        bt4Level1();
        bt5Level1();
    }

    public static void level2() {
        bt1Level2();
        bt2Level2();
        bt3Level2();
    }

    public static void level3() {
        bt1Level3();
    }

    private static void bt1Level1() {
        System.out.println("Bai1: Vui lòng nhập chuỗi");
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        ExercisesLevel1 bt1 = new ExercisesLevel1(input1);
        System.out.println("Chuỗi vừa nhập đã xoá các nguyên âm: ");
        System.out.println(bt1.removeVowels());
    }

    private static void bt2Level1() {
        System.out.println("Bài 2. Nhập 1 mảng số nguyên");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Nhập các phần tử:");
        for (int i = 0; i < n; i++) {
            while (!sc.hasNextInt()) {
                System.out.println("Sai! Nhập lại số nguyên:");
                sc.next();
            }
            arr[i] = sc.nextInt();
        }
        // In mảng ra kiểm tra
        System.out.print("Mảng vừa nhập: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        ExercisesLevel1 bt1 = new ExercisesLevel1(arr);
        System.out.println();
        System.out.println("Giá trị lớn thứ 2 của mảng trên là: ");
        bt1.resultOfSecondMaxInt();
    }

    private static void bt3Level1() {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.println("Bài 3. Nhập một số nguyên dương");
        while (true) {
            System.out.print("Nhập số nguyên dương n: ");
            if (!sc.hasNextInt()) {
                sc.next();
                continue;
            }
            n = sc.nextInt();
            if (n > 0) {
                ExercisesLevel1 bt3 = new ExercisesLevel1(n);
                System.out.println("Tổng các số chẵn từ 0 đến " + n + " là " + bt3.sumEven());
                break;
            }
        }
    }
    private static void bt4Level1() {
        System.out.println("Bài 4. Nhập một chuỗi (Không phải số) ");
        String str = checkValidInputString();
        if (!str.isEmpty()) {
            ExercisesLevel1 bt4 = new ExercisesLevel1(str);
            System.out.println("Số từ trong chuỗi là: " + bt4.countWords());
        }
    }

    private static void bt5Level1() {
        System.out.println("Bài 5. Nhập một chuỗi (Không phải số) ");
        String str = checkValidInputString();
        if (!str.isEmpty()) {
            ExercisesLevel1 bt5 = new ExercisesLevel1(str);
            System.out.println("Các chữ cái đầu trong chuỗi vừa nhập là: ");
            System.out.println(bt5.getFirstLetters());
        }
    }

    private static String checkValidInputString()  {
        Scanner sc = new Scanner(System.in);
        String str;
        while (true) {
            str = sc.nextLine();
            ExercisesLevel1 bt = new ExercisesLevel1(str);
            if (bt.isNumber()) {
                System.out.println("Nhập lại 1 chuỗi");
                continue;
            } else {
                return str;
            }
        }
    }

    private static void bt1Level2() {
        double income = inputIncome();

        ExercisesLevel2 taxCalculator = new ExercisesLevel2(income);

        int level = taxCalculator.getTaxLevel();
        double tax = taxCalculator.calculateTax();

        System.out.println("Bậc thuế: " + level);
        System.out.println("Thuế phải trả: " + tax + " VNĐ");
    }

    private static void bt2Level2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bài 2. Nhập vào 1 chuỗi để kiểm tra đối xứng ");
        String input = sc.nextLine();
        ExercisesLevel2 bt2 = new ExercisesLevel2(input);
        if (bt2.isPalindrome()) {
            System.out.println("TRUE! Chuỗi vừa nhập đối xứng ");
        } else {
            System.out.println("FALSE! Chuỗi vừa nhập không đối xứng ");
        }
    }

    private static void bt3Level2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bài 3. Nhập vào 1 chuỗi để xoá kí tự trùng lặp ");
        String input = sc.nextLine();
        ExercisesLevel2 bt2 = new ExercisesLevel2(input);
        System.out.println("Chuỗi vừa nhâo đã xoá các kí tự trùng lặp ");
        System.out.println(bt2.removeDuplicateChars());
    }

    public static double inputIncome() {
        Scanner sc = new Scanner(System.in);
        String input;

        while (true) {
            System.out.print("Nhập thu nhập hàng năm (VNĐ): ");
            input = sc.nextLine();

            if (!input.matches("\\d+(\\.\\d+)?")) {
                System.out.println("Không hợp lệ! Nhập lại.");
                continue;
            }

            return Double.parseDouble(input);
        }
    }

    public static void bt1Level3() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số phần tử: ");
        int n = Integer.parseInt(sc.nextLine());

        int[] numbers = new int[n];

        System.out.println("Nhập các phần tử (đã sắp xếp tăng dần):");
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(sc.nextLine());
        }

        System.out.print("Nhập target: ");
        int target = Integer.parseInt(sc.nextLine());

        ExercisesLevel3 bt1 = new ExercisesLevel3(numbers, target);
        int[] result = bt1.twoSum();

        if (result[0] == -1) {
            System.out.println("Không tìm thấy cặp số phù hợp.");
        } else {
            System.out.println("Kết quả: [" + result[0] + ", " + result[1] + "]");
        }
    }
}
