package car;

import common.ErrorEnum;

public class Positive {
	private int position;

	Positive(int position) {
		checkMinValue(position);
		this.position = position;
	}

	public int getPosition() {
		return position;
	}

	private void checkMinValue(int position) {
		if (position < 0) {
			throw new IllegalArgumentException(ErrorEnum.ERROR_INVALID_POSITION.getMessage());
		}
	}
}
