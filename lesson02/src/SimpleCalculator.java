import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        //khai báo
        int soA, soB;
        float ketQua=0.0f;
        String phepTinh;
        //nhập dữ liệu
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập A: ");
        soA = sc.nextInt();
        System.out.printf("Nhập B: ");
        soB = sc.nextInt();
        System.out.printf("Phép tính: ");
        phepTinh = sc.nextLine();
        //thực hiện phép tính
        switch (phepTinh){
            case "+":
                ketQua=soA+soB;
                break;
            case "-":
                ketQua=soA-soB;
                break;
                case "*":
                    ketQua=soA*soB;
                    break;
                    case "/":
                        ketQua=soA/soB;
                        break;

        }
        System.out.printf("Kết quả: "+ketQua);
    }
}
