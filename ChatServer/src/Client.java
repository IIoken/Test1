import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

class Client implements Runnable {
    Socket socket;
    Scanner in;
    PrintStream out;
    ChatServer server;

    public Client(Socket socket, ChatServer server) {
        this.socket = socket;
        this.server = server;
        new Thread(this).start();
    }

    void reception(String message){
        out.println(message);
    }

    public void run(){
        try {
            // Получаем потоки ввода и вывода
            InputStream is = socket.getInputStream();
            OutputStream os = socket.getOutputStream();

            // Создаём удобные средства ввода и вывода
            in = new Scanner(is);
            out = new PrintStream(os);

            // читаем из сети что пишет сеть
            out.println("Welcome to Chat!");
            String input = in.nextLine();
            while (!input.equals("bye")) {
                server.senAll(input);
                input = in.nextLine();
            }
            socket.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}