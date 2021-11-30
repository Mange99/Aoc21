package Input;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFromFile{
    private final List<String> elements = new ArrayList<>();
    private final List<List<String>> groups = new ArrayList<>();
    BufferedReader br;

    public List<String> seperatedByLine(File fileName){
        try{
            br = new BufferedReader(new FileReader(fileName));
            String strCurrentLine;
            String allLines = "";
            while((strCurrentLine = br.readLine()) != null){
                elements.add(strCurrentLine);
                /*
                if("".equals(strCurrentLine)){
                    elements.add(allLines);
                    allLines = "";
                }else{
                    allLines += strCurrentLine;
                }

                 */
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                if(br != null){
                    br.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        return elements;
    }

    public List<String> seperatedByComma(File fileName){
        try{
            String line = null;
            br = new BufferedReader(new FileReader(fileName));

            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                for (String str : values) {
                    elements.add(str);
                }
            }
            br.close();

        }catch (IOException e){
            e.printStackTrace();
        }
        return elements;
    }
}
