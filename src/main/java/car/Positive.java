package car;

import common.ErrorEnum;

public class Positive {
	private int value;

	public Positive(int value) {
		checkMinValue(value);
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	private void checkMinValue(int position) {
		if (position < 0) {
			throw new IllegalArgumentException(ErrorEnum.ERROR_INVALID_POSITION.getMessage());
		}
	}

	public void increasePosition() {
		value++;
	}
}
