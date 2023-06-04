package robotgame;

import java.util.Optional;

public class Driver {

    public static void main(String[] args) {
        Optional<IRobot> firstRobot = RobotFactory.createRobot("HUMANOID");
        firstRobot.ifPresent(iRobot -> iRobot.display(0, 0));
        Optional<IRobot> secondRobot = RobotFactory.createRobot("HUMANOID");
        secondRobot.ifPresent(hRobot -> hRobot.display(1, 1));

        Optional<IRobot> firstDogRobo = RobotFactory.createRobot("ROBOTIC_DOG");
        firstDogRobo.ifPresent(dogRobo -> dogRobo.display(2, 2));
        Optional<IRobot> secondDogRobo = RobotFactory.createRobot("ROBOTIC_DOG");
        secondDogRobo.ifPresent(dogRobo -> dogRobo.display(3, 3));

    }
}
