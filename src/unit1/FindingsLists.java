package unit1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class FindingsLists {

    public FindingsLists() throws InterruptedException {
        Thread.sleep(500);

        System.out.println("Rock data download...");

        ArrayList<String> rockList = new ArrayList<>() {{
            add("Rock");
            add("Weird Rock");
            add("Smooth Rock");
            add("Not Rock");
        }};

        System.out.println(rockList);

        System.out.println("Wait a minute that's not a rock, we need to delete that one from the list");

        rockList.remove("Not Rock");

        System.out.println(rockList);

        System.out.println("Perfect");

        Thread.sleep(500);
        System.out.println("Fossil data download...");
        HashMap<String, String> fossilDirectory = new HashMap<>() {{
            put("Bird Fossil", "The fossil has wings implying it was capable of flight");
            put("Fish Fossil", "The fossil is vaguely fish shaped implies there was once water");
            put("Tooth Fossil", "The tooth from an unknown fossil");
        }};

        System.out.println("Which of the fossils would you like to learn more about? (Spelling and spacing is important)");

        Scanner input = new Scanner(System.in);
        String fossilChoice = input.nextLine();

        if (fossilChoice.equals("Bird Fossil")) {
            System.out.println("Fossil: " + fossilChoice + "\n" + fossilDirectory.get(fossilChoice));
        } else if (fossilChoice.equals("Fish Fossil")) {
            System.out.println("Fossil: " + fossilChoice + "\n" + fossilDirectory.get(fossilChoice));
        } else if (fossilChoice.equals("Tooth Fossil")) {
            System.out.println("Fossil: " + fossilChoice + "\n" + fossilDirectory.get(fossilChoice));
        } else {
            System.out.println("We have no record of that fossil.");
        }

        Thread.sleep(500);

        HashSet<String> suppliesBrought = new HashSet<>() {{
            add("Food");
            add("Water");
            add("Medicine");
        }};

        HashSet<String> suppliesUsed = new HashSet<>() {{
            add("Food");
            add("Water");
        }};

        HashSet<String> suppliesLeft =  (HashSet)suppliesBrought.clone();
        suppliesLeft.removeAll(suppliesUsed);

        System.out.println(suppliesLeft);

    }
}
