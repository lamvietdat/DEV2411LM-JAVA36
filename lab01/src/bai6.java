import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập số nguyên n1: ");
        int n1 = sc.nextInt();

        System.out.printf("Nhập số nguyên m1: ");
        int m1 = sc.nextInt();

        System.out.printf("Nhập số thực n2: ");
        double n2 = sc.nextDouble();

        System.out.printf("Nhập số thực m2: ");
        double m2 = sc.nextDouble();

        int tong = n1+m1;
        double tong2 = n2+m2;
        double tong3 = n1+n2;
        System.out.printf("Tổng của 2 số nguyên là : "+tong);

        System.out.printf("\nTổng của 2 số thực là: "+tong2);

        System.out.printf("\nTổng của n1 và n2 là: "+tong3);
        sc.close();

    }
}
