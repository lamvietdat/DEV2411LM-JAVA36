package BaiTapTuLam;

import java.util.Random;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();

        System.out.println("Nhập số lượng mảng: ");
        int n= scanner.nextInt();
        int[] arr=new int[n];
        System.out.println("Bạn muốn nhập bằng tay thì ấn phím 1");
        System.out.println("Bạn muốn nhập tự dộng thì ấn phím 2");
        int choose=scanner.nextInt();

        if(choose==1){
            System.out.println("Nhập số phần tử của mảng: ");
            for (int i = 0; i < n; i++) {
                System.out.println("Phần tử thứ " +(i+1)+ ":");
                arr[i]=scanner.nextInt();
            }
        }else if (choose==2){
            System.out.println("Mảng ngẫu nhiên: ");
            for (int i = 0; i < n; i++) {
                arr[i]=random.nextInt()  ;
            }
        }else {
            System.out.println("Lựa chọn không hợp lệ");
            return;
        }
        System.out.println("Mảng vừa nhập");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]+ "");
        }
    }
}
