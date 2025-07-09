package org.example;

import java.util.Scanner;

public class BT1_Dokho2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập thu nhập hàng năm (triệu đồng): ");
        double thuNhap = scanner.nextDouble();
        double thue = tinhThue(thuNhap);
        System.out.printf("Số thuế phải trả là: %.2f triệu đồng\n", thue);
    }
    public static double tinhThue(double thuNhap) {
        double thue = 0;
        double conLai = thuNhap;
        if (conLai > 80) {
            thue += (conLai - 80) * 0.35;
            conLai = 80;
        }
        if (conLai > 52) {
            thue += (conLai - 52) * 0.30;
            conLai = 52;
        }
        if (conLai > 32) {
            thue += (conLai - 32) * 0.25;
            conLai = 32;
        }
        if (conLai > 18) {
            thue += (conLai - 18) * 0.20;
            conLai = 18;
        }
        if (conLai > 10) {
            thue += (conLai - 10) * 0.15;
            conLai = 10;
        }
        if (conLai > 5) {
            thue += (conLai - 5) * 0.10;
            conLai = 5;
        }
        if (conLai > 0) {
            thue += conLai * 0.05;
        }
        return thue;
    }
}
