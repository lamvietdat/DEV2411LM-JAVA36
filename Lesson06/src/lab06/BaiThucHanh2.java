package lab06;

import java.util.Scanner;

public class BaiThucHanh2 {
    String arrNhanVien[][]=new String[3][2];
    public void nhapduLieu(){
        for(int i=0;i<arrNhanVien.length;i++){
            System.out.println("Nhap thong tin sinh vien thu"+(i+1));
            Scanner input=new Scanner(System.in);
            arrNhanVien[i][0]=input.nextLine();
            arrNhanVien[i][1]=input.nextLine();
        }
        System.out.println("Cam on da nhap du lieu");
    }
    public void sapXep(){
        for(int i=0;i< arrNhanVien.length;i++){
            for(int j=i+1;j<arrNhanVien.length;j++){
                if(Float.parseFloat(arrNhanVien[j][1])<Float.parseFloat(arrNhanVien[i][1])){
                    String temp[][]=new String[1][2];
                    //Doi cho
                    temp[0][0]=arrNhanVien[j][0];
                    temp[0][1]=arrNhanVien[j][1];

                    arrNhanVien[j][0]=arrNhanVien[i][0];
                    arrNhanVien[j][1]=arrNhanVien[i][1];

                    arrNhanVien[i][0]=temp[0][0];
                    arrNhanVien[i][1]=temp[0][1];
                }
            }
        }
    }
    public void hienThi(){
        for (int i=0;i<arrNhanVien.length;i++){
            System.out.println(arrNhanVien[i][0]+"-"+arrNhanVien[i][1]);
        }
    }

    public static void main(String[] args) {
        BaiThucHanh2 main = new BaiThucHanh2();
        main.nhapduLieu();
        main.sapXep();
        main.hienThi();
    }
}
