package beggining;

import java.io.*;
import java.net.*;
public class SmallClientSocket {
    public static void main(String[] args) {
        try (Socket socket = new Socket("server1", 8000);
             BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        ) {
            String message = br.readLine();
            System.out.println(message);
        } catch (IOException e) {
            System.err.println("ошибка: " + e);
        }
    }
}