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


    @Override
    public String toString() {
        return "Name: " + name + "\nRace: " + race + "\nDaily amount of food: " + food;
    }

}
