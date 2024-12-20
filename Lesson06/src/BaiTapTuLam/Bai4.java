package BaiTapTuLam;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        System.out.println("Nhập số phần tử của mảng: ");
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int[] arr=new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Phần tử thứ " +(i+1)+ ":");
            arr[i]= scanner.nextInt();
        }
/**
 * int max = arr[0];: Biến max được gán giá trị của phần tử đầu tiên trong mảng. Ta giả định ban đầu phần tử đầu tiên là lớn nhất.
 * int min = arr[0];: Tương tự, biến min cũng được gán giá trị của phần tử đầu tiên, giả định ban đầu nó là nhỏ nhất.
 */
        int max=arr[0];
        int min=arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Phần tử lớn nhất của mảng là: "+max);
        System.out.println("Phần tử nhỏ nhất của mảng là: "+min);
    }
}
