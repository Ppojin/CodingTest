package stack_queue;

import java.util.ArrayList;

public class Answer5 {
    public int solution(String arrangement) {
        ArrayList<Integer> resultArray = new ArrayList<>();
        int result = 0;
        int len = arrangement.length();
        for(int i = 0 ; i < len ; i++){
            String val = (i == len)? arrangement.substring(i) : arrangement.substring(i,i+1);
            String laser = (i+1 == len)? arrangement.substring(i) : arrangement.substring(i,i+2);
            if (laser.equals("()")){
                resultArray.replaceAll(n -> n+1);
                i++;
            } else {
                if(val.equals("(")){
                    resultArray.add(1);
                } else if (val.equals(")")){
                    result += resultArray.remove(resultArray.size()-1);
                }
            }
        }
        return result;
    }
}
