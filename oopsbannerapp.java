public class oopsbannerapp {

    // Method to generate letter O
    static String[] letterO() {
        return new String[]{
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };
    }

    // Method to generate letter P
    static String[] letterP() {
        return new String[]{
            " ***** ",
            "*     *",
            " ***** ",
            "*      ",
            "*      "
        };
    }

    // Method to generate letter S
    static String[] letterS() {
        return new String[]{
            " ***** ",
            "*      ",
            " ***** ",
            "      *",
            " ***** "
        };
    }

    public static void main(String[] args) {

        String[] O1 = letterO();
        String[] O2 = letterO();
        String[] P  = letterP();
        String[] S  = letterS();

        // Build and print banner
        for (int i = 0; i < O1.length; i++) {
            System.out.println(
                O1[i] + "  " +
                O2[i] + "  " +
                P[i]  + "  " +
                S[i]
            );
        }
    }
}