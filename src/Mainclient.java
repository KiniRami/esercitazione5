public class Mainclient {
    public static void main(String[] args) {
        Client client = new Client("Rami", "blu");


         int c=client.connetti("localhost", 12345);


        if (c == 0) {
            client.scrivi();
            client.leggi();
        } else {
            System.out.println("Impossibile connettersi al server.");
        }
    }
}