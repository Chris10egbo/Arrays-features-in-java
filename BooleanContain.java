package ArrayReversalMethods;

public class BooleanContain {
    public static void main(String[] args) {
        int [] arr = {10,20,23,30,15};
        int item = 15;
        boolean met = contains(arr,item); 
        System.out.println(met);
    }

    private static boolean contains(int[] arr, int item) {
        for (int i : arr) {
            if (i==item) {
                return true;
            }
        }
        return false;
    }
}
