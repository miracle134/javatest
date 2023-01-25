/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.level2;

import java.util.Stack;

/**
 * packageName    : mc.javatest.programmers.level2
 * fileName       : DeliveryBox
 * author         : MiracleCat
 * date           : 2023-01-10
 * description    : 택배상자
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-10        MiracleCat       최초 생성
 */
public class DeliveryBox {

    public static void main(String[] args) {
        DeliveryBox deliveryBox = new DeliveryBox();

        int[] order = {2, 1, 4, 3, 6, 5, 8, 7, 10, 9};

        System.out.println(deliveryBox.solution(order));
    }

    /**
     * 1 ≤ order 의 길이 ≤ 1,000,000
     * order 는 1이상 order 의 길이 이하의 모든 정수가 한번씩 등장합니다.
     * order[i]는 기존의 컨테이너 벨트에 order[i]번째 상자를 i+1번째로 트럭에 실어야 함을 의미합니다.
     */
    public int solution(int[] order) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 1; i <= order.length; i++) {

            if (order[answer] == i) {
                answer++;
            } else {
                if (stack.isEmpty()) {
                    stack.add(i);
                } else {
                    boolean flag = true;
                    while (flag) {
                        if (!stack.isEmpty() && order[answer] == stack.peek()) {
                            stack.pop();
                            answer++;
                        } else {
                            flag = false;
                        }
                    }

                    stack.add(i);
                }
            }

        }

        while (!stack.isEmpty()) {
            if (order[answer] == stack.peek()) {
                stack.pop();
                answer++;
            } else {
                break;
            }
        }

        return answer;
    }

}
