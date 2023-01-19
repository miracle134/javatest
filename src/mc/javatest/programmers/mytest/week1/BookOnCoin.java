package mc.javatest.programmers.mytest.week1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class BookOnCoin {

    public static void main(String[] args) throws Exception {
        BookOnCoin bookOnCoin = new BookOnCoin();

        int[] coin = {0, 1, 1, 0, 1, 1};
        int k = 3;

        System.out.println("리턴 값 : " + bookOnCoin.solution(coin, k));
    }

    public int solution(int[] coin, int k) {

        if(coin.length == k){
            int sum = IntStream.of(coin).sum();
            if(sum == 0 || sum == k) return 0;
            else return -1;
        }

        int makeOne = makeCoin(Arrays.copyOf(coin,coin.length), k, 1);
        int makeZero = makeCoin(Arrays.copyOf(coin,coin.length), k, 0);

        int answer = Math.min(makeOne, makeZero);
        return answer == Integer.MAX_VALUE ? -1 : answer;
    }

    private int makeCoin(int[] coin, int k, int direction) {
        int answer = 0;

        for(int i = 0; i <= coin.length - k; i++){
            if(coin[i] == direction) continue;

            for(int j = 0; j < k; j++){ // 동전 변경
                coin[i+j] = 1 - coin[i+j];
            }

            answer++;
        }

        if(IntStream.of(coin).sum() == direction * k) return answer;
        else return Integer.MAX_VALUE;
    }

}
