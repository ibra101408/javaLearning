package beggining;

import java.net.*;
import java.io.*;
import java.lang.*;

public class SmallServTest {
    public static void main (String[] args) throws NullPointerException, IOException{
        int count = 0;
        ServerSocket serverSocket = new ServerSocket(8001 );
        while (true) {
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client accepted " + (++count));

            OutputStreamWriter writer =
                    new OutputStreamWriter(
                            clientSocket.getOutputStream());
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(
                            clientSocket.getInputStream()));

            String request = reader.readLine();
            String response = "#" + count + ", your message length is " + request.length() + "\n";

           /* writer.write(
                    "HTTP/1.0 200 OK\r\n" +       //следущие три строки чтоб
                    "Conten-type : text/html\r\n" +   // браузеп мог понять и отбразить
                    "\r\n" +                          //текст
                    "<h1>Java"+ count + "</h1>\r\n");

            writer.write("HTTP/1.0 200 OK\r\n" +       //следущие три строки чтоб
                            "Conten-type : text/html\r\n" +   // браузеп мог понять и отбразить
                            "\r\n" +                          //текст
                            response);*/
            writer.write(response);
            writer.flush();

            writer.close();
            reader.close();

            clientSocket.close();
        }
        //serverSocket.close();

    }
}

