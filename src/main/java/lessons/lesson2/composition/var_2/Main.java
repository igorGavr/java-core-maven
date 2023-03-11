package lessons.lesson2.composition.var_2;

public class Main {
    public static void main(String[] args) {
//  композиція
        Passport passport = new Passport("adfadf", "dsafds");
        User user = new User(1, "vas", passport);
        Customer customer = new Customer("adsfa", "daf", passport);

        //  агрегація
        User user1 = new User(1, "sana", "asdfa3", "12121");


    }
}
