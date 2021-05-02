package car;

import common.ErrorEnum;

public class Name {
	private static final int MAX_LENGTH = 5;
	private final String name;

	public Name(String name) {
		checkEmptyString(name);
		checkNameLength(name);
		this.name = name;
	}

	public String getName() {
		return name;
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
