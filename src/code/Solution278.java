package code;

public class Solution278 extends VersionControl {
	public int firstBadVersion(int n) {
		int l = 1;
		int r = n;
		while (l < r) {
			int m = l + (r - l) / 2;
			if (isBadVersion(m)) {
				r = m;
			} else {
				l = m + 1;
			}
		}
		return r;
	}
}

class VersionControl {
	private int badVersion = -1;

	public void setBadVersionNumber(int version) {
		badVersion = version;
	}

	boolean isBadVersion(int version) {
		return version >= badVersion;
	}
}