/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.main;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * packageName    : mc.javatest.main
 * fileName       : CodeTest
 * author         : MiracleCat
 * date           : 2023-01-16
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-16        MiracleCat       최초 생성
 */
public class CodeTest {

    public static void main(String[] args) {

        /** int[] to List<Integer> */
        int[] intToInteger = {1, 2, 3};
        List<Integer> integerOfInt1 = IntStream.of(intToInteger).boxed().collect(Collectors.toList());
        List<Integer> integerOfInt2 = Arrays.stream(intToInteger).boxed().collect(Collectors.toList());
        System.out.printf("int[] to List<Integer> %s\n", integerOfInt1);
        System.out.printf("int[] to List<Integer> %s\n", integerOfInt2);

        // int Sort list<Integer> Sort
        Arrays.sort(intToInteger); // 오름차순
        Collections.sort(integerOfInt1); // 오름차순
        System.out.printf("int[] sort asc %s\n", Arrays.toString(intToInteger));
        System.out.printf("List<Integer> sort asc %s\n", integerOfInt1);

        Collections.sort(integerOfInt1, Comparator.reverseOrder()); // 내림차순
        System.out.printf("List<Integer> sort desc %s\n", integerOfInt1);

        System.out.printf("배열 합 %s\n", IntStream.of(intToInteger).sum());
        System.out.printf("배열 최대값 %s\n", IntStream.of(intToInteger).max().orElse(0));
        System.out.printf("배열 필터 %s\n", Arrays.toString(IntStream.of(intToInteger)
                .filter(v -> v < 3).toArray()));
        System.out.printf("배열 필터로 정렬 %s\n", Arrays.toString(IntStream.of(intToInteger)
                .boxed().sorted((o1, o2) -> Integer.compare(o2, o1)).toArray()));

        System.out.println();
        /** String[] to List<String> */
        String[] stringToArray = {"a","b","c"};
        List<String> arrayOfString1 = Arrays.asList(stringToArray);

        Arrays.sort(stringToArray); // 오름 차순
        Collections.sort(arrayOfString1); // 오름 차순
        System.out.printf("String[] sort asc %s\n", Arrays.toString(stringToArray));
        System.out.printf("List<String> sort asc %s\n", arrayOfString1);
        Arrays.sort(stringToArray, Comparator.reverseOrder()); // 내림 차순
        Collections.sort(arrayOfString1, Comparator.reverseOrder()); // 내림 차순
        System.out.printf("String[] sort desc %s\n", Arrays.toString(stringToArray));
        System.out.printf("List<String> sort desc %s\n", arrayOfString1);

        System.out.print("foreach 출력 : ");
        arrayOfString1.stream().sorted(Comparator.reverseOrder()).forEach(v -> System.out.printf("%s ",v));
        System.out.println();

        System.out.println();
        /** Map 정렬 */
        HashMap<String, Integer> hm = new HashMap<>();
        TreeMap<String, Integer> tm = new TreeMap<>();
        hm.put("ace",2);
        hm.put("bite",3);
        hm.put("cage",1);
        tm.put("cage",2);
        tm.put("bite",1);
        tm.put("ace",3);

        System.out.printf("HashMap %s\n", hm);
        System.out.printf("TreeMap 정렬된 맵 %s\n", tm);

        List<Map.Entry<String, Integer>> mapToList = new ArrayList<>(hm.entrySet());
        System.out.printf("HashMap to List %s\n", mapToList);

        mapToList.sort(Comparator.comparing(Map.Entry::getKey));
        System.out.printf("HashMap to List Key asc %s\n", mapToList);
        mapToList.sort((o1, o2) -> o2.getKey().compareTo(o1.getKey()));
        System.out.printf("HashMap to List Key desc %s\n", mapToList);
        mapToList.sort(Map.Entry.comparingByKey(Comparator.naturalOrder()));
        System.out.printf("HashMap to List Key desc %s\n", mapToList);

        mapToList.sort(Comparator.comparingInt(Map.Entry::getValue));
        System.out.printf("HashMap to List Value asc %s\n", mapToList);
        mapToList.sort((o1, o2) -> o2.getValue() - o1.getValue());
        System.out.printf("HashMap to List Value desc %s\n", mapToList);
        mapToList.sort(Map.Entry.comparingByValue(Comparator.naturalOrder()));
        System.out.printf("HashMap to List Value desc %s\n", mapToList);

        System.out.println();
        /** PriorityQueue 정렬 */


        /** Stream */
        Boolean[] b = {true, true, false};
        System.out.println(Stream.of(b).filter(v -> v == true).count());
        String[] s = {"ACE","BASE","ANT"};
        System.out.println(Stream.of(s).filter(v -> v.startsWith("A")).count());
        int[] i = {1, 5, 3, 10, 9};
        System.out.println(IntStream.of(i).filter(v -> v < 6).count());

    }
}
