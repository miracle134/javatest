package mc.javatest.programmers.mytest.week1;

import java.util.stream.IntStream;

public class Budgets {

    public static void main(String[] args) throws Exception {
        Budgets budgets = new Budgets();

        int[] d = {120, 110, 140, 150};
        int budget = 485;

        System.out.println("리턴 값 : " + budgets.solution(d, budget));

    }

    public int solution(int[] budgets, int M) {
        int answer = 0;
        int max = IntStream.of(budgets).max().orElse(0);
        int min = 0;

        while (min <= max) {
            int mid = (min + max) / 2;
            int sum = IntStream.of(budgets)
                    .map(b -> Math.min(b, mid))
                    .sum();

            if(sum <= M){
                min = mid + 1;
                answer = mid;
            }else{
                max = mid - 1;
            }
        }

        return answer;
    }

}
