import java.util.*;
public class StonePaperScissor{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------------------------------");
        System.out.println("***WELCOME IN STONE PAPER SCISSOR GAME***");
        System.out.println("-----------------------------------------");
        System.out.println("===== Menu ====");                             //menu
        System.out.println("0.Stone");
        System.out.println("1.Paper");
        System.out.println("2.Scissor");
        int userpoint=0;
        int com_point=0;

        for(int i=0;i<5;i++){                               // 5 round match
        System.out.println("\n***Round No: "+(i+1)+"***");    
        System.out.println("Select your choice ");
        int userInput = sc.nextInt();                 // User input is the first argument passed to the program
        int computerInput = (int)(Math.random() * 3); // Generate a random number between 0 and 1 and multiply by 3 to get integer part of double number eg. 2.7555 -> 2  
        String choice;
        if(userInput==0)
        {
            choice = "Stone";
        }
        else if(userInput==1)
        {
            choice = "Paper";
        }
        else{
            choice = "Scissor";
        }
        System.out.println("User choose :: " + choice);
        System.out.print("Computer choose :: ");
        if(computerInput == 0) {
            System.out.println("Stone");
        } 
        else if(computerInput == 1) {
            System.out.println("Paper");
        }
        else {
            System.out.println("Scissors");
        }
        String result;
        /* Compare the inputs, set result accordingly */
        if(userInput == computerInput) {
            result = "It's a tie!";
        }
        else if((userInput - computerInput == 1 || userInput - computerInput == -2)) {
            result = "You win!";
            userpoint++;
        }
        else {
            result = "You lose!";
            com_point++;
        }
        System.out.println(result);

        if(i==4){                 //for declaring final winner at last iteration/round
        String winner;
        if(userpoint > com_point){
            winner = "** You Win!,Congrast!! **";
        }
        else if(userpoint==com_point){
            winner = "** It's a Draw **";
        }
        else{
            winner = "-- You Lose!!! --";
        }
        System.out.println("\nYour Score: "+userpoint+"/5");             //display points
        System.out.println("Computer Score: "+com_point+"/5");
        System.out.println("\n-----------------------------");
        System.out.println("Final Result: "+winner);                    //declare winner
        System.out.println("-----------------------------");
        }
    }
        
}
}


        
        
