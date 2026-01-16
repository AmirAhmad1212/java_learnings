
// public class Question {
//     // star printing question
//     public static void main(String[] args){
//         for (int i = 1; i < 6; i++) {
//             for (int j = 1; j < 11; j++) {
//                 System.out.print( "*");
//             }
//             System.out.println();
            
//         }
//     }
// }

// public class Question{
//     public static void main(String []args){
//         for (int i = 1; i < 10; i++) {
//             for (int j = 1; j <= i; j++)
//                 System.out.print(j);
            
//             System.out.println();
//         }
//     }
// }

// public class Question{
//     public static void main(String []args){
        
//         for (int i = 1; i < 10; i++) {
//             for (int j = 1; j <= i-1; j++)
//                 System.out.print(j);
            
//             System.out.println();
//         }
//     }
// }
// public class Question{
//     public static void main(String[] args) {
//         int n = 6;
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < i; j++) {
//                 int sum = i + j;
//                 if (sum % 2 ==0) {
//                     System.out.print("1 ");
//                 } else {
//                     System.out.print("0 ");
//                 }
                
//             }
//             System.out.println("");
//         }
//     }
// }

public class Question{
    public static void main(String args[]){
        int n = 10;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n -i ; j++) {
                System.out.print(" ");           
            }
            for (int j = 1; j <= n  ; j++) {
                System.out.print("*");           
            }
            System.out.println("");
        }
    }
}