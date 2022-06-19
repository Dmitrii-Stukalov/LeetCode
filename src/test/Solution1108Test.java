package test;

import code.Solution1108;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution1108Test {
	Solution1108 solution = new Solution1108();

	@Test
	void firstTest() {
		String address = "1.1.1.1";
		assertEquals( "1[.]1[.]1[.]1", solution.defangIPaddr(address));
	}

	@Test
	void secondTest() {
		String address = "255.100.50.0";
		assertEquals( "255[.]100[.]50[.]0", solution.defangIPaddr(address));
	}
}