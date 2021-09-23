package Level2.피보나치_수;

import java.util.ArrayList;
// (A+B) % C = ((A%C) + (B%C))%C 이다.
// 정수의 범위를 넘어가지 않게 프로그래밍하기

class Solution {
    public int solution(int n) {

        int answer = 0;
        int []array = new int[n+1];
        array[0] = 0;
        array[1] = 1;

        if(n<=1){
            return array[n];
        }

        for(int i=2; i<=n; i++){
            array[i] = (array[i-1] + array[i-2]) % 1234567;

        }

        answer = array[n];

        return answer;
    }
}
public class j_2109221036 {
    public static void main(String[] args) {
        int answer = new Solution().solution(10);
        System.out.println(answer);
    }
}
