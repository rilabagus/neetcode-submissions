class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l = 0, r = matrix.length - 1;
        int y = (l + r) / 2;
        while(l<=r){
            y = (l + r) / 2;
            System.out.println(y);
            if( target >= matrix[y][0] && target <= matrix[y][matrix[y].length-1]){
                break; 
            }
            else if(target > matrix[y][0] && target > matrix[y][matrix[y].length-1]){
                l = y + 1;
            }
            else{
                r = y - 1;
            }
        }
        return searchInArray(matrix[y], target);
    }

    public boolean searchInArray(int[] row, int target){
        System.out.println(Arrays.toString(row));
        int l = 0, r = row.length - 1;
        while(l <= r){
            int mid = (l + r) / 2;
            if(row[mid] == target) return true;
            else if(row[mid] < target) l = mid + 1;
            else r = mid - 1;
        }
        return false;
    }
}
