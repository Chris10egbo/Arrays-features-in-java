
    package ArrayReversalMethods;
    
    /**
     * UseMethodReversal
     */
    public class UseMethodReversal {
    // Reverse an array without using a temp variable
        public static void main(String[] args) {
            System.out.println("Original Array Value");
            int [] arr = {2,6,15,3,7,8,1,10,5};
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            System.out.println("The reversed array value");
            int [] wort = reversal(arr);
            for (int i : wort) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        private static int[] reversal(int[] list) {
            // Create a new array
            int [] result = new int[list.length];
            for (int i = 0, j = result.length-1; i < list.length; i++,j--) {
                result[j] = list[i];
            }
            return result;
            
        }
    }
