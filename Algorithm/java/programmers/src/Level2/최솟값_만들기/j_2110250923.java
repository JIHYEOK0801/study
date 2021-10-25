package Level2.최솟값_만들기;
import java.util.*;
class Solution {
    public int solution(int []A, int []B)
    {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        for(int i=0;i<A.length;i++){
            answer += (A[i] * B[A.length - i - 1]);
        }
        return answer;
    }
}
public class j_2110250923 {
    public static void main(String[] args) {
        int []A = new int [] {1,4,2};
        int []B = new int [] {5,4,4};
        int answer = new Solution().solution(A,B);
        System.out.println(answer);
    }
}
