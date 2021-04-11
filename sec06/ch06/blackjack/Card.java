package sec06.ch06.blackjack;

public class Card { // �޼ҵ� // ����ȭ = private
	
	private String pattern;
	private String symbol;
	
	public Card(String pattern, String symbol) { // ������
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
