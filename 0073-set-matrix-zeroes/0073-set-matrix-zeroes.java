class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int zeroRow[] = new int[rows];
        int zeroCol[] = new int[cols];

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(matrix[i][j] == 0)
                {
                    zeroRow[i] = 1;
                    zeroCol[j] = 1;
                }
            }
        }

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(zeroRow[i] == 1 || zeroCol[j] == 1)
                {
                    matrix[i][j] = 0;
                }
            }
        }

    }
}