public class UserValidator {
    public String checkUsername(String name) {
        if (name.length() < 3) {
            return "Too Short";
        }
        return "Valid";
    }
}