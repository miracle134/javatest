package mc.javatest.programmers.mytest.week1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BiggestNumber {

    public static void main(String[] args) throws Exception {
        BiggestNumber biggestNumber = new BiggestNumber();

        int[] numbers = {0, 0, 0, 0};

        System.out.println("리턴 값 : " + biggestNumber.solution(numbers));

    }

    public String solution(int[] numbers) {
        List<String> list = IntStream.of(numbers).mapToObj(String::valueOf)
                .sorted((o1, o2) -> (o2+o1).compareTo(o1+o2))
                .collect(Collectors.toList());

        if("0".equals(list.get(0))) return "0";

        StringBuilder sb = new StringBuilder();
        for(String s : list){
            sb.append(s);
        }

        return sb.toString();
    }

//    public String solution(int[] numbers) {
//        String answer = "";
//        StringBuilder sb = new StringBuilder();
//        ArrayList<NumberSort> list = new ArrayList<>();
//
//        Arrays.sort(numbers);
//
//        for (int i : numbers) {
//            list.add(new NumberSort(i));
//        }
//
//        list.sort(Comparator.reverseOrder());
//
//        int zeroCnt = 0;
//        for (NumberSort n : list) {
//            if(n.num == 0) zeroCnt++;
//            sb.append(n.num);
//        }
//
//        if(zeroCnt == sb.length()) return "0";
//
//        return sb.toString();
//    }
//
//    class NumberSort implements Comparable<NumberSort> {
//        int num;
//        String fullNum;
//
//        public NumberSort(int num) {
//            this.num = num;
//            this.fullNum = String.valueOf(num);
//            String tmp = String.valueOf(num);
//
//            for (int i = tmp.length(); i < 4; i++) {
//                fullNum += tmp.charAt(0);
//            }
//        }
//
//        @Override
//        public int compareTo(NumberSort o1) {
//            int fa = Integer.parseInt(this.fullNum);
//            int fb = Integer.parseInt(o1.fullNum);
//
//            if (fa > fb) return 1;
//            else if (fa == fb) {
//                int a = Integer.parseInt(String.valueOf(this.fullNum.charAt(0)));
//                int b = Integer.parseInt(String.valueOf(this.fullNum.charAt(1)));
//
//                if(a > b)
//                    return this.num - o1.num;
//                else
//                    return o1.num - this.num;
//
//            } else return -1;
//        }
//    }

}
