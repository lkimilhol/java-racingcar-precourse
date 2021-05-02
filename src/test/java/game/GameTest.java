package game;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

import User.User;
import common.Const;

class GameTest {
	User user;

	@BeforeEach
	void beforeEach() {
		user = new User();
		user.setInput("test");
	}

	@RepeatedTest(100)
	@DisplayName("최소 최대 값으로 랜덤 값 생성")
	void generateRand() {
		//given
		Game game = new Game(user.createCars(), 1);
		//when
		int randValue = game.generateRandNumber();
		//then
		assertTrue(0 < randValue);
		assertFalse(Const.RAND_MAX_VALUE < randValue);
	}
}