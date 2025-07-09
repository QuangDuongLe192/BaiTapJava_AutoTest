package org.example;

import java.util.Scanner;

public class BT2_Dokho3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String input = scanner.nextLine();
        String ketQua = longestPalindrome(input);
        System.out.println("Chuỗi con đối xứng dài nhất là: " + ketQua);
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

    // Tìm chuỗi đối xứng dài nhất
    public static String longestPalindrome(String s) {
        String ketQua = "";

        // Duyệt tất cả chuỗi con
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String chuoiCon = s.substring(i, j);

                // Kiểm tra đối xứng và dài hơn kết quả hiện tại
                if (laDoiXung(chuoiCon) && chuoiCon.length() > ketQua.length()) {
                    ketQua = chuoiCon;
                }
            }
        }

        return ketQua;
    }


}
