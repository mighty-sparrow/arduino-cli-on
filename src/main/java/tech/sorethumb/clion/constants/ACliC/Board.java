package tech.sorethumb.clion.constants.ACliC;


public class Board {
    private static String BOARD = "board";
    
    /**
     * Returns a string representation of the object. In general, the
     * {@code toString} method returns a string that
     * "textually represents" this object. The result should
     * be a concise but informative representation that is easy for a
     * person to read.
     * It is recommended that all subclasses override this method.
     * <p>
     * The {@code toString} method for class {@code Object}
     * returns a string consisting of the name of the class of which the
     * object is an instance, the at-sign character `{@code @}', and
     * the unsigned hexadecimal representation of the hash code of the
     * object. In other words, this method returns a string equal to the
     * value of:
     * <blockquote>
     * <pre>
     * getClass().getName() + '@' + Integer.toHexString(hashCode())
     * </pre></blockquote>
     *
     * @return a string representation of the object.
     */
    @Override
    public String toString () {
        return BOARD;
    }
    
    public static String asString () {
        return BOARD;
    }
    
    /**
     * Attaches a sketch to a board
     */
    public static final String ATTACH = "attach";
    /**
     * Attaches a sketch to a board
     */
    public static final String DETAILS = "details";
    /**
     * List connected boards
     */
    public static final String LIST = "list";
    /**
     * List all known boards and their corresponding FQBN
     */
    public static final String LISTALL = "listall";
}