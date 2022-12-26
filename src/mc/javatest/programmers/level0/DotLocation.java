/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.level0;

/**
 * packageName    : mc.javatest.programmers.level0
 * fileName       : DotLocation
 * author         : MiracleCat
 * date           : 2022-12-26
 * description    : 점의 위치 구하기
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-12-26        MiracleCat       최초 생성
 */
public class DotLocation {

    public static void main(String[] args) {
        DotLocation dotLocation = new DotLocation();

        int[] dot = {2, 4};

        System.out.println(dotLocation.solution(dot));
    }

    /**
     * dot의 길이 = 2
     * dot[0]은 x좌표를, dot[1]은 y좌표를 나타냅니다
     * -500 ≤ dot의 원소 ≤ 500
     * dot의 원소는 0이 아닙니다.
     */
    public int solution(int[] dot) {
        int answer = 0;

        if(dot[0] > 0){
            if(dot[1] > 0) answer = 1;
            else answer = 4;
        }else{
            if(dot[1] > 0) answer = 2;
            else answer = 3;
        }

        return answer;
    }

}
