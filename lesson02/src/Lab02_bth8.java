import java.util.Scanner;

public class Lab02_bth8 {
    int thang, nam;
    void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập tháng: ");
        thang = sc.nextInt();
        System.out.printf("Nhập năm: ");
        nam = sc.nextInt();
    }
    void kiemTraNgayTrongThang(){
        System.out.printf("Tháng: "+thang);
        System.out.printf("\nNăm: "+nam);
        switch (thang){
            case 1,3,5,7,8,10,12:
                System.out.printf("\nTháng có 30 ngày");
                break;
            case 4,6,9,11:
                System.out.printf("\nTháng có 31 ngày");
                break;
            case 2:
                if(nam%4==0){
                    System.out.printf("\nTháng 2 có 29 ngày");
                }else {
                    System.out.printf("\nTháng 2 có 28 ngày");
                }
                break;
        }
    }

    public static void main(String[] args) {
        Lab02_bth8 bth8 = new Lab02_bth8();
        bth8.nhapThongTin();
        bth8.kiemTraNgayTrongThang();
    }
}
