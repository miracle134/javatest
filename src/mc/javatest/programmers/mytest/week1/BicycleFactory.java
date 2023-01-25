package mc.javatest.programmers.mytest.week1;

public class BicycleFactory {

    public static void main(String[] args) throws Exception {
        BicycleFactory baseStation = new BicycleFactory();

        int[][] cost = {{0, 10}, {50, 20}, {100, 30}, {200, 40}};
        int[][] order = {{3, 50}, {7, 200}, {8, 200}};

        System.out.println("리턴 값 : " + baseStation.solution(cost, order));

    }

    public int solution(int[][] cost, int[][] order) {
        int answer = 0;

        /**
         * 1월 - 50 - 10 50 -20 100 - 30 이후 40
         */

        return answer;
    }

}
