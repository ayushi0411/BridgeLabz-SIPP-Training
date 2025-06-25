package day5_string;

import java.util.Scanner;

public class ArrayIndex{
    public static void generateAIOB(String[] arr, int index) {
        System.out.println(arr[index]);
    }

    public static void handleAIOB(String[] arr, int index) {
        try {
            System.out.println(arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Generic runtime exception caught");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[] names = new String[size];
        for (int i = 0; i < size; i++) {
            names[i] = sc.next();
        }
        int idx = sc.nextInt();
        generateAIOB(names, idx);
        handleAIOB(names, idx);
        sc.close();
    }
}
