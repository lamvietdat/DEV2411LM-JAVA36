import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập số nguyên n: ");
        int n = sc.nextInt();

        System.out.printf("Nhập số thực m: ");
        double m = sc.nextDouble();

        System.out.printf("Nhập sâu kí tự: ");
        String chuoi =sc.nextLine();
        sc.nextLine();

        System.out.printf("Số nguyên vừa nhập: "+n);
        sc.nextLine();
        System.out.printf("Số thực vừa nhập: "+m);
        sc.nextLine();
        System.out.printf("Sâu kí tự vừa nhập: "+chuoi);
        sc.nextLine();
        sc.close();
    }
}
//nextInt(): Dùng để đọc số nguyên từ bàn phím.
//nextDouble(): Dùng để đọc số thực từ bàn phím.
//nextLine(): Dùng để đọc một dòng văn bản (xâu ký tự) từ bàn phím
