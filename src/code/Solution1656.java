package code;

import java.util.ArrayList;
import java.util.List;

public class Solution1656 {
	public static class OrderedStream {
		private final String[] stream;
		private int ptr;

		public OrderedStream(int n) {
			stream = new String[n];
			ptr = 0;
		}

		public List<String> insert(int idKey, String value) {
			idKey--;
			stream[idKey] = value;
			List<String> result = new ArrayList<>();
			if (idKey == ptr) {
				while (ptr < stream.length && stream[ptr] != null) {
					result.add(stream[ptr++]);
				}
			}
			return result;
		}
	}
}
