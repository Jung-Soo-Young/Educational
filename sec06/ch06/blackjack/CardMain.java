package sec06.ch06.blackjack;

public class CardMain {

	public static void main(String[] args) {
		Card c1 = new Card("Spade", "K");
		System.out.println(c1); // Spade(K);
		
		Card c2 = new Card("Heart", "2");
		System.out.println(c2); // Heart(2);
		
		Card c3 = new Card("Clober", "J");
		System.out.println(c3); // Clover(J);
		System.out.println();
		
		new CardDeck(); // 메인에서 카드 덱 호출
		
	}
	
	public static void println(String str) {
		System.out.println(str);
	}
	
	public static void println(Object obj) {
		System.out.println("obj!!");
		String str = obj.toString();
		println(str);
	}

}
