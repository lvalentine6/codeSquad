package presentation.BFS;

import java.util.LinkedList;
import java.util.Queue;

public class B1260BFS {
    static StringBuilder sb;
    public static void main(String[] args) {
        sb = new StringBuilder();

        // 탐색을 시작할 번호는 1이지만 인접행렬과 인덱스를 맞추기 위해서 0으로 설정
        int rootNode= 0;

        // 1. 인접 행렬 배열
        int[][] graph = {{0, 1, 1, 1}, {1, 0, 0, 1}, {1, 0, 0, 1}, {1, 1, 1, 0}};
//        int[][] graph = {{0, 0, 0, 0, 0}, {0, 0, 1, 1, 1}, {0, 1, 0, 0, 1}, {0, 1, 0, 0, 1}, {0, 1, 1, 1, 0}};

        // 2. 방문 여부 배열
        boolean[] visited = new boolean[graph.length];

        // BFS 메서드 호출
        bfs(graph, visited, rootNode);

        // 탐색 결과 출력
        System.out.println(sb);

    }

    // BFS 메서드
    static void bfs(int[][] graph, boolean[] visited, int rootNode) {
        // 3. 큐
        Queue<Integer> queue = new LinkedList<>();
        visited[rootNode] = true;
        queue.add(rootNode);

        while (!queue.isEmpty()) {
            int nowNode = queue.poll();
            // 실제 결과 + 1로 출력값 보정
            sb.append(nowNode + 1).append(" ");
            for (int i = 0; i < graph[0].length; i++) {
                if(graph[nowNode][i] == 1 && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}
