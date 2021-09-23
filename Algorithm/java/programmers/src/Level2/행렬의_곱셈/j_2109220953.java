package Level2.행렬의_곱셈;
class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int [][]answer = new int[arr1.length][arr2[0].length];

        for(int i=0; i< arr1.length; i++){
            for(int k=0; k<arr2[0].length; k++){
                int temp = 0;
                for(int j =0; j<arr1[0].length; j++){
                    temp += arr1[i][j] * arr2[j][k];
                }
                answer[i][k] = temp;
            }
        }
        //int[][] answer = {};
        return answer;
    }
}

public class j_2109220953 {
    public static void main(String[] args) {
        int [][]answer = new Solution().solution(new int [][] {{1,4}, {3,2}, {4,1}}, new int [][] {{3, 3}, {3, 3}});
        for(int i=0; i<answer.length; i++){
            for(int j=0; j<answer[i].length; j++){
                System.out.print(answer[i][j]);
            }
            System.out.println();
        }
    }
}
