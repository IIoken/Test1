public class Main {
    public static void main(String[] args) {
        Rect rect = new Rect(20, 30);
        rect.w = 10;
        System.out.println(rect.getW() * rect.getH() == rect.getS());
    }

}