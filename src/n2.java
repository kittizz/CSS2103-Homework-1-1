import java.util.Scanner;
public class n2 {
    public static int compute1(int x, int y){
        int a1 = (int)Math.pow(x, 2);
        int s2 = x*y;
        int s3 = 2*s2;
        int d3 = (int)Math.pow(x, 2);
        int c = a1+s3+d3;
        return c;
    }
    public static int compute2(int x, int y,int n){
        int a1 = (int)Math.pow(x, n);
        int s2 = x*y;
        int s3 = 2*s2;
        int d3 = (int)Math.pow(x, n);
        int c = a1+s3+d3;
        return c;
    }
    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);
        int x;
        int y;
        int n;
        int c;
        System.out.print("enter x =");
        x=in.nextInt();
        System.out.print("enter y =");
        y=in.nextInt();
        c =compute1(x, y);
        System.out.println("x2 + 2xy + y2 = "+c);


        System.out.print("enter x =");
        x=in.nextInt();
        System.out.print("enter y =");
        y=in.nextInt();
        System.out.print("enter n =");
        n=in.nextInt();
        c =compute2(x, y,n);
        System.out.println("xn + 2xy + yn = "+c);
    }
}