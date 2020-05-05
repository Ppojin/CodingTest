package hash;

import java.util.HashMap;

public class Answer1 {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> runnerHM = new HashMap<>();
        for(String person : participant){
            if(runnerHM.containsKey(person)){
                runnerHM.replace(person, runnerHM.get(person)+1);
            }else{
                runnerHM.put(person, 1);
            }
        }

        HashMap<String, Integer> completHM = new HashMap<>();
        for(String person : completion){
            if(completHM.containsKey(person)){
                completHM.replace(person, completHM.get(person)+1);
            }else{
                completHM.put(person, 1);
            }
        }

        for(String person : runnerHM.keySet()){
            if(!completHM.containsKey(person)) {
                return person;
            } else if(!runnerHM.get(person).equals(completHM.get(person))){
                return person;
            }
        }
        return "";
    }
}