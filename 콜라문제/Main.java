public class Main {

    static class Solution {
        Solution(){

        }
        public int solution(int a, int b, int n) {
            int c ;
            int answer = 0;

            while(true){
                if(n>=a){
                    n = n-a+b;
                    answer = answer+b;
                }
                else{
                    break;
                }

            }
            return answer;
        }
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(3,1,20));

    }
}