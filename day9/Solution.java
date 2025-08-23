// leetcode problem: https://leetcode.com/problems/spiral-matrix/ 
// Note: try on leetcode because we haven't written main method in vs code so it won't work on vs code

import java.util.*;
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top=0;
        int bottom=matrix.length-1;
        int left=0;
        int right=matrix[0].length-1;
        ArrayList<Integer> list= new ArrayList<>();
        while(left<=right&&top<=bottom){
            // putting the values of top
            for(int i=left;i<=right;i++){
                list.add(matrix[top][i]);
            }
            top++;
            // putting the values of right
            for(int i=top;i<=bottom;i++){
                list.add(matrix[i][right]);
            }
            right--;
            // check if still left<=right
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }
            // check if still top<=bottom
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }
        return list;
    }
}