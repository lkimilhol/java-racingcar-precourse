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

	public void printInitCars() {
		for (Car car : cars) {
			car.printCarStatus();
		}
	}
	
	public String getWinnerCars(int winnerPosition) {
		StringBuilder stringBuilder = new StringBuilder();
		for (Car car : cars) {
			stringBuilder.append(car.getWinner(winnerPosition));
		}
		return stringBuilder.substring(1);
	}
}