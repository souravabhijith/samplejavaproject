
/**
 * Created by aravuri on 23/03/19.
 */
public class B {

    private int value;
    A a;

    public B (A a) {
        this.a = a;
    }

    public int diff(int a,int b) {
        return a - b;
    }

    public int[] firstn(int n) {
        int arr[] = new int[n];
        for (int i=0;i<n;i++) {
            arr[i] = i+1;
        }
        return arr;
    }

    public void setAValue(int value) {
         a.setValue(value);
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
