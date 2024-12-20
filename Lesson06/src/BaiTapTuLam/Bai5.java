package BaiTapTuLam;

import java.util.Scanner;

public class Bai5 {
    static boolean kiemTraSoNguyenTo(int num){
            // Số nhỏ hơn hoặc bằng 1 không phải số nguyên tố
            if (num <= 1) {
                return false;
            }
            // Kiểm tra từ 2 đến căn bậc hai của num
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    return false; // Chia hết cho số khác 1 và chính nó
                }
            }
            // Nếu không chia hết cho số nào khác 1 và chính nó thì là số nguyên tố
            return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số lượng phần tử của mảng
        System.out.print("Nhập số lượng số: ");
        int n = scanner.nextInt();

        // Nhập các số vào mảng
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập số thứ " + (i+1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Tìm và in các số nguyên tố
        System.out.println("Các số nguyên tố là:");
        for (int number : numbers) {
            if (kiemTraSoNguyenTo(number)) {
                System.out.print(number + " ");
            }
        }
    }
}
