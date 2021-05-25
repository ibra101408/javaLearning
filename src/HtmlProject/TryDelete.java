package HtmlProject;


import java.io.*;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.*;

public class TryDelete {

    public static void main(String[] args) throws IOException, InterruptedException {
       // String input = "IT&&faculty.*";

/*
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://webcode.me"))
                .GET() // GET is default
                .build();

        HttpResponse<String> response = client.send(request,
                HttpResponse.BodyHandlers.ofString());*/

        try {
            FileInputStream fstream = new FileInputStream("/Users/Laptop/Desktop/newfile.txt");
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;
            while ((strLine = br.readLine()) != null) {
               // if (Pattern.matches(input, strLine)) {
                Pattern p = Pattern.compile("(?<=^| )\\d+\\.\\d+(?=$| )");
                Matcher m = p.matcher(strLine);
                if (m.find()){
                    System.out.println(m.group());
                }

                //  System.out.println(response.body());(?<=^| )\d+\.\d+(?=$| )
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
