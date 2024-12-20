package BaiTapTuLam;

import javax.xml.transform.Source;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        int n=10;
        int[] arr=new int[n];
        Scanner scanner=new Scanner(System.in);

        System.out.println("Nhập" + n + "số nguyên: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tứ thứ "+ (i+1) +":");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Mảng vừa nhập là: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]+"");
        }
    }
}
