package hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Answer3 {
    public int solution(String[][] clothes) {
        HashMap<String, ArrayList<String>> hm = new HashMap<>();
        for(String[] cloth : clothes){
            String key = cloth[1];
            String name = cloth[0];
            if (!hm.containsKey(key)){
                hm.put(key, new ArrayList<>(Arrays.asList(name)));
            } else {
                if (!hm.get(key).contains(name)){
                    hm.get(key).add(name);
                }
            }
        }

        int result = 1;
        for(String key : hm.keySet()){
            result *= hm.get(key).size()+1;
        }
        return result-1;
    }
}
