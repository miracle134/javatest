/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.mytest.week3;

import java.util.ArrayList;
import java.util.List;
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
public class Week3Test6 {

    public static void main(String[] args) {
        Week3Test6 week3Test8 = new Week3Test6();

        int[][] reply = {{0}, {8}, {1, 3}, {2}, {1}, {1, 4, 6}, {2, 5}, {3, 6}, {4}};
        System.out.println(week3Test8.solution(reply));
    }

    class Member {
        int visit = -1;
        int groupNumber = -1;
    }

    Stack<Integer> stack;
    int visitDepth;
    int groupCount;

    public int solution(int[][] reply) {

        visitDepth = 0;
        groupCount = 0;
        stack = new Stack<>();

        Member[] members = new Member[reply.length];
        List<List<Integer>> replies = new ArrayList<>();
        for (int i = 0; i < members.length; i++) {
            members[i] = new Member();
            replies.add(new ArrayList<>());
        }

        // 회장 제외 그래프 생성
        for (int i = 1; i < reply.length; i++) {
            for (int k : reply[i]) {
                replies.get(k).add(i);
            }
        }

        for (int i = 1; i < reply.length; i++) {
            if (members[i].groupNumber == -1){
                groupingDFS(members, replies, i);
            }
        }

        boolean[] skip = new boolean[groupCount];
        for (int i = 1; i < replies.size(); i++) {
            for (int k : replies.get(i)) {
                if (members[i].groupNumber != members[k].groupNumber) {
                    // 같은 그룹이 아닌데 그래프 연결점이 있는 경우 skip한다.
                    skip[members[k].groupNumber] = true;
                }
            }
        }

        int answer = 0;
        for (int i = 0; i < groupCount; i++) {
            if (!skip[i]) {
                answer++; // skip되지 않은 그룹들만 카운트
            }
        }
        return answer;
    }

    private int groupingDFS(Member[] members, List<List<Integer>> replies, int num) {
        members[num].visit = visitDepth;
        stack.push(num);

        int ret = visitDepth;
        visitDepth += 1;

        for (int k : replies.get(num)){
            if (members[k].visit == -1){
                ret = Math.min(ret, groupingDFS(members, replies, k));
            }
            if (members[k].groupNumber == -1) {
                ret = Math.min(ret, members[k].visit);
            }
        }

        if (ret == members[num].visit) {
            while(true){
                int now = stack.pop();
                members[now].groupNumber = groupCount;
                if(now == num) break;
            }
            groupCount++;
        }

        return ret;
    }

}
