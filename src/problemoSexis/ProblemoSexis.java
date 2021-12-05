package problemoSexis;

import Input.ReadFromFile;

import java.io.File;
import java.net.URL;
import java.util.List;

public class ProblemoSexis extends ReadFromFile {

    public ProblemoSexis(){
        URL url = getClass().getResource("input.txt");
        File fileName = new File(url.getPath());
        List<String> input = seperatedByLine(fileName);

        System.out.println(losSolvos(input, true)); //problemUno
        System.out.println(losSolvos(input, false)); //problemDos

    }

    private int losSolvos(List<String> input, boolean part1){

        return -1;
    }
}
