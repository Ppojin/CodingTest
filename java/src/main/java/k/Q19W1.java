package k;

import java.util.*;

public class Q19W1 {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;

        List<List<Integer>> boardList = new ArrayList<>();
        for (int[] line : board) {
            List<Integer> lineList = new ArrayList<>();
            for (int point : line) {
                lineList.add(point);
            }
            boardList.add(lineList);
        }

        Stack<Integer> stack = new Stack<>();
        // ============================================
        for(List<Integer> tline : boardList){
            System.out.println(tline);
        }
        System.out.println();
        // ============================================

        for(int move : moves){
            for(List<Integer> line : boardList){
                Integer item = line.get(move-1);
                if (item != 0){
                    if(!stack.isEmpty()){
                        if(stack.lastElement().equals(item)){
                            stack.pop();
                            answer += 2;
                        } else {
                            stack.push(item);
                        }
                    } else {
                        stack.push(item);
                    }
                    line.set(move-1, 0);

                    // ============================================
                    for(List<Integer> tline : boardList){
                        System.out.println(tline);
                    }
                    System.out.println(String.format(
                            "move: %s\nstack: %s\nitem: %s\nscore: %s",
                            move, stack, item, answer));
                    // ============================================

                    break;
                }
            }
        }

        return answer;
    }
}
