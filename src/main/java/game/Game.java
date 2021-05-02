package game;

import java.util.Random;

import car.Car;
import car.Cars;
import common.Const;
import common.MessageEnum;

public class Game {
	private final Cars cars;
	private final int count;
	private int winnerPosition;

	public Game(Cars cars, int count) {
		this.cars = cars;
		this.count = count;
		this.winnerPosition = 0;
	}

	public void startGame() {
		cars.printInitCars();
		printNewLine();
		for (int i = 1; i < count; i++) {
			progress();
		}
		printWinner(cars.getWinnerCars(winnerPosition));
	}

	private void progress() {
		for (int i = 0; i < cars.getCarsSize(); i++) {
			Car car = cars.getCar(i);
			car.goForward(generateRandNumber());
			car.printCarStatus();
			updateTopPosition(car.getPosition().getValue());
		}
		printNewLine();
	}

	public int generateRandNumber() {
		Random random = new Random();
		return random.nextInt(Const.RAND_MAX_RANGE_VALUE);
	}

	private void printNewLine() {
		System.out.println();
	}

	private void printWinner(String winnerCars) {
		System.out.println(winnerCars + MessageEnum.WINNER.getMessage());
	}

	private void updateTopPosition(int position) {
		if (winnerPosition < position) {
			winnerPosition = position;
		}
	}
}