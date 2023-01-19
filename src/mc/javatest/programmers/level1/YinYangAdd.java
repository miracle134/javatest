/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.level1;

/**
 * packageName    : mc.javatest.programmers.level1
 * fileName       : YinYangAdd
 * author         : MiracleCat
 * date           : 2023-01-18
 * description    : 음양 더하기
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-18        MiracleCat       최초 생성
 */
public class YinYangAdd {

    public static void main(String[] args) {
        YinYangAdd yinYangAdd = new YinYangAdd();

        int[] absolutes = {4,7,12};
        boolean[] signs = {true,false,true};

        System.out.println(yinYangAdd.solution(absolutes, signs));
    }

    /**
     * absolutes 의 길이는 1 이상 1,000 이하입니다.
     * absolutes 의 모든 수는 각각 1 이상 1,000 이하입니다.
     * signs 의 길이는 absolutes 의 길이와 같습니다.
     * signs[i] 가 참이면 absolutes[i] 의 실제 정수가 양수임을, 그렇지 않으면 음수임을 의미합니다.
     */
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < absolutes.length; i++) {
            if(signs[i]) answer += absolutes[i];
            else answer -= absolutes[i];
        }

        return answer;
    }
}
