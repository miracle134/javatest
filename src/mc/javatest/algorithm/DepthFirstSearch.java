package mc.javatest.algorithm;

import java.util.Stack;

public class DepthFirstSearch {

    int[][] arr = {{1, 2}, {1, 5}, {2, 3}, {2, 4}, {5, 6}, {5, 9}, {6, 7}, {7, 8}}; // 노드 관계
    int node = 9; // 노드 개수
    boolean[] check = new boolean[node + 1]; // 방문 확인
    int[][] graph = new int[node + 1][node + 1]; // 그래프

    public static void main(String[] args) {
        DepthFirstSearch dfs = new DepthFirstSearch();

        /**
         *  그래프 그리기
         *  노드가 연결되어 있으면 1 없으면 0(기본값)
         **/
        for (int i = 0; i < dfs.arr.length; i++) {
            dfs.graph[dfs.arr[i][0]][dfs.arr[i][1]] = 1;
            dfs.graph[dfs.arr[i][1]][dfs.arr[i][0]] = 1;
        }

        // 깊이탐색 DFS 재귀
        dfs.dfs(1);

        // 깊이탐색 DFS 스택
//        dfs.dfsStack(1);
    }

    private void dfs(int node) {
        if (check[node]) return; // 중복 방문 확인
        check[node] = true;
        System.out.printf("%s 방문\n", node);

        for (int i = 0; i < graph[node].length; i++) {
            if (graph[node][i] > 0 && !check[i]) {
                dfs(i);
            }
        }

    }

    private void dfsStack(int startNode) {
        // 스택 생성
        Stack<Integer> stack = new Stack<>();
        // 인접노드 확인 flag
        boolean flag;

        // 시작점 및 방문 처리
        stack.add(startNode);
        check[startNode] = true;

        System.out.printf("%s 방문 :", startNode);
        System.out.printf(" %s\n", stack);

        while (!stack.isEmpty()) {
            flag = false;
            int node = stack.peek();

            for (int i = 0; i < graph[node].length; i++) {
                if (graph[node][i] == 0 || check[i]) continue; // 중복 방문 확인

                stack.add(i);
                check[i] = true;
                flag = true;

                System.out.printf("%s 방문 :", i);
                System.out.printf(" %s\n", stack);
                break;
            }

            // 방문할 인접 노드가 없으면 Pop
            if (!flag) stack.pop();
        }

    }

}
