package wordprocessor;

public class Driver {
    public static void main(String[] args) {
        ILetter firstLetter = LetterFactory.createCharacterObj('T');
        firstLetter.displayLetter(0, 0);
        ILetter secondLetter = LetterFactory.createCharacterObj('h');
        secondLetter.displayLetter(0, 1);
        ILetter thirdLetter = LetterFactory.createCharacterObj('e');
        thirdLetter.displayLetter(0, 2);
    }
}
