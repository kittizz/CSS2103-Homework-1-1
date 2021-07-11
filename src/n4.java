import java.util.ArrayList;
import java.util.Random;

public class n4 {

    private ArrayList<Integer> array1 = new ArrayList<Integer>();
    private ArrayList<Integer> array2 = new ArrayList<Integer>();

    public static void main(String[] args) {
        int count = 10000;

        long first = System.nanoTime();
        n4 n =  new n4();
        n.setArray1(randomArray(count));
        n.setArray2(randomArray(count));

        System.out.println("Count :"+count);
        System.out.println("Array1 :"+n.array1);
        System.out.println("Array2 :"+n.array2);
        System.out.println("Unique Value ("+n.getUniqeElements().size()+"):"+n.getUniqeElements());
        System.out.println("Run Time:"+(System.nanoTime() -first));
    }
    static int[] randomArray(int n){
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            Random rn = new Random();
            int rN = rn.nextInt(n) + 1;
            arr[i] = rN;
        }
        return arr;
    }
    void  setArray1(int[] arr){
        for (int i : arr) {
          this.array1.add(i);
        }
    }
    void  setArray2(int[] arr){
        for (int i : arr) {
            this.array2.add(i);
        }
    }
    ArrayList<Integer> getUniqeElements(){
        ArrayList<Integer> newArr = new ArrayList<Integer>();

        for (int n : array2) {
            if (!array1.contains(n)){
                if (!newArr.contains(n)){
                    newArr.add(n);
                }
            }
        }
        return newArr;
    }

}
