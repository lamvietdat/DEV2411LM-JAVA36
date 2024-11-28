import java.util.Scanner;

public class Lab02_bth4 {
    //hàm giải phương trình bậc nhất
    void giaiPhuongTrinhB1(float a, float b){
        if (a == 0) {
            if(b==0){
                System.out.printf("\n Pt: %.1f + %.1f = 0 => Pt có vô số nghiệm",a,b);
            }else {
                System.out.printf("\n Pt: %.1f + %.1f = 0 => Pt vô nghiệm",a,b);
            }
        }else{
            float x= -b/a;
            System.out.printf("\n Pt: %.1f + %.1f = 0 => Pt có nghiệm x=%.1f",a,b,x);
        }
    }

    //hàm giải phương trình bậc 2
    void giaiPhuongTrinhB2(float a, float b, float c){
        if (a == 0) {
            giaiPhuongTrinhB1(b,c);
        }else {
            float delta= b*b-4*a*c;
            if(delta<0){
                System.out.printf("\n Pt: %.1f*x^2 + %.1f*x + %.1f => vô nghiêm",a,b,c);
            }else if(delta==0){
                float x= -b/2*a;
                System.out.printf("\n Pt: %.1f*x^2 + %.1f*x + %.1f => Pt có nghiệm kép ",a,b,c,x);
            }else {
                float  x1=(-b-(float)Math.sqrt(delta))/2*a;
                float  x2=(-b+(float)Math.sqrt(delta))/2*a;
                System.out.printf("\n Pt: %.1f*x^2 + %.1f*x + %.1f => Pt có 2 nghiệm",a,b,c);
                System.out.printf("\n x1 = %.1f",x1);
                System.out.printf("\n x2 = %.1f",x2);
            }
        }
    }
    //test
    public static void main(String[] args) {
        float a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.printf("a= ");
        a = sc.nextFloat();
        System.out.printf("b= ");
        b = sc.nextFloat();
        System.out.printf("c= ");
        c = sc.nextFloat();

        Lab02_bth4 g = new Lab02_bth4();
        g.giaiPhuongTrinhB2(a,b,c);


    }
}
