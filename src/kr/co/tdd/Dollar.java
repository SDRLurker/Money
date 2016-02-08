package kr.co.tdd;

public class Dollar {
	int amount;
	Dollar(int amount) {
		this.amount = amount;
	}
	public Dollar times(int multiplier) {
		return new Dollar(amount * multiplier);
	}
	public boolean equals(Object object) {
		// 가짜로 구현하는 방법 - true를 리턴.
		// return true;
		// 동치성을 일반화
		Dollar dollar = (Dollar) object;
		return amount == dollar.amount;
	}
}
