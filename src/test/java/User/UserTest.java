package User;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import car.Cars;

class UserTest {
	@Test
	@DisplayName("입력 된 문자열로 구분자로 구분이 잘 되는지 테스트")
	void method() {
	    //given
		User user = new User();
		user.setInput("123,456,789");
	    //when
		Cars cars = user.createCars();
		//then
		assertEquals(3, cars.getCarsSize());
	}
}