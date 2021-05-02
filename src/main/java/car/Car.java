package car;

import common.Const;

public class Car {
	private Name name;
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
}
