package unit2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class WriteToFile {

    private ArrayList<Object> order;
    private double orderTotal;

    public WriteToFile(ArrayList<Object> order, double orderTotal) {
        try {
            File salesData = new File("salesData.txt");
            FileWriter fw = new FileWriter(salesData, true);
            PrintWriter salesWriter = new PrintWriter(fw);

            for (int i = 0; i < order.size(); i++) {
                System.out.println("Writing :" + order.get(i));
                salesWriter.println(order.get(i));
            }
            salesWriter.println("Total: "+ orderTotal);
            salesWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}
