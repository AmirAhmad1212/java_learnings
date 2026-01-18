public class array {


    public static void main(String[] args) {
        // for declairing 2D arrays
        int [][] numbers = {
            {1,2,3,4},
            {5,6,7,8},
            {9,0,11,12}
        };
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j ++) {
                System.out.print(numbers[i] + " " + [j]);
            }
            System.out.println();
            
        }
        
    }
}