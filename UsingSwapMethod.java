package ArrayReversalMethods;

public class UsingSwapMethod {
    public static void main(String[] args) {
        // function swap array's first element with last element, second element with 
        // second to the last
        int [] arr = { 10, 30,20,50,40,100};
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        int [] ret =reverse(arr,arr.length);
        for (int i : ret) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    

    private static int[] reverse(int[] a, int n) {
        for (int i = 0; i < n/2; i++) {
            int temp = a[i];
            a[i] = a[n-i-1];
            a[n-i-1] = temp;
        }
        return a;

    }
}
