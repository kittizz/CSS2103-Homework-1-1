import java.util.Arrays;
import java.util.Random;

public class n5 {
    public static void main(String[] args) {

        int[] coin = {1,1,1 ,1,1,1 ,1,1,1};

        Random rn = new Random();
        int answer = rn.nextInt(9) + 1;
        coin[answer-1] = 0;

        System.out.println("answer : "+ answer);
        System.out.println(Arrays.toString(coin));
        System.out.println("Weighing 1");
        BalanceType Weighing_1 = BalanceScale(Tray( coin[0],coin[1],coin[2]) , Tray(coin[3],coin[4],coin[5] ));
        if ( Weighing_1 == BalanceType.BALANCED){
            System.out.println("Weighing 2");
            BalanceType Weighing_2 = BalanceScale( coin[6] , coin[7]);
            if (Weighing_2 == BalanceType.BALANCED){
                System.out.println("fake coin is "+ 9);
                return;
            }
            if (Weighing_2 == BalanceType.LEFT){
                System.out.println("fake coin is "+ 8);
                return;
            }
            System.out.println("fake coin is "+ 7);
            return;
        }else {
            //ถ้าซ้ายมาก เอาขวามาแบ่งชั่ง
            if (Weighing_1 == BalanceType.LEFT){
                System.out.println("Weighing 2");
                BalanceType Weighing_2 = BalanceScale( coin[3] , coin[4]);
                if (Weighing_2 == BalanceType.BALANCED){
                    System.out.println("fake coin is "+ 6);
                    return;
                }
                if (Weighing_2 == BalanceType.LEFT){
                    System.out.println("fake coin is "+ 5);
                    return;
                }
                System.out.println("fake coin is "+ 4);
                return;
            }
            //ถ้าขวามาก เอาซ้ายมาแบ่งชั่ง
            if (Weighing_1 == BalanceType.RIGHT){
                System.out.println("Weighing 2");
                BalanceType Weighing_2 = BalanceScale( coin[0] , coin[1]);
                if (Weighing_2 == BalanceType.BALANCED){
                    System.out.println("fake coin is "+ 3);
                    return;
                }
                if (Weighing_2 == BalanceType.LEFT){
                    System.out.println("fake coin is "+ 2);
                    return;
                }
                System.out.println("fake coin is "+ 1);
                return;
            }
        }
    }
    enum BalanceType {
        LEFT,
        BALANCED,
        RIGHT
    }
    static BalanceType BalanceScale(int left , int right){
        if (left == right) return  BalanceType.BALANCED;
        if (left > right) return BalanceType.LEFT;
        return BalanceType.RIGHT;
    }
     static int Tray(int... integers) {
        int total = 0;
        for (int i = 0; i < integers.length; total += integers[i++]);
        return total;
    }

}
