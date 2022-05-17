package test; //Can be deleted, if not intended to stay within original package.
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class HomeworkThing {
	public static final int VARIABLE_X = 4;
	public static final int VARIABLE_Y = 5;
	public static final int VARIABLE_Z = 11;
	public static final int RESULT_VARIABLE = 44;

	@Test
	void testCounter() {
		System.out.println("Counting characters in string "
			+ "\"Hello world\" (including space)... ");
		HomeworkThing tVariable = new HomeworkThing();
		assertTrue(tVariable.countCharacters("Hello world") == VARIABLE_Z);
		System.out.println("Everything's alright?");
	}
	@Test
	public void testMultiplication() {
		System.out.println("Multiplication between 11 and 4." 
			+ " Expected value is 44");
		HomeworkThing tVariable = new HomeworkThing();
		assertTrue(tVariable.multiply(VARIABLE_Z, VARIABLE_X) == RESULT_VARIABLE);
		System.out.println("Everything's alright?");
	}
	public static int multiply(int x, int y) { //Multiplies two values
		return x * y;
	}
	public static int countCharacters(String word) { //Counts caracters in a given string
		int count = 0;
		for (int i = 0; i < word.length(); i++) {
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.println("Heyo\n");
		HomeworkThing lmaoMul = new HomeworkThing();
		System.out.println("Multiplying 4 * 5 = "
			+ lmaoMul.multiply(VARIABLE_X, VARIABLE_Y));
		System.out.println("\nCounting characters in \"Homework is done\".\nResult = " 
			+ lmaoMul.countCharacters("Homework is done") + " characters");
	}
}
