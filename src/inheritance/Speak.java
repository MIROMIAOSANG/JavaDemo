package inheritance;

public interface Speak {
    int AGE = 18;

    default void talk() {
        System.out.println("嘤嘤嘤");
    }
}
