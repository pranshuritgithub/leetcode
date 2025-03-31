class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        int minRow = 0;
        int maxRow = matrix.length-1;
        int minCol = 0;
        int maxCol = matrix[0].length-1; 
        int total_count = matrix.length * matrix[0].length;
        

        while(true)
        {
            for(int i=minCol;i<=maxCol;i++)
            {
                list.add(matrix[minRow][i]);
            }
            minRow++;
            if(list.size() >= total_count)
            {
                break;
            }
            for(int i = minRow;i <= maxRow;i++)
            {
                list.add(matrix[i][maxCol]);
            }
            maxCol--;

            if(list.size() >= total_count)
            {
                break;
            }

             for(int i=maxCol;i>=minCol;i--)
            {
                list.add(matrix[maxRow][i]);
            }
            maxRow--;

            if(list.size() >= total_count)
            {
                break;
            }

            for(int i=maxRow;i>=minRow;i--)
            {
                list.add(matrix[i][minCol]);
            }
            minCol++;
            
            if(list.size() >= total_count)
            {
                break;
            }

        } 
        return list; 
    }
}