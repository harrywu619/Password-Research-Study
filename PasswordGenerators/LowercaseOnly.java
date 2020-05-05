
public class LowercaseOnly {
	public static void main(String[] args) {
		String[] part1 = {"good","rich","hard","late","evil","dark","long","sick",
				"full","ugly","true","cute","nice","fair","soft","fast","easy","cold","fine",
				"dead","wild","tall","grey","blue","pink"};
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
