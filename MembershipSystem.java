public class MembershipSystem {
    public String getTier(int points) {
        if (points >= 100) {
            return "Gold";
        } else {
            return "Silver";
        }
    }
}