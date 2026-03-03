import java.util.HashMap;
import java.util.Map;

class CharacterPattern {

    private String[] pattern;

    public CharacterPattern(String[] pattern) {
        this.pattern = pattern;
    }

    public String[] getPattern() {
        return pattern;
    }
}

class PatternRepository {

    private static final Map<Character, CharacterPattern> patternMap = new HashMap<>();

    // Static block initializes patterns once
    static {
        patternMap.put('O', new CharacterPattern(new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        }));

        patternMap.put('P', new CharacterPattern(new String[]{
                " ***** ",
                "*     *",
                " ***** ",
                "*      ",
                "*      "
        }));

        patternMap.put('S', new CharacterPattern(new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        }));
    }

    // Central lookup method
    public static CharacterPattern getPattern(char ch) {
        return patternMap.get(Character.toUpperCase(ch));
    }
}

public class oopsbannerapp {

    public static void main(String[] args) {

        String word = "OOPS";

        for (int row = 0; row < 5; row++) {
            for (char ch : word.toCharArray()) {
                String[] pattern = PatternRepository.getPattern(ch).getPattern();
                System.out.print(pattern[row] + "  ");
            }
            System.out.println();
        }
    }
}