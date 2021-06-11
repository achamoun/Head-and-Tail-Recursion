package recursion.main;

import java.util.Arrays;

/**
 * this class explains the difference between tail and head recursion with
 * simple examples. run the main method and notice the results of the print out
 * statements.
 * 
 * The scale for tail and head recursion is where the recursive call in the
 * function is.
 * 
 * If the recursive call is after all other statements in the function, we have
 * a tail recursion. If the recursive call is before all other statements in the
 * function, we have a head recursion.
 * 
 * Benefits: 
 * Tail recursion: if you want to call the function several times
 * recursively and execute statements before each call. Statements will be
 * executed in the same direction of the function recursive calls. Statements of
 * the first called function until the last one. Head recursion: if you want to
 * call the function several times recursively but execute the statements after
 * all calls are made. Statements will be executed in the opposite direction of
 * the function recursive calls. Statements of the last called function until
 * the first one.
 * 
 * @author aboud
 *
 */
public class RecursionTutorial {

	/**
	 * tail recursion executes statements first and calls the method in the end.
	 * 
	 * @param index
	 */
	public void tailRecursion(int index, int[] arr) {
		System.out.print("tail recursion number " + index + " has been called \n");

		if (index >= arr.length) {
			System.out.print("retrun from tail recursion number " + index + "\n");
			System.out.print(
					"Notice that each statement has been executed before " + "the next recursive call was made" + "\n");

			return;
		}

		// execute a statement
		arr[index] = index;
		System.out.print("tail recursion number " + index + ", adding " + index + " to the list \n");

		// recursive call in the end
		tailRecursion(index + 1, arr);
	}

	/**
	 * head recursion calls the method before executing the statements.
	 * 
	 * @param index
	 */
	public void headRecursion(int index, int[] arr) {
		System.out.print("head recursion number " + index + " has been called \n");

		if (index >= arr.length) {
			System.out.print("retrun from head recursion number " + index + "\n");
			System.out.print("Notice that all recursive calls has been made, now the "
					+ "statements will be executed backwards" + "\n");
			return;
		}

		// recursive call at first
		headRecursion(index + 1, arr);

		// execute a statement
		arr[index] = index;
		System.out.print("head recursion number " + index + ", adding " + index + " to the list \n");
	}

	public static void main(String[] args) {

		RecursionTutorial tutorial = new RecursionTutorial();

		// notice that the statement will be executed (adding number to the List) and
		// then the next method will be called.

		int[] test = new int[6];
		tutorial.tailRecursion(0, test);
		System.out.print(Arrays.toString(test) + "\n");
		System.out.print("\n");

		// notice that the method will be called 5 times and then the statements will be
		// executed backwards(the last called method will run its statements first)

		int[] test1 = new int[6];
		tutorial.headRecursion(0, test1);
		System.out.print(Arrays.toString(test1) + "\n");

	}

}
