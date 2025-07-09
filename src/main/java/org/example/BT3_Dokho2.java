package org.example;

import java.util.Scanner;

public class BT3_Dokho2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String chuoi = scanner.nextLine();
        System.out.println(xoaLapLai(chuoi));
    }

    public static String xoaLapLai(String input) {
        String ketQua = "";

        for (int i = 0; i < input.length(); i++) {
            char kyTu = input.charAt(i);
            if (ketQua.indexOf(kyTu) == -1) {
                ketQua += kyTu;
            }
        }

        return ketQua;
    }
}
