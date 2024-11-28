import java.util.Scanner;

public class Lab02_bth1 {
    private String name;
    private String address;
    private double salary;

    //tạo hàm input():nhập thông tin
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập name: ");
        name = sc.nextLine();
        System.out.printf("Nhập address: ");
        address = sc.nextLine();
        System.out.printf("Nhập salary: ");
        salary = sc.nextDouble();
    }
    void view(){
        System.out.printf("Name: "+name);
        System.out.printf("Address: "+address);
        System.out.printf("Salary: "+salary);
    }

    public static void main(String[] args) {
        Lab02_bth1 b = new Lab02_bth1();
        b.input();
        b.view();
    }
}
