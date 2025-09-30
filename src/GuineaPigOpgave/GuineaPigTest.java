package GuineaPigOpgave;

import java.util.ArrayList;

public class GuineaPigTest {

    public static void main(String[] args) {
        runImport();
    }

    public static void runImport() {

        ArrayList<GuineaPig>guineaPigs = new ArrayList<>;




        String fileName = "guineaPigNew.csv";
        FileHandler fh = new FileHandler();



        String indhold = fh.readFromFile(fileName);

        System.out.println("TEST");
        System.out.println(indhold);


/*
        for (GuineaPig g : guineaPigs) {

        }
*/
        //ERIK KOMMENTAR TEST

        //Endnu en fed kommentar fra Erik!



    }



}
