package game;

import java.util.Random;

import car.Car;
import car.Cars;
import common.Const;

public class Game {
	private final Cars cars;
	private final int count;

	public Game(Cars cars, int count) {
		this.cars = cars;
		this.count = count;
	}

	public Cars getCars() {
		return cars;
	}

	public void startGame() {
		for (int i = 0; i < count; i++) {
			progress();
		}
	}

	private void progress() {
		for (int i = 0; i < cars.getCarsSize(); i++) {
			Car car = cars.getCar(i);
			car.goForward(generateRandNumber());
		}
	}

	public int generateRandNumber() {
		Random random = new Random();
		return random.nextInt(Const.RAND_MAX_VALUE) + 1;
	}
}
