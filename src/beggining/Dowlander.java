package beggining;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.net.*;

public class Dowlander {
    public static void main(String[] args) {

        try (BufferedInputStream in = new BufferedInputStream(new URL("https://ru-music.com/").openStream());
             FileOutputStream fileOutputStream = new FileOutputStream("cover_image")) {
            byte dataBuffer[] = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
                fileOutputStream.write(dataBuffer, 0, bytesRead);
            }
        } catch (IOException e) {
            System.out.println("lol");
        }
    }
}
