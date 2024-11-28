import java.util.Scanner;

public class Lab02_bth2 {
    String ten;
    String nhaSanXuat;
    int soLuongBanhXe;
    void nhapThongtin(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập tên: ");
        ten = sc.nextLine();
        System.out.printf("Nhập nhà sản xuất: ");
        nhaSanXuat = sc.nextLine();
        System.out.printf("Nhập số lượng bánh xe: ");
        soLuongBanhXe = sc.nextInt();
    }
    void hienThiThongTin(){
        System.out.printf("Tên: "+ten);
        System.out.printf("\nNhà sản xuất: "+nhaSanXuat);
        System.out.printf("\nSố lượng bánh xe: "+soLuongBanhXe);
    }

    public static void main(String[] args) {
        Lab02_bth2 b = new Lab02_bth2();
        b.nhapThongtin();
        b.hienThiThongTin();
    }
}
