package code;

public class Solution2011 {
	public int finalValueAfterOperations(String[] operations) {
		int x = 0;
		for (String operation : operations) {
			switch (operation) {
				case "++X" -> ++x;
				case "X++" -> x++;
				case "--X" -> --x;
				case "X--" -> x--;
			}
		}
		return x;
	}
}
