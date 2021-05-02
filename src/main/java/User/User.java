package User;

import java.util.Scanner;

import car.Car;
import car.Cars;
import car.Name;
import car.Positive;
import common.Const;

public class User {
	private final Scanner scanner;
	private String input;

	public User() {
		scanner = new Scanner(System.in);
	}

	// 유저에게 입력을 받는 메서드. 테스트케이스를 용이하게 하기 위하여 메서드를 분리
	public void inputCommand() {
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
}
