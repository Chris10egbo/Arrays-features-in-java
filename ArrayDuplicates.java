package ArrayReversalMethods;

public class ArrayDuplicates {
    public static void main(String[] args) {
        
        int [] arr = {1,2,3,4,5,1,2,3,1,3,2};
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        int [] b = duplicates(arr);
        for (int i : b) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static int [] duplicates(int[] a) {
        int [] c = new int[a.length];
        int k =0;
        for (int i = 0; i < a.length-1; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    c[k] = a[i];
                    k++;
                }
            }
        }
        return c;
    }
}
