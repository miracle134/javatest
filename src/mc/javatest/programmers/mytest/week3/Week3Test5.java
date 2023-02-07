/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.mytest.week3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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
public class Week3Test5 {

    public static void main(String[] args) {
        Week3Test5 week3Test5 = new Week3Test5();

        int n = 3;

        System.out.println(week3Test5.solution(n));
    }

//    int answer = 0;
//
//    public int solution(int n) {
//        if(n < 3) return n;
//
//        dfs(0, 0, 0, n);
//
//        return answer;
//    }
//
//    private void dfs(int depth, int left, int right, int max) {
//        if(left == max) {
//            answer += 1;
//        }else if(left == right) {
//            dfs(depth + 1, left + 1, right, max);
//        }else{
//            dfs(depth + 1, left + 1, right, max);
//            dfs(depth + 1, left, right + 1, max);
//        }
//    }

    public int solution(int n) {
        int answer = 0;

        Stack<P> stack = new Stack<>();
        stack.push(new P(0, 0));

        while(!stack.isEmpty()){
            P p = stack.pop();

            if(p.open > n) continue;
            if(p.open < p.close) continue;
            if(p.open + p.close == 2 * n) {
                answer++;
                continue;
            }
            stack.push(new P(p.open + 1, p.close));
            stack.push(new P(p.open, p.close + 1));
        }

        return answer;
    }

    class P {
        int open, close;

        public P(int open, int close) {
            this.open = open;
            this.close = close;
        }
    }

}
