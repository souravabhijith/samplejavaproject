
/**
 * Created by aravuri on 23/03/19.
 */
public class A {

    private int value;
    private char turn;

    public int sum(int a,int b) {
        return a + b;
    }

    public int[] firstn(int n) {
        int arr[] = new int[n];
        for (int i=0;i<n;i++) {
            arr[i] = i+1;
        }
        return arr;
    }

    public int returnInt(int a) {
        return a;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
