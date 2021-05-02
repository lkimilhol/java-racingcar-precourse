package common;

public enum ErrorEnum {
	ERROR_EMPTY_NAME("이름이 비어 있습니다"),
	ERROR_NAME_LENGTH("이름이 너무 깁니다");

	String message;

	ErrorEnum(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
