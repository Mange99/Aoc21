package problemoSexis;

import Input.ReadFromFile;

import java.io.File;
import java.net.URL;
import java.util.HashMap;
import java.util.List;

public class ProblemoSexis extends ReadFromFile {

    public ProblemoSexis(){
        URL url = getClass().getResource("input.txt");
        File fileName = new File(url.getPath());
        List<Long> input = seperatedByComma(fileName);

        System.out.println(losSolvos(input)); //problemUno

    }

    private long losSolvos(List<Long> input){
        for (int i = 0; i < 256; i++){
            long size = input.size();
            for (int j = 0; j < size; j++){
                if (input.get(j) == 0){
                    input.set(j, 6L);
                    input.add(8L);
                }else{
                    input.set(j, input.get(j)-1);
                }
            }
        }
        return input.size();
    }
}
