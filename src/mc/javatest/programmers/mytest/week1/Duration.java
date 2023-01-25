/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.mytest.week1;

public class Duration {

    public static void main(String[] args) throws Exception {
        Duration duration = new Duration();

        int goal = 43;
        int[] durations = {5, 3, 7, 6, 4};

        System.out.println("리턴 값 : " + duration.solution(goal, durations));

    }

    //    public long solution(int goal, int[] durations) {
//        int maxDuration = 0;
//        for (int d : durations) maxDuration = Math.max(maxDuration, d);
//
//        long min = 0;
//        long max = goal * (maxDuration / durations.length +1L);
//        while(min < max){
//            long mid = (min + max) / 2;
//            int sum = 0;
//
//            for(int i = 0; i < durations.length; i++){
//                sum += mid / durations[i];
//            }
//
//            System.out.printf("%s %s %s %s\n",min, max, mid, sum);
//            if(sum < goal){
//                min = mid + 1;
//            } else {
//                max = mid;
//            }
//        }
//
//        long minCount = max / maxDuration;
//
//        long incentive = 0;
//        for (int d : durations) {
//            incentive += max / d - minCount;
//        }
//        return incentive * 10_000L; // 개 당 10,000원;
//    }
    public long solution(int goal, int[] durations) {
        int maxDuration = 0; // 가장 오래 걸리는 시간
        for (int d : durations) maxDuration = Math.max(maxDuration, d);

        long min = 0;
        // 최대로 걸리는 시간은 모든 작업자가 가장 오래 걸리는 시간만큼 작업하는 경우
        // 목표량을 작업자 수로 나누면 소수점 버림이 생기니까 1을 더해 넉넉한 최대값을 만들어 줌
        long max = maxDuration * (goal / durations.length + 1L);

        while (min < max) {
            long mid = (min + max) / 2;

            int count = 0;
            for (int d : durations) count += mid / d;

            if (count < goal) min = mid + 1;
            else max = mid;
        }

        // 가장 적은 인형의 개수는 작업시간이 가장 오래 걸리는 작업자가 만든 경우
        long minCount = max / maxDuration;

        long incentive = 0;
        for (int d : durations) {
            incentive += max / d - minCount;
        }
        return incentive * 10_000L; // 개 당 10,000원;
    }

}
