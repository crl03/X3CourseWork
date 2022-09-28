package unit1;

import java.util.Scanner;

public class MarsExpedition {


    public MarsExpedition() {
        Scanner input = new Scanner(System.in);

        print("Expedition prep program starting...");
        print("Booting up...");
        print("...");
        print("...");
        print("...");
        print("Ready");

        print("Hello user.  What is your name?");
        String name = input.next();

        print("Hi " + name + " - Welcome to the Expedition prep program.  Are you ready to head out into the new world? Type (Y) or (N):");
        String excited = input.next();
        if (excited.equalsIgnoreCase("y")) {
            print("I knew you would say that.  You are team leader for a reason.");
        } else {
            print("Too bad, you are team leader.  You have to go.");
        }

        print("How many people do you want on your expedition team? (Input an int number)");
        int teamSize = input.nextInt();
        input.nextLine();

        if (teamSize > 2) {
            print("That's way too many.  We can only send two members.");
            teamSize = 2;
        } else if (teamSize < 2) {
            print("That's not enough people.  We need you and two more members.");
            teamSize = 2;
        } else {
            print("That's the perfect sized team.  Good job!");
        }

        print("You are allowed to bring one weapon with you. You know, just in case. What do you want to bring?");
        String weapon = input.next();
        print("Nice choice.  You'll be bringing that " + weapon + " with you.");

        print("You have a choice of 3 vehicles.\nA: Mars Rover\nB: Chevy Silverado\nC: Honda Civic");
        String vehicleChoice = input.next();
        switch (vehicleChoice.toLowerCase()) {
            case "a" : vehicleChoice = "Mars Rover"; break;
            case "b" : vehicleChoice = "Chevy Silverado"; break;
            case "c" : vehicleChoice = "Honda Civic"; break;
            default : vehicleChoice = "Your feet";
        }

        input.close();

        print("Your expedition team is now ready.\nLead by " + teamSize
                + " teammates.\nTo explore the surface of Mars using vehicle " + vehicleChoice
                + ".\nTeam heads out in 5\n4\n3\n2\n1\nGO GO GO!");




    }

    private static void print(String output) {
        System.out.println(output);
    }
}
