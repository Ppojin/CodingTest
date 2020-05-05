package stack_queue;

import java.util.ArrayList;

class TowerNode{
    private int height = 0;
    private TowerNode next;
    private int commitTo = 0;
    private int index = 0;
    public void add(int addHeight){
        if(this.height == 0){
            this.index = 1;
            this.height = addHeight;
        } else {
            if (this.next == null){
                this.next = new TowerNode();
            }
            this.next.add(addHeight, this.index, 1, this.height);
        }
    }
    private void add(int addHeight, int i, int lastBiggerIndex, int lastBiggerHeight){
        if (this.height == 0) {
            this.height = addHeight;
            if(this.height < lastBiggerHeight){
                this.commitTo = lastBiggerIndex;
            }
        } else {
            this.index = i + 1;
            if (this.next == null){
                this.next = new TowerNode();
            }
            if(this.height > addHeight){
                lastBiggerHeight = this.height;
                lastBiggerIndex = this.index;
            }
            this.next.add(addHeight, this.index, lastBiggerIndex, lastBiggerHeight);
        }
    }
    public ArrayList<Integer> result(){
        if (next == null){
            ArrayList<Integer> al = new ArrayList<>();
            al.add(this.commitTo);
            return al;
        } else {
            ArrayList<Integer> al = new ArrayList<>();
            al.add(this.commitTo);
            ArrayList<Integer> temp = this.next.result();
            al.addAll(temp);
            return al;
        }
    }
}

public class Answer1 {
    public int[] solution(int[] heights) {
        TowerNode towerNode = new TowerNode();
        for(int h : heights){
            towerNode.add(h);
        }
        ArrayList<Integer> al = towerNode.result();

        int[] result = new int[al.size()];
        int size = 0;
        for(int num : al){
            result[size++] = num;
        }
        return result;
    }
}
