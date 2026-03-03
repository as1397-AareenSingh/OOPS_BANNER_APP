import java.util.HashMap;
import java.util.Map;

class CharacterPattern {

    private char character;
    private String[] pattern;

    public CharacterPattern(char character, String[] pattern) {
        this.character = character;
        this.pattern = pattern;
    }

    public char getCharacter() {
        return character;
    }

    public String[] getPattern() {
        return pattern;
    }
}

public class oopsbannerapp {

    public static void main(String[] args) {

        // Store character patterns
        Map<Character, CharacterPattern> patternMap = new HashMap<>();

        patternMap.put('O', new CharacterPattern('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        }));

        patternMap.put('P', new CharacterPattern('P', new String[]{
                " ***** ",
                "*     *",
                " ***** ",
                "*      ",
                "*      "
        }));

        patternMap.put('S', new CharacterPattern('S', new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        }));

        String word = "OOPS";

        // Display banner
        for (int row = 0; row < 5; row++) {
            for (char ch : word.toCharArray()) {
                System.out.print(patternMap.get(ch).getPattern()[row] + "  ");
            }
            System.out.println();
        }
    }
}