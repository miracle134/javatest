package mc.javatest.main;

import java.util.*;

public class Solution2 {

    public static void main(String[] args) throws Exception {
        Solution2 solution = new Solution2();

        int[][] c = {{1, 2, 2}, {1, 3, 5}, {1, 4, 3}, {2, 3, 7}, {2, 6, 10}
                , {3, 4, 1}, {3, 5, 2}, {3, 6, 5}, {4, 5, 7}, {5, 6, 2}};
        int d = 6;

        System.out.println("리턴 값 : " + solution.solution(c, d));

    }

    public int solution(int[][] path, int node) {
        int answer = 0;
        boolean[] check = new boolean[node + 1];
        PriorityQueue<Node> tpq = new PriorityQueue<>();
        int[] count = new int[node + 1];
        HashMap<Integer, PriorityQueue<Node>> hm = new HashMap<>();

        for (int[] ints : path) {
            PriorityQueue<Node> source = hm.getOrDefault(ints[0], new PriorityQueue<>());
            PriorityQueue<Node> destination = hm.getOrDefault(ints[1], new PriorityQueue<>());

            source.offer(new Node(ints[1], ints[2]));
            destination.offer(new Node(ints[0], ints[2]));

            hm.put(ints[0], source);
            hm.put(ints[1], destination);
        }

        for (int i = 1; i < count.length; i++) {
            count[i] = Integer.MAX_VALUE;
        }

        count[1] = 0;
        tpq.offer(new Node(1,0));

        while(!tpq.isEmpty()){
            Node n = tpq.poll();
            if(check[n.node]) continue;
            check[n.node] = true;
            int curCount = count[n.node];

            PriorityQueue<Node> pq = hm.get(n.node);
            while (!pq.isEmpty()) {
                Node tmp = pq.poll();
                if(check[tmp.node]) continue;

                int sum = curCount + tmp.value;
                if(count[tmp.node]>sum) {
                    tpq.offer(new Node(tmp.node,sum));
                    count[tmp.node] = sum;
                }
            }
            System.out.println(Arrays.toString(count));
        }
        return answer;
    }

    class Node implements Comparable<Node> {
        int node;
        int value;

        public Node(int node, int value) {
            this.node = node;
            this.value = value;
        }

        @Override
        public int compareTo(Node node) {
            if (this.value > node.value) return 1;
            else if (this.value < node.value) return -1;

            return 0;
        }
    }

}
