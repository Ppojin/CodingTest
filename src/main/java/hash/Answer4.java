package hash;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;


class PlayNode{
    private HashMap<Integer, Integer> hm = new HashMap<>();
    private int count = 0;
    private int sum = 0;
    private ArrayList<Integer> sortedIndex;

    public void add(Integer play, int index){
        hm.put(index, play);
        this.sum += play;
        this.count += 1;
    }

    public int getSum() {
        return sum;
    }
    public int getCount(){
        return count;
    }

    public void sortHm(){
        ArrayList<Integer> sortedKeySet = new ArrayList<>(this.hm.keySet());
        sortedKeySet.sort((o1, o2) -> (this.hm.get(o2) - (this.hm.get(o1))));
        this.sortedIndex = sortedKeySet;
    }
    public ArrayList<Integer> getSortedIndex(){
        return sortedIndex;
    }
}

public class Answer4 {
    public static int[] solution(String[] genres, int[] plays) {
        HashMap<String, PlayNode> hm = new HashMap<>();
        for(int i = 0; i < genres.length ; i++){
            String genre = (String) Array.get(genres, i);
            int play = (int) Array.get(plays, i);
            if(!hm.containsKey(genre)){
                hm.put(genre, new PlayNode());
                hm.get(genre).add(play, i);
            } else {
                hm.get(genre).add(play, i);
            }
        }

        ArrayList<String> sortedKeySet = new ArrayList<>(hm.keySet());
        sortedKeySet.sort((o1, o2) -> (hm.get(o2).getSum() - (hm.get(o1).getSum())));

        int albumLength = 0;
        for(String key : hm.keySet()){
            if (hm.get(key).getCount() == 1){
                albumLength += 1;
            } else {
                albumLength += 2;
            }
        }

        int[] bestAlbum = new int[albumLength];
        int size = 0;
        for (String key : sortedKeySet){
            hm.get(key).sortHm();
            if (hm.get(key).getCount() == 1){
                bestAlbum[size++] = hm.get(key).getSortedIndex().get(0);
            } else {
                bestAlbum[size++] = hm.get(key).getSortedIndex().get(0);
                bestAlbum[size++] = hm.get(key).getSortedIndex().get(1);
            }
        }

        return bestAlbum;
    }
}
