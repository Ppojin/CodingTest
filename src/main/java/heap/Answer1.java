package heap;

import java.util.Arrays;

public class Answer1 {
    int[] minHeap = new int[1_000_000];
    Answer1(){
        Arrays.fill(minHeap, 1_000_000_001);
    }
    int heapSize = 0;
    String minHeapToString(){
        StringBuilder result = new StringBuilder();
        for(int index = 1 ; index < 100 ; index++){
            result.append(String.format("%s, ", minHeap[index]));
        }
        return result.toString();
    }

    void swap(int i, int j){
        int temp = minHeap[i];
        minHeap[i] = minHeap[j];
        minHeap[j] = temp;
    }

    void insert_min_heap(int x){
        minHeap[++heapSize] = x;
        for (int current = heapSize ; current > 1 ; current = current / 2) {
            int before = current / 2;
            if (minHeap[current] < minHeap[before]) {
                swap(current, before);
            } else {
                break;
            }
        }
    }

    int delete_min_heap(){
        if (heapSize == 0)
            return 0;

        int item = minHeap[1];
        minHeap[1] = minHeap[heapSize];
        minHeap[heapSize--] = 1_000_000_001;

        for (int current = 1 ; current * 2 <= heapSize ; ) {
            int left = current*2;
            int right = current*2+1;
            if ((minHeap[current] < minHeap[left])
                    && (minHeap[current] < minHeap[right] && minHeap[right] != 0)) {
                break;
            } else {
                int next = (minHeap[left] < minHeap[right])? left : right;
                swap(current, next);
                current = next;
            }
        }
        return item;
    }

    public int solution(int[] scovilleArray, int k) {
        for(int scoville : scovilleArray){
            insert_min_heap(scoville);
        }
        int count = 0;
        while(true){
            int min1 = delete_min_heap();
            int min2 = delete_min_heap();
            if(min1 >= k && min2>= k){
                return count;
            } else if(min2 == 0){
                if(min1 >= k){
                    return count;
                } else {
                    return -1;
                }
            } else {
                count++;
                insert_min_heap(min1 + (min2 * 2));
            }
        }
    }
}

//import java.lang.reflect.Array;
//import java.util.ArrayList;
//import java.util.Collections;
//
//public class Answer1 {
//    public int solution(int[] scovilleArray, int k) {
//        if(scovilleArray.length == 1){
//            if(scovilleArray[0] >= k){
//                return 0;
//            } else {
//                return -1;
//            }
//        }
//
//        ArrayList<Integer> al = new ArrayList<>();
//        int min1 = 1_000_001;
//        int min2 = 1_000_001;
//
//        for(int scoville : scovilleArray){
//            if(min1 > scoville){
//                min2 = min1;
//                min1 = scoville;
//            } else if (min2 > scoville){
//                min2 = scoville;
//            }
//        }
//
//        for(int scoville : scovilleArray){
//
//        }
//        int count = 0;
//        return count;
//    }
//}

//public class Answer1 {
//    private class ScovilleNode{
//        int scoville;
//        ScovilleNode next;
//        ScovilleNode prev;
//        ScovilleNode(int scoville){
//            this.scoville = scoville;
//        }
//        public void add(ScovilleNode node){
//            if(this.scoville > node.scoville){
//                if (this.prev == null){
//                    node.next = this.next;
//                    node.prev = this;
//                    this.next = node;
//                    int temp = this.scoville;
//                    this.scoville = node.scoville;
//                    node.scoville = temp;
//                } else {
//                    node.prev = this.prev;
//                    prev.next = node;
//                    node.next = this;
//                    this.prev = node;
//                }
//            } else {
//                if (this.next == null){
//                    node.prev = this;
//                    this.next = node;
//                } else {
//                    this.next.add(node);
//                }
//            }
//        }
//        public void mix(){
//            if(this.next == null){
//                throw new RuntimeException("Something went wrong, there has not nextNode");
//            } else {
//                int newScoville = this.scoville + (this.next.scoville * 2);
//                this.scoville = this.next.next.scoville;
//                this.next = this.next.next.next;
//                this.add(new ScovilleNode(newScoville));
//            }
//        }
//        @Override
//        public String toString() {
//            if (next == null){
//                return String.format("%s", this.scoville);
//            } else {
//                return String.format("%s, %s", this.scoville, next.toString());
//            }
//        }
//    }
//
//    public int solution(int[] scovilleArray, int k) {
//        ScovilleNode sn = null;
//        for(int scoville : scovilleArray){
//            ScovilleNode newNode = new ScovilleNode(scoville);
//            if(sn == null){
//                sn = newNode;
//            } else {
//                sn.add(newNode);
//            }
//        }
//        int count = 0;
//        while(true){
//            if(sn.next == null){
//                if(sn.scoville < k){
//                    return -1;
//                } else {
//                    return count;
//                }
//            }
//            if(sn.scoville < k){
//                count++;
//                sn.mix();
//            } else if(sn.next.scoville >= k) { // sn.scoville >= k && sn.next.scoville >= k
//                return count;
//            } else {
//                throw new RuntimeException("Something went wrong, nextNode is smaller then sn");
//            }
//        }
//    }
//}

//import java.util.ArrayList;
//
//class Solution {
//    public int solution(int[] scovilleArray, int k) {
//        ArrayList<Integer> scovilleList = new ArrayList<>();
//        for(int scoville : scovilleArray){
//            scovilleList.add(scoville);
//        }
//        int index = 0;
//        int count = 0;
//        while(index < scovilleList.size()){
//            int scoville = scovilleList.get(index);
//            if(scoville < k){
//                count++;
//                scovilleList.set(index, scoville + (scovilleList.remove(index+1)*2));
//            } else {
//                index++;
//            }
//        }
//        return count;
//    }
//}