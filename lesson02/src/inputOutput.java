import java.util.Scanner;

public class inputOutput {
    public static void main(String[] args) {
        //khai bao biến
        int a, b=100;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        a = sc.nextInt();

        int c = a+b;
        System.out.println("\nThe sum is: " + c);

        System.out.printf("\n %d + %d=%d\n", a, b, c);

        b++;
        System.out.printf("\n The difference is: %d\n" +b);
        System.out.printf("\n The product is: %d\n", ++b);
    }
}
