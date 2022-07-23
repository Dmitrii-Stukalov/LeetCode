package code;

public class Solution1689 {
	public int minPartitions(String n) {
		return n.chars().max().getAsInt() - '0';
	}
}
