public class oopsbannerapp {
    public static void main(String[] args) {

        // Store banner lines in a String array
        String[] bannerLines = {
            " *****    *****    *****     ***** ",
            "*     *  *     *  *     *   *      ",
            "*     *  *     *  *****     *****  ",
            "*     *  *     *  *              * ",
            " *****    *****   *         *****"
        };

        // Print banner using a loop
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}