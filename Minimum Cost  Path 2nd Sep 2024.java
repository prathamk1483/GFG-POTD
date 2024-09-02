
// class Solution
// {
//     private int helper(int[][] grid , int i , int j,int[][] dp){
//         if(i == 1 && j == 1) return grid[i-1][j-1];
//         if((i ==0  || i > grid.length) || (j > grid[0].length || j == 0)) return Integer.MAX_VALUE;
//         if(dp[i][j] != -1) return dp[i][j];
//         int top = helper(grid,i-1,j,dp),
//         left = helper(grid,i,j-1,dp);
//         return dp[i][j] = grid[i-1][j-1] + Math.min(top , left);
//     }
//     public int minimumCostPath(int[][] grid)
//     {
//         int[][] dp = new int[grid.length+1][grid[0].length+1];
//         for(int i[] : dp){
//             Arrays.fill(i,-1);
//         }
//         return helper(grid,grid.length,grid[0].length,dp);
//     }
// }


class Solution {

    public int minimumCostPath(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        // Directions for moving up, down, left, right
        int[] directions = {-1, 0, 1, 0, 0, -1, 0, 1};

        // Priority queue to hold cells with their current cost
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[2], b[2]));

        // Initialize distance array with infinity
        int[][] distance = new int[m][n];
        for (int[] row : distance) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        // Start from the top-left corner
        distance[0][0] = grid[0][0];
        pq.offer(new int[]{0, 0, grid[0][0]});

        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int x = current[0];
            int y = current[1];
            int cost = current[2];

            // If we reached the bottom-right corner
            if (x == m - 1 && y == n - 1) {
                return cost;
            }

            // Explore neighbors
            for (int d = 0; d < 4; d++) {
                int newX = x + directions[d * 2];
                int newY = y + directions[d * 2 + 1];

                // Check if the new cell is within bounds
                if (newX >= 0 && newX < m && newY >= 0 && newY < n) {
                    int newCost = cost + grid[newX][newY];
                    if (newCost < distance[newX][newY]) {
                        distance[newX][newY] = newCost;
                        pq.offer(new int[]{newX, newY, newCost});
                    }
                }
            }
        }

        // If the bottom-right corner is not reachable, return -1 or a similar indication
        return -1;
    }
}
