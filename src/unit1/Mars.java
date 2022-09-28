package unit1;

public class Mars {

    public static boolean landingCheck(int loops) throws InterruptedException {

        for (int i = 0; i <= loops; i++) {
            if (i%3 == 0 && i%5 == 0) {
                System.out.println("Keep center");
            } else if (i%5 == 0) {
                System.out.println("Right");
            } else if (i%3 == 0) {
                System.out.println("Left");
            } else {
                System.out.println("Calculating...");
            }

            Thread.sleep(250);
        }

        System.out.println("Landed");

        return false;

    }
    public static void main(String[] args) throws InterruptedException {
        String      colonyName      = "Arcadia";
        String      landingLocation = "The Plain";
        int         shipPopulation  = 300;
        double      shipFood        = 4000.00;
        boolean     landing         = true;
        int         days            = 2;

        for (int i = 0; i < days; i++) {
            shipFood -= (shipPopulation * 0.75);
        }

        System.out.println("Remaining food after " + days + " of voyage: " + shipFood);

        shipFood = shipFood * 1.5;

        shipPopulation += 5;

        if (landingLocation.equalsIgnoreCase("the plain")) {
            System.out.println("\nBbzzz Landing on the Plain");
        } else {
            System.out.println("\nERROR!!! Flight plan already set. Landing on the Plain");
        }

        landing = landingCheck(5);

        //new GuessingGame();

        //new MarsExpedition();

        new FindingsLists();
    }
}
