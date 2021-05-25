package HtmlProject;


import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.net.*;
import java.io.*;

public class TruDelete3 {

    public static void main(String[] args) throws IOException, InterruptedException {
        URL oracle = new URL("http://webcode.me");
        BufferedReader in = new BufferedReader(
                new InputStreamReader(oracle.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println();
        Pattern p = Pattern.compile("[a-zA-Z]"); //(?<=^| )\d+\.\d+(?=$| )
        Matcher m =  p.matcher(inputLine);
        if (m.find()){
            System.out.println(m.group());
        }
        in.close();

    }
}