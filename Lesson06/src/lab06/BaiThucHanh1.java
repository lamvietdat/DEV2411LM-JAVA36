package lab06;

import java.util.Scanner;

public class BaiThucHanh1 {
    public static void main(String[] args) {
        String[] arrSinhVien=new String[3];
        for(int i=0;i< arrSinhVien.length;i++){
            Scanner input=new Scanner(System.in);
            arrSinhVien[i]= input.nextLine();
        }
        for(String arrSinhVien1:arrSinhVien){
            System.out.println(arrSinhVien1);
        }
    }
}
