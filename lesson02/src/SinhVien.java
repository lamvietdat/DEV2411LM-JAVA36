import java.util.Scanner;

public class SinhVien {
    String name;
    String address;
    int soLanThi;
    float diemJava;
    float lePhiThi;
    char gioiTinh;

    void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập name: ");
        name=sc.nextLine();
        System.out.printf("Nhập address: ");
        address=sc.nextLine();


        System.out.printf("Nhập số lần thi: ");
        soLanThi=sc.nextInt();
        System.out.printf("Nhập điểm Java: ");
        diemJava=sc.nextFloat();
        System.out.printf("Nhập lệ phí thi: ");
        lePhiThi=sc.nextFloat();
        System.out.printf("Giới tính: ");
        gioiTinh=sc.next().charAt(0);

    }
    public static void main(String[] args) {
        //khởi tạo
        SinhVien sv = new SinhVien();
        sv.nhapThongTin();
        //In ra màn hình
        System.out.printf("Name: "+sv.name);
        System.out.printf("\nAddress: "+sv.address);
        System.out.printf("\nSoLanThi: "+sv.soLanThi);
        System.out.printf("\nDiemJava: "+sv.diemJava);
        System.out.printf("\nLePhiThi: "+sv.lePhiThi);
        System.out.printf("\nGioiTinh: "+sv.gioiTinh);
    }

}
//Từ số sang chuỗi cần nextLine
