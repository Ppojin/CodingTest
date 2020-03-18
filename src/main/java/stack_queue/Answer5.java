package stack_queue;

public class Answer5 {
    public int solution(String arrangement) {
        int result = 0;
        int len = arrangement.length();
        int sCount = 0;
        for(int i = 0 ; i < len ; i++){
            boolean laser = arrangement.charAt(i) == '(' && arrangement.charAt(i + 1) == ')';
            if(laser){
                result += sCount;
                i++;
            } else {
                char val = arrangement.charAt(i);
                if(val == '('){
                    sCount += 1;
                    result += 1;
                } else if (val == ')'){
                    sCount -= 1;
                }
            }
        }
        return result;
    }
}
