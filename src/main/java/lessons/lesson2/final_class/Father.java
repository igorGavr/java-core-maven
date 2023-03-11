package lessons.lesson2.final_class;

public /*final*/ class Father {
    final int age = 31;


    //  дозволяє неможливість перевизначення метода
    public final void foobar(final int x) {
        //  дозволяє неможливість перевизначення поля x
//        x = 12;  // error
        //  дозволяє неможливість перевизначення поля age
//        this.age = 33;  // error
    }
}
