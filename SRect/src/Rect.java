class Rect {
    int s;
    int w, h;

    public Rect(int w, int h) {
        this.w = w;
        this.h = h;
        s = w * h;
    }

    int getS() {
        return s;
    }

    int getW() {
        return w;
    }

    int getH() {
        return h;
    }

}