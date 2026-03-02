public class oopsbannerapp {
    public static void main(String[] args) {

        // Declare and initialize banner lines using String.join()
        String[] bannerLines = {
            String.join("", " *****  ", " *****  ", " *****   ", " ***** "),
            String.join("", "*     * ", "*     * ", "*     *  ", "*      "),
            String.join("", "*     * ", "*     * ", " *****   ", " ***** "),
            String.join("", "*     * ", "*     * ", " *       ", "     * "),
            String.join("", " *****  ", " *****  ", " *       ", " ***** ")
        };

        // Print banner using a loop
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}