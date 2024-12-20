package BaiTapTuLam;

import java.util.Random;

public class Bai2 {
    public static void main(String[] args) {
        int n=10;
        int[] arr=new int[n];
        Random random= new Random();

        for (int i = 0; i < n; i++) {
            arr[i]= random.nextInt();
        }

        System.out.println("Mảng vừa tạo là: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]+"");
        }
    }
}
