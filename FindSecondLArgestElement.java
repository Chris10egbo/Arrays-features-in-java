package ArrayReversalMethods;

public class FindSecondLArgestElement {
    public static void main(String[] args) {
        int [] arr = {6,8,2,20,25,30,3,1,9,7,15,12};
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        int feel = secondLarge(arr,arr.length);
        System.out.println(feel);
    }

    private static int secondLarge(int[] a, int length) {
        int b = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                    b = a[j];
                }
            }
        }

        return b;
    }
}
