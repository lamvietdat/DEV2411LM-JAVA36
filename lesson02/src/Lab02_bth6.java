import java.util.Scanner;

public class Lab02_bth6 {
    double a,b,c;
    void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập cạnh a: ");
        a = sc.nextDouble();
        System.out.printf("Nhập cạnh b: ");
        b = sc.nextDouble();
        System.out.printf("Nhập cạnh c: ");
        c = sc.nextDouble();
    }
    void tinhToan(){
        System.out.printf("a = "+a);
        System.out.printf("\nb = "+b);
        System.out.printf("\nc = "+c);
        if(a>0&&b>0&&c>0&&a+b>c&&b+c>a&&c+b>a){
            //tính chu vi
            double chuVi=a+b+c;
            System.out.printf("\nfChu vi tam giác là: "+chuVi);
            double nuaChuVi=chuVi/2;
            double dienTich=Math.sqrt(nuaChuVi * (nuaChuVi - a) * (nuaChuVi - b) * (nuaChuVi - c));
            System.out.printf("/\nDiện tích tam giác là: "+dienTich);
        }else {
            System.out.printf("\nBa cạnh đã nhập không tạo thành 1 tam giác");
        }
    }

    public static void main(String[] args) {
        Lab02_bth6 lab = new Lab02_bth6();
        lab.nhapThongTin();
        lab.tinhToan();
    }
}
// công thức tính diện tích tam giác Math.sqrt(nuaChuVi * (nuaChuVi - a) * (nuaChuVi - b) * (nuaChuVi - c));