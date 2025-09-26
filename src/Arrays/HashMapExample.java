package Arrays;

import java.util.HashMap;

public class HashMapExample {


    public static void main(String[] args) {
        HashMap<Integer, String> players = new HashMap<>();

        //adding values - key - value pair

        //***put

        players.put(10,"Joao Pedro");
        players.put(9,"Cole Palmer");
        players.put(6,"Enzo Fernandez");

        System.out.println(players);

        //an array of keys
        for(Integer jersey: players.keySet()){
            System.out.println(jersey);
        }

        //an array of values
        for(String player: players.values()){
            System.out.println(player);
        }

        String bestPlayer = players.get(9);

        System.out.println("best player > " + bestPlayer);
    }
}
