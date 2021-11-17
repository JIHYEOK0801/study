package Level2.숫자의_표현;

public class j_2111171308 {
    public int solution(int n) {
        int answer = 0;

        for(int i=1; i<=n; i++){
            int mok = n / i;

            if(i % 2 == 1){
                int num = mok - i/2;
                if(num <= 0) break;
                int sum = 0;
                for(int j=0; j<i; j++){
                    sum += num + j;
                }
                if(sum == n) answer += 1;
            }
            else{
                int num = mok - i/2 + 1;
                if(num <= 0) break;
                int sum = 0;
                for(int j=0; j<i; j++){
                    sum += num + j;
                }
                if(sum == n) answer += 1;
            }
        }
        return answer;
    }
}
