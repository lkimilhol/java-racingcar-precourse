package car;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import common.Const;

class CarTest {
	@Test
	@DisplayName("전진 시 위치가 증가 되는지 확인")
	void goForward() {
	    //given
		Car car = new Car(new Name("test"), new Positive(Const.INIT_POSITION));
	    //when
		car.goForward(Const.FORWARD_MIN_VALUE);
		Positive position = car.getPosition();
	    //then
		assertEquals(2, position.getValue());
	}
}