package mission3;

import java.util.LinkedList;
import java.util.Queue;

public class Problem3 {

    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static StringBuilder bfsBuilder;
    static StringBuilder dfsBuilder;

    public static void main(String[] args) {
        int[][] arr = {{0, 1, 1, 1, 0, 1, 1, 1}, {0, 0, 0, 1, 0, 0, 0, 0}, {1, 1, 0, 0, 0, 1, 0, 1},
                {1, 1, 0, 1, 1, 1, 0, 1}, {1, 0, 0, 1, 0, 0, 0, 0}, {0, 1, 1, 1, 0, 1, 1, 1}, {1, 0, 1, 1, 0, 0, 0, 0},
                {0, 1, 1, 0, 1, 1, 1, 0}};

        boolean[][] visited = new boolean[arr.length][arr[0].length];
        bfsBuilder = new StringBuilder();
        dfsBuilder = new StringBuilder();

        bfs(arr, visited, new int[]{0, 0});
        bfsBuilder.append("출구는 " + bfsBuilder.substring(bfsBuilder.length() - 10, bfsBuilder.length() - 4) + " 입니다.");
        System.out.println("BFS : " + bfsBuilder);

        visited = new boolean[arr.length][arr[0].length];
        visited[0][0] = true;
        dfs(arr, visited, new int[]{0, 0});
        dfsBuilder.append("출구는 " + dfsBuilder.substring(dfsBuilder.length() - 10, dfsBuilder.length() - 4) + " 입니다.");
        System.out.println("DFS : " + dfsBuilder);

    }

    static void bfs(int[][] arr, boolean[][] visited, int[] xy) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(xy);
        visited[xy[1]][xy[0]] = true;

        while (!queue.isEmpty()) {
            int[] temp = queue.poll();

            bfsBuilder.append("[" + temp[0] + ", ");
            bfsBuilder.append(temp[1] + "]");
            bfsBuilder.append(" -> ");

            for (int i = 0; i < 4; i++) {
                int nextX = dx[i] + temp[0];
                int nextY = dy[i] + temp[1];

                if (nextX < 0 || nextY < 0 || nextX >= 8 || nextY >= 8) {
                    continue;
                }

                if (!visited[nextY][nextX] && arr[nextY][nextX] == 0) {
                    queue.add(new int[]{nextX, nextY});
                    visited[temp[1]][temp[0]] = true;
                }
            }

        }
    }

    static void dfs(int[][] arr, boolean[][] visited, int[] xy) {
        if (visited[7][7]) {
            return;
        }

        dfsBuilder.append("[" + xy[0] + ", ");
        dfsBuilder.append(xy[1] + "]");
        dfsBuilder.append(" -> ");

        for (int i = 0; i < 4; i++) {
            int nextX = dx[i] + xy[0];
            int nextY = dy[i] + xy[1];

            if (nextX < 0 || nextY < 0 || nextX >= 8 || nextY >= 8) {
                continue;
            }

            if (!visited[nextY][nextX] && arr[nextY][nextX] == 0) {
                visited[nextY][nextX] = true;
                if (nextY == 7 && nextX == 7) {
                    dfsBuilder.append("[" + nextY + ", ");
                    dfsBuilder.append(nextX + "]");
                    dfsBuilder.append(" -> ");
                }
                dfs(arr, visited, new int[]{nextX, nextY});
            }
        }
    }
}
