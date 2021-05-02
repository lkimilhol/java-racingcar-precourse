package car;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import common.ErrorEnum;

class PositiveTest {
	@Test
	@DisplayName("위치 값이 음수인 경우 에러")
	void createInvalidPosition() {
	    //given
		int position = -1;
	    //when
		IllegalArgumentException message = assertThrows(IllegalArgumentException.class, () -> new Positive(position));
	    //then
		assertEquals(ErrorEnum.ERROR_INVALID_POSITION.getMessage(), message.getMessage());
	}

	@Test
	@DisplayName("위치 값 정상 생성")
	void createValidPosition() {
	    //given
		int position = 0;
	    //when
		Positive positive = new Positive(position);
	    //then
		assertEquals(position, positive.getPosition());
	}
}