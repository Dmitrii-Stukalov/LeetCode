package test;

import code.Solution412;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution412Test {
	Solution412 solution = new Solution412();

	@Test()
	void firstTest() {
		int n = 3;
		assertEquals(List.of("1", "2", "Fizz"), solution.fizzBuzz(n));
	}

	@Test()
	void secondTest() {
		int n = 5;
		assertEquals(List.of("1", "2", "Fizz", "4", "Buzz"), solution.fizzBuzz(n));
	}

	@Test()
	void thirdTest() {
		int n = 15;
		assertEquals(List.of("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"), solution.fizzBuzz(n));
	}

}