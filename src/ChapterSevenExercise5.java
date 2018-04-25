/**
 * @author johnny
 * 第七章练习5
 * 先父后子，先静后动
 */
public class ChapterSevenExercise5 {
    public static void main(String[] args) {
        C c = new C();
    }
}

class A {
    public A() {
        System.out.println("A()");
    }

    public A(String s) {
        System.out.println("A(String)");
    }
}

class B {
    public B() {
        System.out.println("B()");
    }
}

class C extends A {
    public C() {
        super("1");
    }

    private B b = new B();
}
