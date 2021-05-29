package recursion.test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;

import recursion.main.RecursionTutorial;

public class RecursionTutorialTests {

	RecursionTutorial recurTutorial = new RecursionTutorial();
	int[] testArr = new int[6];

	@Test
	void headRecursionTest() {
		recurTutorial.headRecursion(0, testArr);
		assertArrayEquals(new int[] { 6, 5, 4, 3, 2, 1 }, testArr);

	}
}
