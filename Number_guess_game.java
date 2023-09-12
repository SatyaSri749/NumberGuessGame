import java.util.Scanner;
import java.lang.*;

public class Number_guess_game {

    /**
     * 
     */
    public static void guessnum_game(){
        int i,gen_num,guess_num;
        Scanner sc = new Scanner(System.in);
        

    gen_num = (int)(Math.random()*100)+1;

    int trails =5;
    int k=trails;
    System.out.println("A number is choosen by the computer between 1 to 100");
    System.out.println("So guess the number with in "+ trails + "trails");
    for(i=0; i<trails; i++)
    {
        guess_num = sc.nextInt();
        if(gen_num == guess_num)
        {
            System.out.println("You win!! You gussed Correct number.");
            break;
        }
        else if(guess_num>gen_num && i<k)
        {
            System.out.println("You are too high!! Please try once again.");
            System.out.println("you have just " + (k-1) + " trails left");
            k--;
        }
        else if(guess_num<gen_num && i<k)
        {
            System.out.println("you are too low!! please try once again");
            System.out.println("you have just "+ (k-1) +" trails left");
            k--;
        }
    }

    if(i==trails)
    {   
        System.out.println("You lost all attempst.");
        System.out.println("The correct answer was "+ gen_num);
    }
    }

    public static void main(String args[])
    {
        guessnum_game();

    }
}
	
		
		