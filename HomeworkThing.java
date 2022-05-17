package test;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class HomeworkThing {
	
	private static String oogabooga = "Onga Bonga";

	@Test
	void test_counter() {
		System.out.println("Counting characters in string \"Hello world\" (including space)... ");
		HomeworkThing t_variable = new HomeworkThing();
		assertTrue(t_variable.countCharacters("Hello world") == 11);
		System.out.println("Everything's alright?");
	}
	
	@Test
	public void test_multiplication() {
		System.out.println("Multiplication between 11 and 4. Expected value is 44");
		HomeworkThing t_variable = new HomeworkThing();
		assertTrue(t_variable.multiply(11, 4) == 44);
		System.out.println("Everything's alright?");
	}
	public int multiply(int x, int y) {
		return x*y;
	}
	
	public int countCharacters(String word) {
		int count = 0;
		for(int i = 0; i < word.length(); i++) {
			count++;
		}
		return count;
	}
	
	void printooga() {
		System.out.println(oogabooga);
	}
	
	public static void main (String[] args) {
		System.out.println("Heyo\n");
		HomeworkThing Lmao = new HomeworkThing();
		System.out.println("Multiplying 4 * 5 = " + Lmao.multiply(4, 5));
		System.out.println("\nCounting characters in \"Homework is done\".\nResult = " + Lmao.countCharacters("Homework is done") + " characters");
	}
	
	
	
}
