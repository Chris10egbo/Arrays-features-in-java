package ArrayReversalMethods;

public class UsingWhileLoop {
    public static void main(String[] args) {
        int [] arr = { 2, 4,6,3,9,5};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int [] b = reverse(arr);
        for (int i : b) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

    private static int [] reverse(int[] a) {
        int i =0,j = a.length-1;
        while (i<j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
            
        }
        return a;
    }
}
