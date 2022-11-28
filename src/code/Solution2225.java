package code;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Solution2225 {
    public List<List<Integer>> findWinners(int[][] matches) {
        Set<Integer> winners = new TreeSet<>();
        Set<Integer> losers = new TreeSet<>();
        Set<Integer> loseMoreThanOne = new HashSet<>();
        for (int[] match : matches) {
            int winner = match[0];
            int loser = match[1];
            if (!losers.contains(winner) && !loseMoreThanOne.contains(winner)) {
                winners.add(winner);
            } else {
                winners.remove(winner);
            }
            if (!losers.contains(loser) && !loseMoreThanOne.contains(loser)) {
                losers.add(loser);
            } else {
                losers.remove(loser);
                loseMoreThanOne.add(loser);
            }
            winners.remove(loser);
        }
        return List.of(winners.stream().toList(), losers.stream().toList());
    }
}
