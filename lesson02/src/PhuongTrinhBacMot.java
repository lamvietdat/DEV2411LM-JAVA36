import java.util.Scanner;

public class PhuongTrinhBacMot {
    float   a,b;
    float x;
    //hàm nhập
    void nhapGiuLieu() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập hệ số a: ");
        a = sc.nextFloat();
        System.out.printf("Nhập hệ số b: ");
        b = sc.nextFloat();
    }
    //hàm giải phuoương trình bậc 1
    void giaiPhuongTrinh() {
        if(a!=0){
            x=-b/a;
            System.out.printf("Phương trình %.1f + %.1f = 0 có nghiệm x=%f" ,a,b,x);
        }else {
            if(b==0){
                System.out.printf("Phương trình %.1f + %.1f = 0 có voo số nghiệm",a,b);
            }else {
                System.out.printf("Phương trình %.1f + %.1f= 0 vo nghiem",a,b);
            }
        }
    }
    public static void main(String[] args) {
        PhuongTrinhBacMot pt = new PhuongTrinhBacMot ();
        pt.nhapGiuLieu();
        pt.giaiPhuongTrinh();

    }
}
