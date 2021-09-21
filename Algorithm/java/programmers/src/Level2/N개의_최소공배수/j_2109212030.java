package Level2.N개의_최소공배수;
class Solution {
    int GCD(int a, int b){
        int gcd = 1;
        while(true){
            int minNumber = Math.min(a,b);
            for(int i=2;;i++){
                //i로 나뉘어 질때
                if(a % i == 0 && b % i == 0){
                    a = (int)(a/i);
                    b = (int)(b/i);
                    gcd *= i;
                    break;
                }
                //i가 한 값을 넘어갈 경우
                if(i > minNumber){
                    gcd = a * b * gcd;
                    return gcd;
                }
            }
        }
    }
    public int solution(int[] arr) {
        int answer = 1;
        if (arr.length == 1) return arr[0];

        for(int i=0; i<arr.length-1; i++){
            int lcd = GCD(arr[i],arr[i+1]);
            arr[i+1] = lcd;
        }
        return answer = arr[arr.length-1];
    }
}
public class j_2109212030 {
    public static void main(String[] args) {
        int answer = new Solution().solution(new int[]{2, 6, 8, 14});
        System.out.println(answer);
        answer = new Solution().solution(new int[]{1,2,3});
        System.out.println(answer);
    }
}
