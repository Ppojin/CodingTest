package stack_queue;

import java.util.ArrayList;
import java.util.List;

class Truck{
    int weight;
    int interval;
    Truck(int weight, int interval){
        this.weight = weight;
        this.interval = interval;
    }

    @Override
    public String toString() {
        return " [" + this.weight + ", "+ this.interval + "] ";
    }
}

class BridgeManager{
    private BridgeManager next;
    private List<Truck> trucks = new ArrayList<Truck>();
    private int currWeight = 0;
    private int currTime = 1;
    private int maxTime = 0;
    private int bridgeLength;
    private int maxWeight;
    private int lastInterval = 0;
    private int intervalSum = 0;
    // getter and setter
    public int getMaxTime() {
        return this.maxTime;
    }
    // constructor
    BridgeManager(int bridgeLength, int maxWeight) {
        this.lastInterval = bridgeLength;
        this.bridgeLength = bridgeLength;
        this.maxWeight = maxWeight;
    }

    public void push(int weight){
        this.intervalSum += this.lastInterval;
        while(this.currWeight + weight > maxWeight){
            this.pop();
        }
        this.currWeight += weight;
        this.trucks.add(new Truck(weight, this.intervalSum));
        this.maxTime = intervalSum + this.currTime+1;
        System.out.println("currTime=" + this.currTime + ", maxTime=" + this.maxTime);
        System.out.println(this.trucks);
//        this.lastInterval = 0;
    }

    public void pop(){
        Truck thisTruck = this.trucks.get(0);

        this.intervalSum -= thisTruck.interval;
        this.currWeight -= thisTruck.weight;
        this.currTime += thisTruck.interval;

        if(this.lastInterval == 0){
            this.lastInterval = bridgeLength - this.trucks.get(this.trucks.size()-1).interval;
        } else {
            this.lastInterval -= 1;
        }
        this.trucks = this.trucks.subList(1, this.trucks.size());
    }
}

public class Answer2 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        BridgeManager bm = new BridgeManager(bridge_length, weight);
        for(int truck : truck_weights){
            bm.push(truck);
        }
        return bm.getMaxTime();
    }
}
