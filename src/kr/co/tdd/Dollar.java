package kr.co.tdd;

public class Dollar {
	int amount;
	Dollar(int amount) {
		this.amount = amount;
	}
	// 컴파일 오류를 고치기 위해 함수 리턴타입 수정.
	public Dollar times(int multiplier) {
		// amount *= multiplier;
		// return null;
		// 올바른 금액을 갖는 새 Dollar 반환.
		return new Dollar(amount * multiplier);
	}
}
