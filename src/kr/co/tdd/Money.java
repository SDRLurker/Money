package kr.co.tdd;

public class Money {
	protected int amount;
	public boolean equals(Object object) {
		Money money = (Money) object;
		/* 금액과 클래스가 서로 동일할 때만 두 Money가 서로 같은 것 */
		return amount == money.amount
			&& getClass().equals(money.getClass());
	}
}
