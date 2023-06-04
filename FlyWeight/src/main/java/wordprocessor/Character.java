package wordprocessor;

// Flyweight class
public class Character implements ILetter {
    // these member variables will be common for all the characters in the document
    private char character; // this won't be a common variable but we will be creating the map per character to save space
    private String fontType;
    private int size;

    public Character(char character, String fontType, int size) {
        this.character = character;
        this.fontType = fontType;
        this.size = size;
    }

    @Override
    public void displayLetter(int xCoordinate, int yCoordinate) {
        // logic to print humanoid robot which will be placed at a given (x, y) co-ordinate
        System.out.println("***** Displaying a given character *****");
        System.out.println(this.character + " " + this.fontType.concat(" ").concat(this.size + " ")
                .concat(xCoordinate + " ").concat(String.valueOf(yCoordinate)));
    }
}
