package sec06.ch06.blackjack;

public class Card { // 메소드 // 은닉화 = private
	
	private String pattern;
	private String symbol;
	
	public Card(String pattern, String symbol) { // 생성자
		this.pattern = pattern;
		this.symbol = symbol;
	}
	
	public String getPattern() {
		return pattern;
	}
	
	public String getSymbol() {
		return symbol;
	}
	
	@Override
	public String toString() {
		return String.format("%s, %s", pattern, symbol);
	}
	
}
