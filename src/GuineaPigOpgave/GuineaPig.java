package GuineaPigOpgave;

public class GuineaPig {

    private String name;
    private String race;
    private int food;

    public GuineaPig(String name, String race, int food) {
        this.name = name;
        this.race = race;
        this.food = food;
    }



    //getters. Tester lige :)

    public String getName() {
        return name;
    }

    public String getRace() {
        return race;
    }

    public int getFood() {
        return food;
    }



    @Override
    public String toString() {
        return "\n\n" +"Name: " + name + "\nRace: " + race + "\nDaily amount of food: " + food + " grams.";
    }

}
