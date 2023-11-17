package Boy;

public class Player extends Human {


    class Backpack {
        private String staff = "";

        void put(String thing) {
            staff += thing + ",";
        }

        public String toString() {
            if (staff.equals("")) {
                return "the backpack is empty";
            }
            return staff.substring(0, staff.length() - 1) + " flower in the backpack";
        }
    }

    Backpack backpack;

    public Player(String name) {
        super(name + " the Player");
        backpack = new Backpack();
    }

    public void take(String thing) {
        backpack.put(thing);
    }

}
