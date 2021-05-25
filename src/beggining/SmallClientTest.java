package beggining;

import java.net.*;
import java.io.*;
import java.nio.Buffer;

public class SmallClientTest {
    public static void main(String[] args) throws IOException {
        Socket clientSocket = new Socket("127.0.0.1", 8001);

        OutputStreamWriter writer =
                new OutputStreamWriter(
                        clientSocket.getOutputStream());

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        clientSocket.getInputStream()));

        writer.write("Get me some more Info\n");
        writer.flush();

        String response = reader.readLine();
        System.out.println(response);

        writer.close();
        reader.close();
        clientSocket.close();
    }


    }

