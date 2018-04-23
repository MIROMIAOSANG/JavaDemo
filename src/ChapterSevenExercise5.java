/**
 * @author johnny
 * 第七章练习5
 *
 */
public class ChapterSevenExercise5 {
    public static void main(String[] args) {
        C c=new C();
    }
}

class A{
    public A() {
        System.out.println("A()");
    }
}

class B{
    public B() {
        System.out.println("B()");
    }
}

class C extends A{
    private B b=new B();
}
