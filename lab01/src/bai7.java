import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập số thứ nhất: ");
        int n = sc.nextInt();
        System.out.printf("Nhập số thứ hai: ");
        int n2 = sc.nextInt();
        int max,min;
        if(n>n2){
            max = n;
            min = n2;
        }
        else{
            max = n2;
            min = n;
        }

        System.out.printf("Số lớn là: " +max);
        System.out.printf("\nSố nhỏ là: "+min);
    }
}
