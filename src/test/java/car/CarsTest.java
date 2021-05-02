package car;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import common.Const;

class CarsTest {
	Cars cars;

	@BeforeEach
	void beforeEach() {
		cars = new Cars();
	}

	@Test
	@DisplayName("자동차리스트에 추가")
	void createCars() {
	    //given
		Car car = new Car(new Name("test"), new Positive(Const.INIT_POSITION));
	    //when
		cars.addCar(car);
	    //then
		assertEquals(car, cars.getCar(0));
	}

	@Test
	@DisplayName("자동차리스트 사이즈")
	void method() {
	    //given
		Car car = new Car(new Name("test"), new Positive(Const.INIT_POSITION));
		//when
		cars.addCar(car);
		//then
		assertEquals(1, cars.getCarsSize());
	}
}