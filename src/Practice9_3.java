/**
 * 第九章练习3
 */
public class Practice9_3 {
    public static void main(String[] args) {
        g instance = new g();
        instance.print();
    }
}

abstract class f {
    public f() {
        print();
    }

    abstract void print();
}

class g extends f {
    private int value = 9;

    @Override
    void print() {
        System.out.println(value);
    }
}
