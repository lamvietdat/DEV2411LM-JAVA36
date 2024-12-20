package BaiTapTuLam;

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử của mảng: ");
        int n=scanner.nextInt();
        int[] arr=new   int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Phần tử thứ " + ( i +1 ) + ":");
            arr[i]= scanner.nextInt();
        }
        System.out.println("Số chẳn là: ");
        for (int soChan:arr){
            if(soChan%2==0){
                System.out.println(soChan + "");
            }
        }
    }
}
