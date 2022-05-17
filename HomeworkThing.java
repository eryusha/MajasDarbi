package test;



public class HomeworkThing {
	
	static String oogabooga = "Onga Bonga";
	
	
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
