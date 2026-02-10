import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public Socket attendi;
    private ServerSocket serverSocket;
    private  Socket clientSocket;
    private int porta;

    public Server(int porta) {
        this.porta = porta;
    }


    public Socket attendi() {
        return null;
    }


    public void scrivi() {
        try {
            OutputStream outputStream = clientSocket.getOutputStream();
            PrintWriter writer = new PrintWriter(outputStream);
            writer.print("ciao server");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }


    public void leggi() {
        try {
            InputStream inputStream = clientSocket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


    public void chiudi() {


    }


    public void termina() {


    }
}

