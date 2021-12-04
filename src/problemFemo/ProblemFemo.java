package problemFemo;

import Input.ReadFromFile;

import java.io.File;
import java.net.URL;
import java.util.List;

public class ProblemFemo extends ReadFromFile {

    public ProblemFemo(){
        URL url = getClass().getResource("input.txt");
        File fileName = new File(url.getPath());
        List<String> input = seperatedByLine(fileName);

        System.out.println(problemUno(input));
        System.out.println(problemDos(input));
    }

    private int problemUno(List<String> input){
        return -1;
    }
    private int problemDos(List<String> input){
        return -1;
    }
}
