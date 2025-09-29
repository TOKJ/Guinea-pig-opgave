package GuineaPigOpgave;

public class GuineaPigTest {

    public static void main(String[] args) {
        runImport();
    }

    public static void runImport() {
        String fileName = "guineaPigNew.csv";
        FileHandler fh = new FileHandler();

        String indhold = fh.readFromFile(fileName);
        System.out.println("TEST");
        System.out.println(indhold);
    }



}
