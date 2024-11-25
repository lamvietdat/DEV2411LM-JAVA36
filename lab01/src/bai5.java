import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập số nguyên n: ");
        int n = sc.nextInt();
        System.out.printf("Nhập số nguyên m: ");
        int m = sc.nextInt();
        int tong = n + m;
        System.out.printf("Tổng của" +n+ "và" +m+ "là: "+tong);
        sc.close();

    }
}
