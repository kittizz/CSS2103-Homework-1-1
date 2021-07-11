import java.util.Scanner;

public class n1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("กรุณากรอกตัวเลขของรัศมี : ");
        double r = scan.nextDouble();

        scan.close();

        System.out.println("พื้นที่ของวงกลม คือ "+ Math.PI * (r * r));
    }
}