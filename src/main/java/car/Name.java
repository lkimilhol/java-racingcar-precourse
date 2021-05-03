package car;

import common.ErrorEnum;

public class Name {
	private static final int MAX_LENGTH = 5;
	private final String value;

	public Name(String value) {
		checkEmptyString(value);
		checkNameLength(value);
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	private void checkEmptyString(String name) {
		if (name.trim().equals("")) {
			throw new IllegalArgumentException(ErrorEnum.ERROR_EMPTY_NAME.getMessage());
		}
	}

	private void checkNameLength(String name) {
		if (name.length() > MAX_LENGTH) {
			throw new IllegalArgumentException(ErrorEnum.ERROR_NAME_LENGTH.getMessage());
		}
	}
}