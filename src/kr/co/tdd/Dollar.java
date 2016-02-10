package kr.co.tdd;

public class Dollar extends Money{
	Dollar(int amount, String currency) {
		super(amount, currency);
	}
	public Dollar times(int multiplier) {
		return Money.dollar(amount * multiplier);
	}
}
