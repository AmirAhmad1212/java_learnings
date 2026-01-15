import java.util.*;

public class conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if (number >= 18) {
            System.out.println("you are an Adult");
        } else {
            System.out.println("you are not an adult");
        }
    }
}
