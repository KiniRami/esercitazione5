import java.io.*;
import java.net.Socket;
import java.util.Scanner;

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
            return 0;
        } catch (IOException e) {
            return -1;
        }
    }

    public void comunica() {
        try {
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            Scanner tastiera = new Scanner(System.in);
            String tasto = "";

            while (!tasto.equalsIgnoreCase("esci")) {
                System.out.print("Scrivi un messaggio (o 'esci'): ");
                tasto = tastiera.nextLine();
                
                writer.println(tasto); // Invia al server
                
                if (!tasto.equalsIgnoreCase("esci")) {
                    String risposta = reader.readLine(); // Legge risposta del server
                    System.out.println("Server dice: " + risposta);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
