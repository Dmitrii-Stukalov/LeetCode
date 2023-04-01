package test;

import code.Solution1656.OrderedStream;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.util.List;

class Solution1656Test {
	@Test
	void firstTest() {
		OrderedStream os = new OrderedStream(5);

		List<String> result1 = os.insert(3, "ccccc");// Inserts (3, "ccccc"), returns [].
		assertEquals(List.of(), result1);

		List<String> result2 = os.insert(1, "aaaaa");// Inserts (1, "aaaaa"), returns ["aaaaa"].
		assertEquals(List.of("aaaaa"), result2);

		List<String> result3 = os.insert(2, "bbbbb");// Inserts (2, "bbbbb"), returns ["bbbbb", "ccccc"].
		assertEquals(List.of("bbbbb", "ccccc"), result3);

		List<String> result4 = os.insert(5, "eeeee");// Inserts (5, "eeeee"), returns [].
		assertEquals(List.of(), result4);

		List<String> result5 = os.insert(4, "ddddd");// Inserts (4, "ddddd"), returns ["ddddd", "eeeee"].
		assertEquals(List.of("ddddd", "eeeee"), result5);
	}
}