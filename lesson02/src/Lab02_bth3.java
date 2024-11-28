import java.util.Scanner;

public class Lab02_bth3 {
    private String ten;
    private String maSv;
    private float diemLyThuyetJava;
    private float diemThucHanhJava;

    void nhapThongTin(){
       Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập tên: ");
        ten = sc.nextLine();
        System.out.printf("Nhập mã sinh viên: ");
        maSv = sc.nextLine();
        System.out.printf("Nhập điểm lý thuyêt Java: ");
        diemLyThuyetJava = sc.nextFloat();
        System.out.printf("Nhập điểm thực hành Java: ");
        diemThucHanhJava = sc.nextFloat();

    }
    void xepLoai(){
        System.out.printf("Tên: "+ten);
        System.out.printf("\nMã sinh viên: "+maSv);
        if(diemLyThuyetJava <4){
            System.out.printf("\nThi lại lí thuyết");
        }
        if (diemThucHanhJava <4){
            System.out.printf("\nThi lại thực hành");
        }

        float diemTrungBinh=(diemLyThuyetJava+diemThucHanhJava)/2;
        if (diemTrungBinh<4){
            System.out.printf("\nSinh viên phải học lại");
        } else {
            if(diemTrungBinh>=4 && diemTrungBinh<=7){
                System.out.printf("\nSinh viên đạt môn Java");
            } else {
                System.out.printf("\nSinh viên xuất sắc môn Java");
            }
        }
    }

    public static void main(String[] args) {
        Lab02_bth3 bth3 = new Lab02_bth3();
        bth3.nhapThongTin();
        bth3.xepLoai();
    }
}
