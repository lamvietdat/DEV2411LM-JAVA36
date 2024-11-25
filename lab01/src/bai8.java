import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập số thứ nhất: ");
        int n = sc.nextInt();
        System.out.printf("Nhập số thứ hai: ");
        int n2 = sc.nextInt();
        System.out.printf("Nhập số thứ ba: ");
        int n3 = sc.nextInt();
        int max=Math.max(n,Math.max(n2,n3));
        int min=Math.min(n,Math.min(n2,n3));
        System.out.printf("Số lớn nhất là: "+max);
        System.out.printf("\nSố nhỏ nhất là: "+min);
        sc.close();
    }
}
//Sử dụng hàm Math.max lồng nhau:
//Liên tục gọi hàm Math.max để so sánh từng cặp số, kết quả của mỗi lần so sánh lại được so sánh với số tiếp theo.
//Ví dụ so sánh 2 số Math.max(num1,num2)
// so sánh 3 số Math.max(num1, Math.max(num2,num3))
// so sánh 4 số Math.max(num1, Math.max(num2,(Math.max(num3,num4)))
//hàm Math.min cũng tương tự như hàm Math.max
