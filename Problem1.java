// Time Complexity: O(M*N)
// Space Complexity: O(M*N)
// Passed Leetcode

class Solution {
    public int maximalSquare(char[][] matrix) {
        
        if (matrix.length == 0 || matrix[0].length == 0)
            return 0;
        
        int[][] dp = new int[matrix.length + 1][matrix[0].length + 1];
        
        
        int max_len = 0;
        for (int i = 1 ; i <= matrix.length; i++)
        {
            for (int j = 1; j <= matrix[0].length; j++)
            {
                
                if (matrix[i - 1][j - 1] == '1')
                {
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i - 1][j - 1]), dp[i][j - 1]) + 1;
                    max_len = Math.max(dp[i][j], max_len);
                    
                }
                
            }
        }

        return max_len * max_len;
    }
}