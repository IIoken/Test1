public class Main {

    public static void main(String[] args) {
        char ch1 = 'r';
        char ch2 = 'Y';
        char ch3 = 'g';

        System.out.println(deco(ch1) + " " + deco(ch2) + " " + deco(ch3));
    }

    public static String deco(char ch) {

        String result = "";
        switch (ch) {
            case 'h':
                System.out.println("Hello");
                break;
            case 'i' , 'm', 'k':
                System.out.println("I can decode!");
                break;
            case 'b':
                System.out.println("Bye!");
                break;
            default:
                System.out.println("I don't know these symbols :(");
        }

        return result;
    }
}