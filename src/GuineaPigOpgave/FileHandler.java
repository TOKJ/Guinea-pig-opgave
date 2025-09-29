package GuineaPigOpgave;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileHandler {

    //private BufferedReader br;
    //private String fileName;

    //vi prøver at lave det uden konstruktør

    /*
    //konstruktør


    public FileHandler(String fileName) {
        try {
            this.br = new BufferedReader(new FileReader(fileName));

        } catch (IOException e) {
            System.out.println("fejl ved læsning: " + e.getMessage());

        }

    }


     */

    public String readFromFile(String fileName) {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }
        } catch (IOException e) {
            System.out.println("Fejl ved læsning: " + e.getMessage());
        }
        return sb.toString();
    }

}
