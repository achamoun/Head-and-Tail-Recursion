package recursion.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * this class explains the difference between tail and head recursion with
 * simple examples. run the main method and notice the results of the print out
 * statements.
 * 
 * @author aboud
 *
 */
public class RecursionTutorial {

	/**
	 * tail recursion executes statements first and calls the method in the end.
	 * 
	 * @param number
	 */
	public void tailRecursion(int number, int[] arr) {
		System.out.print("tail recursion number " + number + " has been called \n");

		if (number >= arr.length-1) {
			System.out.print("retrun from tail recursion number " + number + "\n");
			return;
		}

		arr[number] = arr.length - number;

		System.out.print("tail recursion number " + number + ", adding " + number + " to the list \n");
		tailRecursion(++number, arr);
	}

	/**
	 * head recursion calls the method before executing the statements.
	 * 
	 * @param number
	 */
	public void headRecursion(int number, int[] arr) {
		System.out.print("head recursion number " + number + " has been called \n");

		if (number >= arr.length - 1) {
			System.out.print("retrun from head recursion number " + number + "\n");
			return;
		}
		headRecursion(++number, arr);

		System.out.print("head recursion number " + number + ", adding " + number + " to the list \n");
		arr[number] = arr.length - number;

	}

	public static void main(String[] args) {

		RecursionTutorial tutorial = new RecursionTutorial();

		// notice that the statement will be executed (adding number to the List) and
		// then the next method will be called.

		int[] test = new int[6];
		tutorial.tailRecursion(0, test);
		System.out.print( Arrays.toString(test) + "\n");
		System.out.print("\n");

		// notice that the method will be called 5 times and then the statements will be
		// executed backwards(the fifth called method will run its statements first,
		// then the
		// forth and so on)

		int[] test1 = new int[6];
		tutorial.headRecursion(0, test1);
		System.out.print(Arrays.toString(test1)  + "\n");

	}

}
