public class ProfileManager {
    public String getProfile(int id) {
        if (id == 99) {
            return "Admin";
        }
        return null;
    }
}