public class Orc implements Playable {
    //String name = "Orc";
    int hiealth = 100;
    int impactForce = 10;
    Boolean state = true;


    @Override
    public String move() {
        return "run";
    }

    @Override
    public String attack() {
        return "ax blow";
    }

    @Override
    public String defence() {
        return "block";
    }
}