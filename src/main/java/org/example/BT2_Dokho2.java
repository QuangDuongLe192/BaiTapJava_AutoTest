package org.example;

import java.util.Scanner;

public class BT2_Dokho2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String chuoi = scanner.nextLine();
        if (laDoiXung(chuoi)) {
            System.out.println("Chuỗi là đối xứng");
        } else {
            System.out.println("Chuỗi không phải là đối xứng");
        }

    }
    public static boolean laDoiXung(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
