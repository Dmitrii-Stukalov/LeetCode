package code;

public class Solution2114 {
	public int mostWordsFound(String[] sentences) {
		int max = 0;
		for (String sentence : sentences) {
			int sentenceLength = sentence.split(" ").length;
			if (sentenceLength > max) {
				max = sentenceLength;
			}
		}
		return max;
	}
}
