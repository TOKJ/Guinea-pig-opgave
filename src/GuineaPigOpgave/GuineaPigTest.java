package GuineaPigOpgave;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;

public class GuineaPigTest {

    public static void main(String[] args) {
        runImport();
    }

    public static void runImport() {
        String fileName = "guineaPigNew.csv";
        FileHandler fh = new FileHandler();


        // Udprint alt fra CSV filen. Ikke nødvendigt ig??

        String indhold = fh.readFromFile(fileName);
        System.out.println("Indhold af CSV-fil:");
        System.out.println(indhold);
        System.out.println("--- END OF SCV FIL ---\n\n");


       // String[] lines = indhold.split("\n");
        ArrayList<GuineaPig> guineaPigs = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length == 3) {
                    String name = parts[0];
                    String race = parts[1];
                    int food = Integer.parseInt(parts[2]);
                    guineaPigs.add(new GuineaPig(name, race, food));
                }
            }
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }


        //sortering, man vælger hvad man vil sortere efter.

        Scanner sc = new Scanner(System.in);
        System.out.println("Vælg en sortering: ");
        System.out.println("1 = name. \n2 = race. \n3 = food.");
        int input =  sc.nextInt();

        //intellij skriver noget "fejl" om at man ikke behøves "= null". Men idk, det virker finno?
        String newWriteFileName = null;

        if (input == 1) {
            guineaPigs.sort((g1, g2) -> g1.getName().compareToIgnoreCase(g2.getName()));
            newWriteFileName = "sortedGuineaPigsByName.csv";
        } else if (input == 2) {
            guineaPigs.sort((g1, g2) -> g1.getRace().compareToIgnoreCase(g2.getRace()));
            newWriteFileName = "sortedGuineaPigsByRace.csv";
        } else if (input == 3) {
            guineaPigs.sort((g1, g2) -> g2.getFood() - g1.getFood());
            newWriteFileName = "sortedGuineaPigsByFood.csv";
        } else {
            System.out.println("ERROR: jeg gider ikke lave validering på input ;)");
            return;
        }


        //udskriver arrayList
        System.out.println("\n\nG-Force team members: ");
        for (GuineaPig g : guineaPigs) {
            System.out.println(g.toString());
        }


        try (FileWriter fw = new FileWriter(newWriteFileName)) {
            for (GuineaPig g : guineaPigs) {
                fw.write(g.getName() + ";" + g.getRace() + ";" + g.getFood() + "\n");
            }
            System.out.println("\n\nGuinea pigs written to " + newWriteFileName);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
