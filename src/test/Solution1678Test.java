package test;

import code.Solution1678;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1678Test {
	Solution1678 solution = new Solution1678();

	@Test
	void firstTest() {
		String command = "G()(al)";
		assertEquals("Goal", solution.interpret(command));
	}

	@Test
	void secondTest() {
		String command = "G()()()()(al)";
		assertEquals("Gooooal", solution.interpret(command));
	}

	@Test
	void thirdTest() {
		String command = "(al)G(al)()()G";
		assertEquals("alGalooG", solution.interpret(command));
	}
}