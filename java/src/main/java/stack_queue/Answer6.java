package stack_queue;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Answer6 {
    class Stock{
        private int price;
        private int index;
        private int period = 0;
        Stock(int price, int index){
            this.price = price;
            this.index = index;
        }

        @Override
        public String toString() {
            return "Stock{" +
                    "price=" + price +
                    ", index=" + index +
                    ", period=" + period +
                    '}';
        }
    };
    public int[] solution(int[] prices) {
        int[] result = new int[prices.length];
        ArrayList<Stock> stockList = new ArrayList<>();
        int index = 0;
        for(int price : prices){
            int listSize = stockList.size();
            for(int i = 0 ; i < listSize ; i++){
                Stock nextStock = stockList.remove(0);
                nextStock.period += 1;
                if(price >= nextStock.price){
                    stockList.add(nextStock);
                }
                Array.set(result, nextStock.index, nextStock.period);
            }
            stockList.add(new Stock(price, index++));
        }
        return result;
    }
}

//import java.lang.reflect.Array;
//import java.util.Arrays;
//import java.util.Stack;
//
//public class Answer6 {
//    public int[] solution(int[] prices) {
//        int[] result = new int[prices.length];
//        Stack<Integer> priceStack = new Stack<>();
//        for(int price : prices){
//            priceStack.add(0,price);
//        }
//        for(int i = 0 ; i < prices.length ; i++) {
//            int thisPrice = priceStack.pop();
//            int count = 0;
//            for(int nextPrice : Arrays.copyOfRange(prices, i, prices.length)) {
//                Array.set(result, i, count++);
//                if (thisPrice > nextPrice) {
//                    break;
//                }
//            }
//        }
//        return result;
//    }
//}

//import java.util.ArrayList;
//
//class Solution {
//    class Stock{
//        int price;
//        int period = 0;
//        boolean isDone = false;
//        Stock(int price){
//            this.price = price;
//        }
//        public void check(int price){
//            if(!isDone){
//                this.period += 1;
//                this.isDone = this.price > price;
//            }
//        }
//
//        public int getPeriod() {
//            return this.period;
//        }
//    }
//    public int[] solution(int[] prices) {
//        ArrayList<Stock> stockList = new ArrayList<>();
//        for(int price : prices){
//            for(Stock stock : stockList){
//                stock.check(price);
//            }
//            stockList.add(new Stock(price));
//        }
//        int[] result = new int[stockList.size()];
//        for(int i = 0 ; i < stockList.size() ; i++){
//            result[i] = stockList.get(i).getPeriod();
//        }
//        return result;
//    }
//}