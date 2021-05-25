package beggining;

import java.net.URL;
import java.net.*;
import java.io.*;

public class UrlDemo {

        public static void main(String args[]) throws Exception {
            URL hy = new URL("https://www.google.com");
            System.out.println("Protocol: " + hy.getProtocol());
            System.out.println("Port: " + hy.getPort());
            System.out.println("Host: " + hy.getHost());
            System.out.println("File: " + hy.getFile());
            System.out.println("Ext: " + hy.toExternalForm());
            System.out.println(hy.getRef());
            System.out.println();
////////////////////////////////////////////////////////////////////////
            int c;
            URL hp = new URL("file:///C:/Users/Laptop/Desktop/index.html");
            URLConnection hpCon = hp.openConnection();
            System.out.println("Date: " + hpCon.getDate());
            System.out.println("Type: " + hpCon.getContentType());
            System.out.println("Exp: " + hpCon.getExpiration());
            System.out.println("Last M: " + hpCon.getLastModified());
            System.out.println("Length: " + hpCon.getContentLength());
            if (hpCon.getContentLength() > 0) {
                System.out.println("=== Content ===");
                InputStream input = hpCon.getInputStream();
                int i = hpCon.getContentLength();
                while (((c = input.read()) != -1) && (--i > 0)) {
                    System.out.print((char) c);
                }
                input.close();
            } else {
                System.out.println("No Content Available");
            }
        }
    }

