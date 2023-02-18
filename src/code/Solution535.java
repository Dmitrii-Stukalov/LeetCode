package code;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution535 {
	public static class Codec {
		private static final Map<Integer, String> urls = new HashMap<>();
		private static final String EMPTY = "emptyHash";

		// Encodes a URL to a shortened URL.
		public String encode(String longUrl) {
			String[] split = longUrl.split("/");
			if (longUrl.endsWith("/")) {
				String path = EMPTY;
				int hashCode = path.hashCode();
				split = Arrays.copyOf(split, split.length + 1);
				split[split.length - 1] = String.valueOf(hashCode);
				urls.put(hashCode, path);
			} else {
				String path = split[split.length - 1];
				int hashCode = path.hashCode();
				split[split.length - 1] = String.valueOf(hashCode);
				urls.put(hashCode, path);
			}
			return String.join("/", split);
		}

		// Decodes a shortened URL to its original URL.
		public String decode(String shortUrl) {
			String[] split = shortUrl.split("/");
			int hashCode = Integer.parseInt(split[split.length - 1]);
			String path = urls.get(hashCode);
			if (EMPTY.equals(path)) {
				split[split.length - 1] = "";
			} else {
				split[split.length - 1] = path;
			}
			urls.remove(hashCode, path);
			return String.join("/", split);
		}
	}
}
