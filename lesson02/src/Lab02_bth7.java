import java.util.Scanner;

public class Lab02_bth7 {
    int a, b, c, d;
    void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên a: ");
        a = sc.nextInt();
        System.out.printf("Nhập số nguyên b: ");
        b = sc.nextInt();
        System.out.printf("Nhập số nguyên c: ");
        c = sc.nextInt();
        System.out.printf("Nhập số nguyên d: ");
        d = sc.nextInt();
    }
    void xuatThongTin(){
        System.out.printf("Số a là: "+a);
        System.out.printf("\nSố b là: "+b);
        System.out.printf("\nSố c là: "+c);
        System.out.printf("\nSố d là: "+d);
        int x=Math.max(a,b);
        System.out.printf("\nSố lớn nhất của cặp (a,b) là: "+x);
        int y=Math.max(c,d);
        System.out.printf("\nSố lớn nhất của cặp (c,d) là: "+y);
        int soLonNhat=Math.max(x,y);
        System.out.printf("\nSố lớn nhất là: "+soLonNhat);
    }

    public static void main(String[] args) {
        Lab02_bth7 lab = new Lab02_bth7();
        lab.nhapThongTin();
        lab.xuatThongTin();
    }
}
