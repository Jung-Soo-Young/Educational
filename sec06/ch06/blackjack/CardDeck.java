package sec06.ch06.blackjack;

public class CardDeck {
	private final Card[] CARD_ARR = new Card[52]; // 은닉화 private 상수 final
	private final String[] PATTERN = {"spade", "heart", "diamond", "clober"};
	
	public CardDeck() {
		int idx = 0;
		for(int j=0; j<=PATTERN.length; j++) {
			for(int i=1; i<=13; i++) {
				String symbol = "";
				if(i==1) {
					symbol = "A";
				} else if(i==11) {
					symbol = "J";
				} else if(i==12) {
					symbol = "Q";
				} else if(i==13) {
					symbol = "K";
				} else {
					symbol = Integer.toString(i);
				}
				CARD_ARR[idx] = new Card(PATTERN[j], symbol);
				System.out.println(CARD_ARR[idx]);
				idx++;
			}
			System.out.println();
		}
	}
	
}