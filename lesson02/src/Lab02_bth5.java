import java.util.Scanner;

public class Lab02_bth5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập vào một số nguyên N : ");
        int n = sc.nextInt();
        if(n%2==0){
            System.out.printf(n + " là số chẵn");
        }else {
            System.out.printf(n + " là số lẻ");
        }
    }
}
