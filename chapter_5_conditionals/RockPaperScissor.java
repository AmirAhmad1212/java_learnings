import java.util.*;
public class RockPaperScissor{
    public static void main(String args[]){



        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your choice Rock Paper Scisser:");
        String playerChoice = sc.nextLine();
        playerChoice=playerChoice.toLowerCase();


        String [] choices = {"rock","paper","scissor"};        
        Random rand = new Random();
        int randomchoice = rand.nextInt(choices.length);
        String compChoice = choices[randomchoice];

        System.out.println("computer choice was :" + compChoice);
        System.out.println("player choice was :" + playerChoice );



        if (playerChoice.equals("rock") && compChoice.equals("scissor") ) {
            System.out.println("player wins 🎉🎊");
            
        }else if (playerChoice.equals("scissor") && compChoice.equals("paper")) {
            System.out.println("player wins 🎉🎊");
            
        
        }else if (playerChoice.equals("paper") && compChoice.equals("rock")) {
            System.out.println("player wins 🎉🎊");
            
        
        }else if (playerChoice.equals("scissor") && compChoice.equals("rock")) {
            System.out.println("computer wins 😪");
            
        
        }else if (playerChoice.equals("paper") && compChoice.equals("scissor")) {
            System.out.println("computer wins 😪");
            
        
        }else if (playerChoice.equals("rock") && compChoice.equals("paper")) {
            System.out.println("computer wins 😪");
        
        }
        else{
            if (playerChoice.equals(compChoice)) {
                System.out.println("its a tie :");
            }
        }



    }
}