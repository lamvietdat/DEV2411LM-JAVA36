import java.util.Scanner;

public class Lab02_bth10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập kí tự: ");
        char n = sc.next().charAt(0);
        System.out.printf("\nKí tự: "+n);
        switch (Character.toUpperCase(n)) {
            case 'R':
                System.out.printf("\nRED");
                break;
                case 'G':
                    System.out.printf("\nGREEN");
                    break;
                    case 'B':
                        System.out.printf("\nBLUE");
                        break;
                        default:
                            System.out.printf("\nBlack");
        }
    }
}
/*Sử dụng Character.toUpperCase(color)
để chuyển ký tự nhập vào thành chữ in hoa, giúp đơn giản hóa việc so sánh.
 */
