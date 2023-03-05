public class auto {
    public static void main(String[] args) {
        String color = "yellow";


    }

    public static void move(String[] args) {
        move(color);
            switch (color) {
                case "red":
                    System.out.println("Остановись");
                    break;
                case "yellow":
                    System.out.println("Подождать");
                    break;
                case "green":
                    System.out.println("Ехать");
                    break;

            }
        }
    }


