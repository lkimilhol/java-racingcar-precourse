import User.User;
import car.Cars;
import game.Game;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.inputCarName();
        Cars cars = user.createCars();
        user.inputProgressCount();
        Game game = new Game(cars, user.getProgressCount());
        game.startGame();
    }
}