import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public Socket attendi;
    private ServerSocket serverSocket;
    private Socket clientSocket;
    private int porta;

    public Server(int porta) {
        this.porta = porta;
        try {
            this.serverSocket = new ServerSocket(porta);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Socket attendi() {
        try {
            this.clientSocket = serverSocket.accept();
            this.attendi = clientSocket;
            return clientSocket;
        } catch (IOException e) {
            return null;
        }
    }

    public void scrivi() {
        try {
            OutputStream outputStream = clientSocket.getOutputStream();
            PrintWriter writer = new PrintWriter(outputStream, true);
            writer.print("ciao ");
            writer.flush();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void leggi() {
        try {
            InputStream inputStream = clientSocket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String msg = reader.readLine();
            System.out.println(msg);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void chiudi() {
        try {
            if (clientSocket != null) clientSocket.close();
        } catch (IOException e) {}
    }

    public void termina() {
        try {
            if (serverSocket != null) serverSocket.close();
        } catch (IOException e) {}
    }
}