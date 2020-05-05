package stack_queue;

import java.util.ArrayList;

public class Answer3 {
    public static int[] solution(int[] progresses, int[] speeds) {
        int worksCount = progresses.length;
        ArrayList<Integer> restDayList = new ArrayList<>();
        for(int i = 0 ; i < worksCount ; i++){
            int progress = progresses[i];
            int speed = speeds[i];
            restDayList.add((int) Math.ceil((100.0 - (double)progress) / (double)speed));
        }
        int day = 0 ;
        ArrayList<Integer> resultAl = new ArrayList<>();
        while(restDayList.size() >= 1){
            int restday = restDayList.remove(0);
            int count = 1;

            if (restDayList.size() > 0){
                while(restDayList.get(0) <= restday){
                    restDayList.remove(0);
                    count++;
                    if (restDayList.size() < 1)
                        break;
                }
            }
            resultAl.add(count);
        }
        int[] resultArray = new int[resultAl.size()];
        int index = 0;
        for(int result : resultAl){
            resultArray[index++] = result;
        }
        return resultArray;
    }
}
