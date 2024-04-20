package ArrayReversalMethods;

public class CreateArrayElements {
    public static void main(String[] args) {
        int [] vee = new int[10];
        for (int i = 0; i < vee.length; i++) {
            vee[i] = 5 * (i+1);
            System.out.print(vee[i] + " ");
        }
        System.out.println();
    }
}
