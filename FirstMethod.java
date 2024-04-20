
package ArrayReversalMethods;

/**
 * FirstMethod
 */
public class FirstMethod {

    public static void main(String[] args) {
        int [] arr = { 10,20,50,40,30, 100, 60,48,23};
        reverse(arr,arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();    
    }
    private static void reverse(int[] a, int n) {
        // create a new array 
        int [] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j-1] = a[i];
            j=j-1;
            
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();

    }
}