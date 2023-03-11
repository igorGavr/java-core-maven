package lessons.lesson2.enums;

public enum Gender {
    Male("femka"), Female("mascul"), Child;
    private String token;
    Gender() {
    }
    Gender(String token) {
        this.token = token;
    }
    public String getToken() {
        return token;
    }
}
