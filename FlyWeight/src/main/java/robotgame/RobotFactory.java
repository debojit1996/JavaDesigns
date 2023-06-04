package robotgame;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class RobotFactory {

    public static Map<String, IRobot> robotTypeToIRobotMap = new HashMap<>();

    public static Optional<IRobot> createRobot(String type) {
        if (robotTypeToIRobotMap.containsKey(type)) {
            return Optional.of(robotTypeToIRobotMap.get(type));
        } else {
            if (Objects.equals(type, "HUMANOID")) {
                Sprites sprites = new Sprites();
                IRobot humanoidRobot = new HumanoidRobot(type, sprites);
                robotTypeToIRobotMap.put(type, humanoidRobot);
                return Optional.of(humanoidRobot);
            } else if (Objects.equals(type, "ROBOTIC_DOG")) {
                Sprites sprites = new Sprites();
                IRobot dogRobot = new DogRobot(type, sprites);
                robotTypeToIRobotMap.put(type, dogRobot);
                return Optional.of(dogRobot);
            }
        }
        return Optional.empty();
    }
}
