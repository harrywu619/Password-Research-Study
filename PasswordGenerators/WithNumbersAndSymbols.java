import java.util.Random;

public class WithNumbersAndSymbols {
	public static void main(String[] args) {
		Random rand = new Random();
		String[] part1 = {"Bad","Sad","Rad","Big","Dry","Dim","Fit","Fat",
				"Icy","Odd","Old","One","Red","Tan","Any","Coy","Fit","His","Her",
				"Mad","Raw","Toy","Own","Lax","Hot"};
		String[] part2 = {"bat","cat","dog","log","rat","hat","guy","man",
				"can","car","pan","mat","rug","bug","mud","eye","key","son","bed",
				"leg","arm","art","box","bun","lid"};
		String[] symbols = {"!","@","#","$","%","^","&","*","(",")"};
		for (int i=0; i<part1.length; i++) {
			for (int j=0; j<part2.length; j++) {
				System.out.println(part1[i] + part2[j] + rand.nextInt(10) + symbols[rand.nextInt(10)]);
			}
		}
	}
}
