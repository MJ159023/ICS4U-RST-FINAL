/*
 * The "Hello Word!" program, just proves you can print to terminal.
 *
 * @author  Mr Coxall
 * @version 1.0
 * @since   2026-01-07
 */

/**
 * This is the standard "Hello, World!" program.
 */
public final class Main {

    /**
     * Prevent instantiation.
     * Throw an exception IllegalStateException.
     * if this is ever called
     *
     * @throws IllegalStateException if this is ever called
     *
     */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * runs main.
     *
     * @param args
     */
    public static void main(final String[] args) {

        int codePoint = 0x1F0A1 + 1;
        String card = new String(Character.toChars(codePoint));
        System.out.println(card);


    }
}
