package lessons.lesson2.enums;

public class Helper {
    public String extractToken(User user) {
        Gender gender = user.getGender();
        return gender.getToken();
    }

}
