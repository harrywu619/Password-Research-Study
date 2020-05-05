import java.util.Random;

public class WithNumbersLowerCase {
	public static void main(String[] args) {
		Random rand = new Random();
		String[] part1 = {"bad","sad","rad","big","dry","dim","fit","fat",
				"icy","odd","old","one","red","tan","any","coy","fit","his","her",
				"mad","raw","toy","own","lax","hot"};
		String[] part2 = {"bat","cat","dog","log","rat","hat","guy","man",
				"can","car","pan","mat","rug","bug","mud","eye","key","son","bed",
				"leg","arm","art","box","bun","lid"};
		for (int i=0; i<part1.length; i++) {
			for (int j=0; j<part2.length; j++) {
				System.out.println(part1[i] + part2[j] + rand.nextInt(10) + rand.nextInt(10));
			}
		}
	}
}
