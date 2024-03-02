import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;


public class ChatServer {
    ArrayList<Client> clients = new ArrayList<>();
    ServerSocket serverSocket;
    ChatServer() {
        // создаем серверный сокет на порту 1234
        try {
            serverSocket = new ServerSocket(1234);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    void senAll(String message) {
        for (Client client : clients) {
            client.reception(message);
        }
    }
    public void run() {
        try {
            while (true) {
                System.out.println("Warning...");
                // ждем клиента
                Socket socket = serverSocket.accept();
                System.out.println("Client connected!");
                clients.add(new Client(socket, this));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new ChatServer().run();
    }
}
