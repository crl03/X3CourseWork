package unit2;

import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;

public class CreateFile {

    public CreateFile() {
        try {
            File salesData = new File("salesData.txt");

            if (salesData.createNewFile()) {
                System.out.println("File created: " + salesData.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }


}
