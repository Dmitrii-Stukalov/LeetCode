package test;

import code.Solution535.Codec;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution535Test {
	Codec codec = new Codec();

	@Test
	void firstTest() {
		String url = "https://leetcode.com/problems/design-tinyurl";
		String tiny = codec.encode(url);
		String ans = codec.decode(tiny);
		assertEquals(url, ans);
	}

	@Test
	void secondTest() {
		String url = "http://airport.example.com/";
		String tiny = codec.encode(url);
		String ans = codec.decode(tiny);
		assertEquals(url, ans);
	}
}