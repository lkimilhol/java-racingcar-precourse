package car;

import common.Const;

public class Car {
	private final Name name;
	private final Positive position;

	public Car(Name name, Positive position) {
		this.name = name;
		this.position = position;
	}

	public void goForward(int randValue) {
		if (randValue >= Const.FORWARD_MIN_VALUE) {
			position.increasePosition();
		}
	}

	public Positive getPosition() {
		return position;
	}

	public void printCarStatus() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(name.getValue());
		stringBuilder.append(Const.PROGRESS_DELIMITER);
		for (int i = 0; i < position.getValue(); i++) {
			stringBuilder.append(Const.PROGRESS_BAR);
		}
		System.out.println(stringBuilder);
	}

	public String getWinner(int winnerPosition) {
		if (isWinner(winnerPosition)) {
			return Const.CAR_NAME_DELIMITER + name.getValue();
		}
		return "";
	}

	private boolean isWinner(int winnerPosition) {
		return position.getValue() == winnerPosition;
	}
}