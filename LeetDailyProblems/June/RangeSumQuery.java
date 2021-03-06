## Time Complexity:-O(n^2)
private int [][] data;
      // Constructor
    public NumMatrix(int[][] matrix) 
    {
        int m=matrix.length;
        int n=matrix[0].length;
        data=matrix;
        
       
        
        
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) 
    {
      int sum=0;
      for(int i=row1;i<=row2;i++)
      {
          for(int j=col1;j<=col2;j++)
          {
              sum=sum+data[i][j];
          }
      }
        return sum;
        
    
##Time Complexity:-O(m*n)
## By using Dp
public class NumMatrix {
private int[][] dp;
    public NumMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                int left = (j == 0) ? 0 : matrix[i][j - 1];
                int up = (i == 0) ? 0 : matrix[i - 1][j];
                int corner = (i == 0 || j == 0) ? 0 : matrix[i - 1][j - 1];
                matrix[i][j] += (left + up - corner);
            }
        }
        dp = matrix;
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int left = (row1 > 0) ? dp[row1 - 1][col2] : 0;
        int up = (col1 > 0) ? dp[row2][col1 - 1] : 0;
        int corner = (row1 > 0 && col1 > 0) ? dp[row1 - 1][col1 - 1] : 0;
        return dp[row2][col2] - left - up + corner;
    }
}
 
