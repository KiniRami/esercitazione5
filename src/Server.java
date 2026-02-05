import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public Socket attendi;
    private ServerSocket serverSocket;
    private  Socket clientSocket;
    private int porta;

    public Server(int porta) {
        this.porta = porta;

        try {
            serverSocket = new ServerSocket();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
