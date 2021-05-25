package HtmlProject;
import java.io.File;
import java.io.FileReader;
import java.util.regex.*;
import java.io.*;

public class TryDelete2 {
    public static void main(String[] args) {
        String in = "num 13 num 1 num 69.8 num 19238 num 2134";
        Pattern p = Pattern.compile("(?<=^| )\\d+\\.\\d+(?=$| )");
        Matcher m = p.matcher(in);
        if(m.find()) {
            System.out.println(m.group());
        }
    }
//(?<=^| )\d+\.\d+(?=$| )



    }
