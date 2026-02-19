import java.io.*;
import java.net.Socket;

public class Client {
    private String nome;
    private String colore;
    private Socket socket;

    public Client(String nome, String colore) {
        this.nome = nome;
        this.colore = colore;
    }

    public int connetti(String nomeServer, int portaServer) {
        try {

            this.socket = new Socket(nomeServer, portaServer);
            System.out.println("Connesso la connessione");
            return 0;
        } catch (IOException e) {
            System.out.println("Errore di connessione");
            return -1;
        }
    }

    public void scrivi() {

    }

    public void leggi() {

    }
}