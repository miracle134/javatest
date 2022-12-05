package mc.javatest.algorithm;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringJoiner;

public class BreadthFirstSearch {

    int[][] arr = {{1, 2}, {1, 6}, {1, 7}, {2, 3}, {2, 4}, {4, 5}, {7, 8}, {7, 9}}; // 노드 관계
    int node = 9; // 노드 개수
    boolean[] check = new boolean[node+1]; // 방문 확인
    int[][] graph = new int[node+1][node+1]; // 그래프

    public static void main(String[] args){
        BreadthFirstSearch bfs = new BreadthFirstSearch();

        /**
         *  그래프 그리기
         *  노드가 연결되어 있으면 1 없으면 0(기본값)
         **/
        for (int i = 0; i < bfs.arr.length; i++) {
            bfs.graph[bfs.arr[i][0]][bfs.arr[i][1]] = 1;
            bfs.graph[bfs.arr[i][1]][bfs.arr[i][0]] = 1;
        }

        // 너비탐색 BFS
        bfs.bfs(1);

    }

    private void bfs(int start) {
        StringJoiner sj = new StringJoiner(", ");
        Queue<Integer> pq = new LinkedList<>();
        pq.offer(start);
        check[start] = true;

        System.out.printf("큐 : %s ", pq);

        while(!pq.isEmpty()){
            int search = pq.poll();

            System.out.printf("방문 : %s\n", search);
            sj.add(""+search);

            for (int i = 0; i < graph[search].length; i++) {
                if(check[i] || graph[search][i] < 1) continue;

                pq.offer(i);
                check[i] = true;
            }

            System.out.printf("큐 : %s ", pq);
        }


        System.out.printf("\n방문 순서 : [%s]", sj);
    }

}
