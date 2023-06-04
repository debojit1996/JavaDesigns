package robotgame;

// This will be Flyweight object class, which will be immutable (no setter and all it's members will be private)
// This class will contain only common member variables which will shared across all the Humanoid robots
public class HumanoidRobot implements IRobot {

    private String type;
    private Sprites sprites; // 2d bitmap object representing a humanoid robot

    public HumanoidRobot(String type, Sprites sprites) {
        this.type = type;
        this.sprites = sprites;
    }

    // no setters, only getters
    public String getType() {
        return type;
    }

    public Sprites getSprites() {
        return sprites;
    }

    @Override
    public void display(int xCoordinate, int yCoordinate) {
        // logic to print humanoid robot which will be placed at a given (x, y) co-ordinate
        System.out.println("Displaying human robot *****");
        System.out.println(this.type.concat(" ").concat(xCoordinate + " ").concat(String.valueOf(yCoordinate)));
    }
}
