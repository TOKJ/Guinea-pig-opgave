package GuineaPigOpgave;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileHandler {
    private BufferedReader br;
/*
    //Konstruktør
    public FileHandler() {
        this.br = new BufferedReader(new FileReader(""));
    }

    */

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

    public ArrayList<String> readFromFileToStringArray(String fileName) {
        ArrayList<String> StringArray = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader( new FileReader(fileName) )){
            String line;
            while ((line = br.readLine()) != null) {
                StringArray.add(line);

            }
        } catch (IOException e) {
            System.out.println("Fejl: " + e.getMessage());
        }
        return StringArray
    }
/*
    public String readLine(String fileContent) {
        while ((line = fileContent.readline()))
    }
*/
}
