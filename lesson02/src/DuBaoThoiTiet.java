import java.util.Scanner;

public class DuBaoThoiTiet {
    int status;
    void nhapDuLieu(){
        System.out.printf("Chương trình dự báo thời tiết chuồn chuồn");
        System.out.printf("\n1. Bay thấp");
        System.out.printf("\n2. Bay cao");
        System.out.printf("\n3. Bay vừa");
        System.out.printf("\n4. Say cmn rồi!");
        System.out.printf("\nMời nhập 1,2,3 hoặc 4");
        Scanner sc = new Scanner(System.in);
        status = sc.nextInt();
        System.out.printf("Cảm ơn đã nhập");
    }
    void hienThiDuBao(){
        switch (status){
            case 1:
                System.out.printf("\nDự báo: Mưa, khi ra khỏi nhà nhớ mang ô");
                break;
            case 2:
                System.out.printf("\nDự báo: Nắng nhớ mang ô nhé");
                break;
            case 3:
                System.out.printf("\nDự báo: Râm, mát trời");
                break;
            case 4:
                System.out.printf("\nDự báo: Nhậu say méo trả lời");
                break;
                default:
            case 5:
                System.out.printf("\nKhông có kết quả");
                break;
        }
    }

    public static void main(String[] args) {
        DuBaoThoiTiet dtb = new DuBaoThoiTiet();
        dtb.nhapDuLieu();
        dtb.hienThiDuBao();
    }
}
