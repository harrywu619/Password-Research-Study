
public class UppercaseOnly {
	public static void main(String[] args) {
		String[] part1 = {"Good","Rich","Hard","Late","Evil","Dark","Long","Sick",
				"Full","Ugly","True","Cute","Nice","Fair","Soft","Fast","Easy","Cold","Fine",
				"Dead","Wild","Tall","Grey","Blue","Pink"};
		String[] part2 = {"part","cart","dart","rock","sock","lock","dock","deck",
				"bike","doll","shop","mart","bomb","moss","girl","clay","tray","play","clam",
				"bird","word","worm","trap","cafe","chin"};
		for (int i=0; i<part1.length; i++) {
			for (int j=0; j<part2.length; j++) {
				System.out.println(part1[i] + part2[j]);
			}
		}
	}
}
