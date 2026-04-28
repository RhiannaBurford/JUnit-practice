public class UserAccount {
    
    /**
     * Checks if a user is of legal age.
     * @param age the age of the user
     * @return true if age is 18 or older, false otherwise
     */
    public boolean isOver18(int age) {
        return age >= 18;
    }
}