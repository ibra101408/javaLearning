package HtmlProject;


import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadH {
    public static void main(String[] args) throws IOException {
        int c;
        URL hp = new URL("https://pood.telia.ee/nutitelefonid/Huawei-P-Smart-2021-must/51096ABV");
        URLConnection hpCon = hp.openConnection();
        if (hpCon.getContentLength() > 0) {
            System.out.println("=== Content ===");
            InputStream input = hpCon.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(input));
            String strLine;
            //input.available();
            //int i = hpCon.getContentLength()
            while ((strLine = br.readLine()) != null) {
                Pattern p = Pattern.compile("(?<=^| )\\d+\\.\\d+(?=$| )");
                Matcher m = p.matcher(strLine);

                if (m.find()) {
                    System.out.println(m.group());

                    input.close();
                } else {
                    System.out.println("No Content Available");
                }
            }
        }
    }
}
