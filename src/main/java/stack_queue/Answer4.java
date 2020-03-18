package stack_queue;

import java.util.ArrayList;

public class Answer4 {
    public int solution(int[] priorities, int location) {
        ArrayList<Integer> queue = new ArrayList<>();
        for(int priority : priorities){
            queue.add(priority);
        }
        int count = 0;
        while(queue.size() > 0){
            int priority = queue.get(0);
            boolean doPrint = true;

            for(int next : queue){
                if (next > priority){
                    queue.add(queue.remove(0));
                    location = (location == 0)? queue.size()-1 : location -1;
                    doPrint = false;
                    break;
                }
            }

            if(doPrint){
                count++;
                queue.remove(0);
                if(location == 0){
                    return count;
                } else {
                    location -= 1;
                }
            }
        }
        return 0;
    }
}
