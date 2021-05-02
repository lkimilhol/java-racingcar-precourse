package car;

import java.util.ArrayList;
import java.util.List;

public class Cars {
	private final List<Car> cars;

	public Cars() {
		cars = new ArrayList<>();
	}

	public int getCarsSize() {
		return cars.size();
	}

	public void addCar(Car car) {
		cars.add(car);
	}

	public Car getCar(int index) {
		return cars.get(index);
	}
}
