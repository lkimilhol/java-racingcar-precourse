package User;

import java.util.Scanner;

import car.Car;
import car.Cars;
import car.Name;
import car.Positive;
import common.Const;
import common.MessageEnum;

public class User {
	private final Scanner scanner;
	private String input;

	public User() {
		scanner = new Scanner(System.in);
	}

	public void inputCarName() {
		printMessage(MessageEnum.START_GAME.getMessage());
		inputCommand();
	}

	public void inputProgressCount() {
		printMessage(MessageEnum.PROGRESS_COUNT.getMessage());
		inputCommand();
	}

	// 유저에게 입력을 받는 메서드. 테스트케이스를 용이하게 하기 위하여 메서드를 분리
	private void inputCommand() {
		this.input = scanner.nextLine();
	}

	public void setInput(String input) {
		this.input = input;
	}

	public Cars createCars() {
		String[] carNames = input.split(Const.CAR_NAME_DELIMITER);
		Cars cars = new Cars();
		for (String carName : carNames) {
			Name name = new Name(carName);
			Positive positive = new Positive(Const.INIT_POSITION);
			Car car =  new Car(name, positive);
			cars.addCar(car);
		}
		return cars;
	}

	public int getProgressCount() {
		return Integer.parseInt(this.input);
	}

	private void printMessage(String message) {
		System.out.println(message);
	}
}