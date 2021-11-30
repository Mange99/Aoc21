package problemUno;

import Input.ReadFromFile;

import java.io.File;
import java.net.URL;
import java.util.List;

public class ProblemUno extends ReadFromFile {
    private List<String> numbers;
    URL url = getClass().getResource("input.txt");
    File fileName = new File(url.getPath());

    private List<String> test;
    URL url1 = getClass().getResource("test.txt");
    File fileName1 = new File(url1.getPath());

    public ProblemUno() {
        numbers = seperatedByLine(fileName);
        test = seperatedByComma(fileName1);

        for(String test : test){
            System.out.println(test);
        }
        /*
        for(String years : numbers){
            System.out.println(years);
        }

         */
    }
}
