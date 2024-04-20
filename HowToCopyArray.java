package ArrayReversalMethods;

public class HowToCopyArray {
    public static void main(String[] args) {

        int[] arr = { 2,5,4,7,3,9,8};
         System.out.println("Original Array ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("copied Array ");
        int [] c = copyArray(arr,arr.length);
        for (int i : c) {
            System.out.print(i+ " ");
        }
        System.out.println();
    }

    private static int [] copyArray(int[] a, int N) {
        // create a new array inside the method
        int [] b = new int[N];
        for (int i = 0; i < N; i++) {
            b[i] = a[i];
        }
        return b;
    }
}
