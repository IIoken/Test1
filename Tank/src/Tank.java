public class Tank {
    static final String Model = "T 34";
    static int ntanks;
    int x, y;
    int dir;
    int fuel;
    int n;

    public Tank(int x, int y, int fuel) {
        this.x = x;
        this.y = y;
        this.fuel = fuel;
        n = ++ntanks;
    }

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
        this.fuel = 100;
        n = ++ntanks;
    }

    public Tank() {
        this.x = 0;
        this.y = 0;
        this.fuel = 100;
        n = ++ntanks;
    }


    public void goForward(int i) {
        if (i < 0 && -i > fuel)
            i = -fuel;
        else if (i > fuel)
            i = fuel;
        if (dir == 0) x += i;
        else if (dir == 1) y += i;
        else if (dir == 2) x -= i;
        else y -= i;
        fuel -= Math.abs(i);

    }

    public void turnLeft() {
        dir--;
        if (dir == -1) dir = 3;
    }

    public void turnRight() {
        dir++;
        if (dir == 4) dir = 0;
    }

    public void printPosition() {
        System.out.println("The Tank " + Model + "-" + n + " " + x + ", " + y + " now");
    }


    public void goBackward(int i) {
        goForward(-i);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getDir() {
        return dir;
    }

    public void setDir(int dir) {
        this.dir = dir;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
}

