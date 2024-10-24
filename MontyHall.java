import java.util.*;

public class MontyHall {
    public static void main(String args[]) {
        System.out.println("Monty Hall Problem Simulator");
        GetParameters();
    }
    public static void GetParameters() {

        Scanner input = new Scanner(System.in);

        System.out.println("How many attempts would you like to simulate? ");
        int attempts = input.nextInt();

        System.out.println("Do you want to stay with your final answer (0), or switch (1)? ");
        int stayOrswitch = input.nextInt();

        input.close();

        ComputeStart(attempts,stayOrswitch);

    }
    
    public static void ComputeStart(int attempts, int stayOrswitch) {
        
        for (int i = 1; i <= attempts ; i++) {

            // Random door = new Random();
            

        }

    }


}