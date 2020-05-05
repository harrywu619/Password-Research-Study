
public class LowercaseOnlySwapped {
	public static void main(String[] args) {
		String[] part1 = {"good","rich","hard","late","evil","dark","long","sick",
				"full","ugly","true","cute","nice","fair","soft","fast","easy","cold","fine",
				"dead","wild","tall","grey","blue","pink"};
		String[] part2 = {"part","cart","dart","rock","sock","lock","dock","deck",
				"bike","doll","shop","mart","bomb","moss","girl","clay","tray","play","clam",
				"bird","word","worm","trap","cafe","chin"};
		for (int i=0; i<part2.length; i++) {
			for (int j=0; j<part1.length; j++) {
				System.out.println(part2[i] + part1[j]);
			}
		}
	}
}
