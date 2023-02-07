/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.mytest.week3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

/**
 * packageName    : mc.javatest.programmers.mytest.week3
 * fileName       : Week3Test1
 * author         : MiracleCat
 * date           : 2023-02-06
 * description    : 위장
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-02-06        MiracleCat       최초 생성
 */
public class Week3Test1 {

    public static void main(String[] args) {
        Week3Test1 week3Test1 = new Week3Test1();

        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};

        System.out.println(week3Test1.solution(clothes));
    }

//    public int solution(String[][] clothes) {
//        int answer = 1;
//        Map<String, Integer> map = new HashMap<>();
//
//        for(String[] cloth : clothes){
//            map.put(cloth[1], map.getOrDefault(cloth[1], 0) + 1);
//        }
//
//        for (int i : map.values()){
//            answer *= i + 1;
//        }
//
//        answer -= 1;
//
//        return answer;
//    }

    public int solution(String[][] clothes) {
        return Arrays.stream(clothes)
                .map(c -> c[1]).distinct()
                .map(type -> (int) Arrays.stream(clothes).filter(c -> c[1].equals(type)).count())
                .map(c -> c + 1)
                .reduce(1, (a, b) -> a * b) - 1;
    }

}
