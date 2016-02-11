package kr.co.tdd;

public class Money {
	protected int amount;
	protected String currency;
	Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}
	public boolean equals(Object object) {
		Money money = (Money) object;
		return amount == money.amount
			&& currency().equals(money.currency());
	}
	public static Dollar dollar(int amount) {
		return new Dollar(amount, "USD");
	}
	public static Franc franc(int amount) {
		return new Franc(amount, "CHF");
	}
	public Money times(int multiplier) {
		return new Money(amount * multiplier, currency);
	}
	public String currency() {
		return currency;
	}
	public String toString() {
		return amount + " " + currency;
	}
}
