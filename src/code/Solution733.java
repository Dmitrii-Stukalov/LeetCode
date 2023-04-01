package code;

public class Solution733 {
	public int[][] floodFill(int[][] image, int sr, int sc, int color) {
		if (image[sr][sc] == color) {
			return image;
		}
		int startColor = image[sr][sc];
		image[sr][sc] = color;
		if (sr > 0 && image[sr - 1][sc] == startColor) {
			floodFill(image, sr - 1, sc, color);
		}
		if (sr < image.length - 1 && image[sr + 1][sc] == startColor) {
			floodFill(image, sr + 1, sc, color);
		}
		if (sc > 0 && image[sr][sc - 1] == startColor) {
			floodFill(image, sr, sc - 1, color);
		}
		if (sc < image[sr].length - 1 && image[sr][sc + 1] == startColor) {
			floodFill(image, sr, sc + 1, color);
		}
		return image;
	}
}
