package mc.javatest.main;

import java.util.Arrays;

public class Change {

    public static void main(String[] args){
        String t = "[[1, 4, 4], [1, 6, 1], [1, 7, 3], [2, 5, 2], [3, 7, 4], [5, 6, 6]]";

        t = t.replaceAll("\\[", "{");
        t = t.replaceAll("]", "}");

        System.out.println(t);

    }

}