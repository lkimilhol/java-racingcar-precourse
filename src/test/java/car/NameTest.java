package car;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import common.ErrorEnum;

class NameTest {
	@Test
	@DisplayName("이름이 빈 문자열인 경우")
	void checkEmptyString() {
		//given
		String name = " ";
		//when
		IllegalArgumentException message = assertThrows(IllegalArgumentException.class, () -> new Name(name));
		//then
		assertEquals(ErrorEnum.ERROR_EMPTY_NAME.getMessage(), message.getMessage());
	}

	@Test
	@DisplayName("이름이 너무 긴 경우")
	void checkNameLength() {
	    //given
		String name = "test123456";
	    //when
		IllegalArgumentException message = assertThrows(IllegalArgumentException.class, () -> new Name(name));
		//then
		assertEquals(ErrorEnum.ERROR_NAME_LENGTH.getMessage(), message.getMessage());
	}

	@Test
	@DisplayName("이름 정상 생성")
	void method() {
	    //given
		String nameValue = "test1";
	    //when
		Name name = new Name(nameValue);
	    //then
		assertEquals(nameValue, name.getValue());
	}
}