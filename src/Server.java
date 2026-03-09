import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private ServerSocket serverSocket;
    private Socket clientSocket;

    public Server(int porta) {
        try {
            this.serverSocket = new ServerSocket(porta);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void attendi() {
        try {
            this.clientSocket = serverSocket.accept();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void gestisciComunicazione() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true);
            String msg = "";

            while (true) {
                msg = reader.readLine();
                if (msg == null || msg.equalsIgnoreCase("esci")) {
                    System.out.println("Il client ha chiuso la comunicazione.");
                    break; 
                }
                System.out.println("Client scrive: " + msg);
                writer.println("Ricevuto: " + msg); // Risponde per conferma
            }
        } catch (IOException e) {
            System.out.println("Connessione interrotta.");
        }
    }

    public void chiudi() {
        try { if (clientSocket != null) clientSocket.close(); } catch (IOException e) {}
    }
    
    public void termina() {
        try { if (serverSocket != null) serverSocket.close(); } catch (IOException e) {}
    }
}
