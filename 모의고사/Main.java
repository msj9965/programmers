import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    static class Solution {
        public int[] solution(int[] answers) {
            int[] one = {1,2,3,4,5};
            int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
            int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
            ArrayList<Integer>list = new ArrayList<>();
            int index = 0;
            int num1 = 0;
            for(int i = 0;i<answers.length;i++) {
                if (answers[i] == one[index]) {
                    num1++;
                }
                if(index==one.length-1) {
                    index=0;
                }
                else {
                index++;
                }
            }
            list.add(num1);
            index = 0;
            int num2 = 0;
            for(int i = 0;i<answers.length;i++) {
                if (answers[i] == two[index]) {
                    num2++;
                }
                if(index==two.length-1) {
                    index=0;
                }
                else {
                    index++;
                }
            }
            list.add(num2);
            index = 0;
            int num3 = 0;
            for(int i = 0;i<answers.length;i++) {
                if (answers[i] == three[index]) {
                    num3++;
                }
                if(index==three.length-1) {
                    index=0;
                }
                else {
                    index++;
                }
            }
            list.add(num3);
            ArrayList<Integer>a= new ArrayList<>();

            int max = Collections.max(list);
            for(int i = 0;i<3;i++){
                if(max==list.get(i)){
                    a.add(i+1);
                }
            }
            Integer[] numberArray = a.toArray(new Integer[a.size()]);

            // int 배열로 변환
            int[] answer = Arrays.stream(numberArray).mapToInt(Integer::intValue).toArray();

                return answer;
            }
        }

        public static void main(String[] args) {
            Solution s = new Solution();
            int[] a = new int[]{1,2,3,4,5};

            System.out.println(Arrays.toString(s.solution(a)));

        }
    }
