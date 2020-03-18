package hash;

import java.util.ArrayList;
import java.util.HashMap;


public class Answer2 {
    class NumberNode{
        HashMap<String, NumberNode> child = new HashMap<>();
        ArrayList<String> lastNumList = new ArrayList<>();

        public boolean numberAdd(String phoneNumber){
            String key = phoneNumber.substring(0,1);

            if(lastNumList.contains(key)){
                return false;
            }

            if(phoneNumber.length() == 1 && this.child.containsKey(key)){
                return false;
            } else if (phoneNumber.length() == 1){
                lastNumList.add(key);
                return true;
            }

            if(!this.child.containsKey(key)){
                this.child.put(key, new NumberNode());
            }

            return this.child.get(key).numberAdd(phoneNumber.substring(1));
        }
    }

    public boolean solution(String[] phone_book) {
        NumberNode numberNode = new NumberNode();
        for(String phoneNumber : phone_book){
            if(!numberNode.numberAdd(phoneNumber))
                return false;
        }
        return true;
    }
}
