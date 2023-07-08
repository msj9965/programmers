import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {



   static class Solution {
        public String[] solution(String[] players, String[] callings) {
            Map<String, Integer> map = new HashMap<>();
            for (int i = 0; i < players.length; i++) {
                map.put(players[i], i);
            }
            for (String s : callings) {

                int cur = map.get(s);
                if (cur - 1 >= 0) {


                map.put(s, cur - 1);
                map.put(players[cur - 1], cur);
                players[cur] = players[cur - 1];
                players[cur - 1] = s;
            }
            }
            return players;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[]players = (br.readLine()).split(" ");
        String[]callings = (br.readLine()).split(" ");



        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(players, callings)));


    }
}