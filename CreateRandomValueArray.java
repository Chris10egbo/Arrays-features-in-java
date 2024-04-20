package ArrayReversalMethods;

public class CreateRandomValueArray {
    public static void main(String[] args) {
        
        double [] a = new double[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = Math.random();
            System.out.printf("%.2f %n ",a[i]);
        }
       
    }
}
