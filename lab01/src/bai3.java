import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên n: ");
        int n = scanner.nextInt();


        System.out.print("Nhập số thực m: ");
        double m = scanner.nextDouble(); // Sử dụng nextDouble() để đọc số thực

        System.out.printf("Số nguyên vừa nhập là: %d\n", n);
        System.out.printf("Số thực vừa nhập là: %.2f", m);
    }
}
//%d: Để in giá trị nguyên.
//%.nf: Để in giá trị số thực với 2 chữ số sau dấu phẩy. n là số các số hạng sau dấu phẩy

