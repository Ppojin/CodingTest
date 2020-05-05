package stack_queue;

import java.util.ArrayList;
import java.util.Arrays;

public class Answer2 {
    public int solution(int bridge_length, int maxWeight, int[] truck_weights) {
        int time = 0;
        int weight = 0;
        ArrayList<Integer> bridge = new ArrayList<>();
        bridge.addAll(Arrays.asList(new Integer[bridge_length]));
        bridge.replaceAll(e -> 0);

        int index = 0;
        while(index < truck_weights.length){
            time += 1;
            weight -= bridge.remove(0);
            if(weight + truck_weights[index] <= maxWeight){
                weight += truck_weights[index];
                bridge.add(truck_weights[index]);
                index++;
            } else {
                bridge.add(0);
            }
        }
        return time + bridge_length;
    }
}
