class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix==null || matrix.length==0){
            return new ArrayList<>();
        }

        List<Integer> result =new ArrayList<>();
        int m = matrix.length;
        int n=matrix[0].length;
        int top=0;
        int bottom=m-1;
        int left=0;
        int right=n-1;

        while(top<=bottom || left<=right){
            //move from left to right
            for(int i=left;i<=right;i++){
                result.add(matrix[top][i]);    
            }
            top++;
            //move from top to bottom
            for(int i=top;i<=bottom;i++){
                result.add(matrix[i][right]);
            }
            right--;
            //move from right to left
            if(top<=bottom){
            for(int i=right;i>=left;i--){
                result.add(matrix[bottom][i]);
            }
            bottom--;
            }

            //move from bottom top top
            if(left<=right){
            for(int i=bottom;i>=top;i--){
                result.add(matrix[i][left]);
            }
            left++;
            }

        }
        return result;
    }
}