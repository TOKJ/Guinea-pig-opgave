package GuineaPigOpgave;

import java.util.ArrayList;

public class GuineaPigTest {

    public static void main(String[] args) {
        runImportExport();
    }

    public static void runImportExport() {

        ArrayList<GuineaPig>guineaPigs = new ArrayList<>();




        String fileName = "guineaPigNew.csv";
        FileHandler fh = new FileHandler();



        String indhold = fh.readFromFile(fileName);

        System.out.println("TEST");
        System.out.println(indhold);

        ArrayList<String> PigsInStrings = fh.readFromFileToStringArray(fileName);

        for (String pig : PigsInStrings) {
        //    System.out.println("string: " + pig);
            String name;
            String race;
            int food;
            String[] parts = pig.split(";");
            if (parts.length == 3) {
                name = parts[0];
                race = parts[1];
                food = Integer.parseInt(parts[2]);
                guineaPigs.add(new GuineaPig(name, race, food));
            }
        }

        //tester GuineaPig objekter er initialiseret korrekt

        for (GuineaPig pig : guineaPigs) {
            System.out.println(pig + "\n");
        }

        //Implementerer sort funktioner


/*

*/


/*
        for (GuineaPig g : guineaPigs) {

        }
*/
        //ERIK KOMMENTAR TEST

        //Endnu en fed kommentar fra Erik!



    }



}
