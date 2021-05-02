package common;

public enum MessageEnum {
	START_GAME("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)"),
	PROGRESS_COUNT("시도할 회수는 몇회인가요?"),
	WINNER("가 최종 우승했습니다.");

	MessageEnum(String message) {
		this.message = message;
	}

	String message;

	public String getMessage() {
		return message;
	}
}