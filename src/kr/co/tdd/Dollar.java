package kr.co.tdd;

public class Dollar {
	// amount 변수를 사용하는 코드는 Dolla 자신뿐이 없음.
	// private로 변경 가능.
	private int amount;
	Dollar(int amount) {
		this.amount = amount;
	}
	public Dollar times(int multiplier) {
		return new Dollar(amount * multiplier);
	}
	public boolean equals(Object object) {
		Dollar dollar = (Dollar) object;
		return amount == dollar.amount;
	}
}
