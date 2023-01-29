package homework3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //ex1();
        ex2();
    }
    public static void ex1(){
        ArrayList<Integer> arr = arrCreator();
        System.out.println(arr);
        ArrayList<Integer> even = new ArrayList<>();
        for (Integer num : arr) {
            if (num % 2 != 0) {
                even.add(num);
            }
        }
        System.out.println(even);
    }

    public static void ex2() {
        ArrayList<Integer> arr = arrCreator();
        int sum = arr.stream().mapToInt(Integer::intValue).sum();
        System.out.println(arr);
        System.out.println(sum/arr.size());
        System.out.println(Collections.max(arr));
        System.out.println(Collections.min(arr));
    }
    public static ArrayList<Integer> arrCreator() {
        System.out.printf("Введите размер массива: ");
        Scanner scan = new Scanner(System.in);
        int arrSize = scan.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.printf("Введите максимальное значение элементов массива: ");
        Scanner sc = new Scanner(System.in);
        int maxVal = sc.nextInt();
        for (int i = 0; i < arrSize; i++) {
            Random random = new Random();
            arr.add(random.nextInt(maxVal+1));
        }
        return arr;
    }
}

