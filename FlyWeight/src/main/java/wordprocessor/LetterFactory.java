package wordprocessor;

import java.util.HashMap;
import java.util.Map;

public class LetterFactory {

    private static Map<java.lang.Character, ILetter> letterToCharacterObjMap = new HashMap<>();

    public static ILetter createCharacterObj(char ch) {
        if (letterToCharacterObjMap.containsKey(ch)) {
            return letterToCharacterObjMap.get(ch);
        } else {
            ILetter characterObj = new Character(ch, "ARIAL", 10);
            letterToCharacterObjMap.put(ch, characterObj);
            return characterObj;
        }
    }
}
