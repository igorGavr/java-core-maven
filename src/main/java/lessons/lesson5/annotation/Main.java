package lessons.lesson5.annotation;

import java.lang.reflect.Field;
public class Main {
    public static void main(String[] args) {
        User user = new User(1, "kokos");
//
//        Class<? extends User> uzer = user.getClass();
//
//        Field[] declaredFields = uzer.getDeclaredFields();
//        for (Field field : declaredFields) {
//            System.out.println(field.getModifiers() + " " + field.getType() + " " + field.getName());
//        }

        try {
            foobar(user);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static void foobar(User user) throws Exception {
        Class<? extends User> aClass = user.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Validator.class)) {
                field.setAccessible(true);
                int id = (int) field.get(user);
                if (id < 0) {
                    Validator annotation = field.getAnnotation(Validator.class);
                    String msg = annotation.msg();
                    throw new Exception(msg);
                }

            }
        }


    }
}
