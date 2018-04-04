import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws IOException {

        ServerSocket listener = new ServerSocket(9090);
        System.out.println("server on ");
        try {
            while (true) {
                Socket socket = listener.accept();
                System.out.print("Holaaa servidor ensendido");
                try {
                    System.out.print("Holaaa servidor ensendidhhhho");
                    PrintWriter out =
                            new PrintWriter(socket.getOutputStream(), true);
                    out.println(new Date().toString() + "Diana :D");
                } finally {
                    socket.close();
                }
            }
        }
        finally {
            listener.close();
        }
    }

}
