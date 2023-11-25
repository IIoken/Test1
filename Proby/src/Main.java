import java.io.File;
public class Main {
    public static void main(String[] args) {
        File folder = new File("C:\\Users\\lim32\\Desktop\\майнер"); //Ваша папка
        double legend = getFlood(folder);
        System.out.println(legend / 1024 / 1024 + " mb");
    }
    private static double getFlood(File folder) {
        File[]files = folder.listFiles();
        long light = 0;
        int count = files.length;
        for (int i = 0; i < count; i++) {
            if (files[i].isFile()) {
                light += files[i].length();
            } else light += getFlood(files[i]);
        }return light;
    }
    


}