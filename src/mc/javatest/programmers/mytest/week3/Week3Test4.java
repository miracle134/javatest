/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.mytest.week3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * packageName    : mc.javatest.programmers.mytest
 * fileName       : week3
 * author         : MiracleCat
 * date           : 2023-01-25(025)
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-25(025)        MiracleCat       최초 생성
 */
public class Week3Test4 {

    public static void main(String[] args) {
        Week3Test4 week3Test4 = new Week3Test4();

        int n = 8;
        int c = 3;
        int k = 2;
        int[][] contact = {{1, 4}, {2, 4}, {3, 4}, {4, 6}, {4, 5}, {6, 5}, {6, 7}, {5, 7}, {7, 8}};
        System.out.println(week3Test4.solution(n, c, k, contact));
    }

    public int solution(int n, int c, int k, int[][] contact) {
        List<Citizen> citizens = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            citizens.add(new Citizen(i < c));
        }

        for (int[] cont : contact){
            citizens.get(cont[0] - 1).contacts.add(cont[1] - 1);
        }

        Queue<Citizen> queue = new LinkedList<>();
        for(Citizen citizen : citizens){
            if(citizen.isBadBoy) queue.offer(citizen);
        }

        while(!queue.isEmpty()){
            Citizen cur = queue.poll();

            for(int i : cur.contacts){
                Citizen receiver = citizens.get(i);
                if(receiver.received == k) continue;

                receiver.received++;
                if(receiver.received == k){
                    queue.offer(receiver);
                }

            }
        }

        int answer = 0;
        for(Citizen citizen : citizens){
            if(citizen.isBadBoy) continue;
            if(citizen.received == 0) answer++;
        }

        return answer;
    }

    class Citizen {
        final boolean isBadBoy;
        final List<Integer> contacts = new ArrayList<>();
        int received = 0;

        public Citizen(boolean isBadBoy){
            this.isBadBoy = isBadBoy;
        }
    }

}
