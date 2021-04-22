/**
 *
 * @author 6210612617@cn103
 */
public interface GoodPassword {

    /**
     * Validate password.
     *
     * A valid password must:
     *   - have at least 10 characters in length
     *   - have only combination of
     *     + decimal digits
     *     + upper cases
     *     + lower cases
     *   - have at least 2 decimal digits
     *   - have at least 1 upper case
     *   - have at least 1 lower case
     *   - the first character must be an upper case
     *
     * @param password
     * @return true if password is a good password (according to requirements above)
     */

    public abstract boolean isGoodPassword(String password);
       
}
