package Level2.최댓값과_최솟값;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] s_split = s.split(" ");
        int min, max;
        min = Integer.parseInt(s_split[0]);
        max = Integer.parseInt(s_split[0]);

        for(int i = 0; i<s_split.length; i++){
            int temp = Integer.parseInt(s_split[i]);

            if(temp > max){
                max = temp;
            }
            if(temp < min){
                min = temp;
            }
        }
        answer += (Integer.toString(min) + " " + Integer.toString(max));
        return answer;
    }
}
public class j_2110250947 {
    public static void main(String[] args) {

        String answer = new Solution().solution("1 2 3 4");
        System.out.println(answer);
    }
}

