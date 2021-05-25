package beggining;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.*;

public class SmallServerSocket {
    public static void main(String[] args) {
        try (ServerSocket server1 = new ServerSocket(8000);
             PrintStream ps = new PrintStream(server1.accept().getOutputStream())) {
            ps.println("привет!");
            ps.flush();
        } catch (IOException e) {
            System.err.println("Ошибка соединения потока: " + e);
        }
    }
}