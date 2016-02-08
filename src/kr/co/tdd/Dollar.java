package kr.co.tdd;

public class Dollar {
	// int amount = 10;	// 최소 성공하기 위한 작업.
	// int amount = 5 * 2;	// 첫 번째 수정.
	int amount;
	Dollar(int amount) {
		this.amount = amount;	// 세 번째 수정.
	}
	public void times(int multiplier) {
		//amount = 5 * 2;		// 두 번째 수정.
		//amount = amount * 2;	// 네 번째 수정.
		//amount = amount * multiplier;	// 다섯 번째 수정.
		amount *= multiplier;	// 여섯 번째 수정. 중복 제거.
	}
}
