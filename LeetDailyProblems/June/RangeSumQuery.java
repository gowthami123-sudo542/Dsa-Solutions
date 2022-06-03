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
        
    }
