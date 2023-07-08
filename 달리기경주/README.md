public String[] solution(String[] players, String[] callings) {
            Map<String, Integer> map = new HashMap<>();  -> MAP을 선언함 맵은 <Key, Value> 형태로 선언된다. HashMap을 선언하면 key와 value값에 따른 순서가 없다.
            for (int i = 0; i < players.length; i++) {
                map.put(players[i], i);  -> players 배열 내에 있는 값과 인덱스들을 map형태로 저장한다. 값을 인덱스로 하고 키를 이름으로 해서 인덱스를 쉽게 찾도록 하였따.
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
