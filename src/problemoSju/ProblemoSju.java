package problemoSju;

import Input.ReadFromFile;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProblemoSju extends ReadFromFile {

    public ProblemoSju(){
        URL url = getClass().getResource("input.txt");
        File fileName = new File(url.getPath());
        List<Integer> input = seperatedByComma(fileName);

        System.out.println(losSolvos(input));
        System.out.println(Part2(input));
    }
    private int sum(int x){
        return x * (x+1)/2;
    }

    public int Part2(List<Integer> input) {
        int sum = Integer.MAX_VALUE;

        for (int i = 0; i <= 1000; i++) {
            if(fuel2(input, i) < sum){
                sum = fuel2(input, i);
            }else{
                return sum;
            }
        }
        return sum;
    }
    private int fuel2(List<Integer> integers, int target){
        int sum = 0;
        for (int i = 0; i < integers.size(); i++) {
            sum += sum(Math.abs(integers.get(i) - target));
        }
        return sum;
    }
    private int losSolvos(List<Integer> input){
        int least = Integer.MAX_VALUE;
        for(int i = 0; i < 10000; i++){
            if(fuel(input, i) < least){
                least = fuel(input, i);
            }else{
                return least;
            }
        }
        return least;
    }

    private int fuel(List<Integer> integers, int target){
        int sum = 0;
        for (int i = 0; i < integers.size(); i++) {
            sum += Math.abs(integers.get(i) - target);
        }
        return sum;
    }
}
