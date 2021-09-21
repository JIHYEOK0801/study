package Level2.JadenCase_문자열_만들기;
/*
    1. java는 문자열을 바꿀수 없다.
    2. java는 split을 해도 공백이 많으면 length = 0 짜리 문자열이 들어간다.
    3. 공백이 여러개일 때를 생각하지 않았다.
 */

class Solution {
    public String solution(String s) {
        char []c_array = s.toCharArray();

        StringBuilder sb = new StringBuilder();
        sb.append(Character.toUpperCase(s.charAt(0)));

        for(int i = 1; i < c_array.length; i++){
            if(c_array[i-1] == ' '){
                sb.append(Character.toUpperCase(c_array[i]));
            }
            else{
                sb.append(Character.toLowerCase(c_array[i]));
            }
        }
        String answer = sb.toString();

        return answer;
    }
}
public class j_2109210923 {
    public static void main(String[] args) {
        String s = new String("for a he    last week     ");
        String answer = new Solution().solution(s);
        System.out.println(answer);
    }
}
