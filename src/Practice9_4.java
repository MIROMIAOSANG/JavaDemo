/**
 * 第九章练习4
 */
public class Practice9_4 {
    public static void testPrint(Dad d) {
        ((Son) d).print();
    }

    public static void secondTestPrint(SecondDad sd) {
        sd.print();
    }

    public static void main(String[] args) {
        Son s = new Son();
        Practice9_4.testPrint(s);
        SecondSon ss = new SecondSon();
        Practice9_4.secondTestPrint(ss);
    }
}

abstract class Dad {
}

class Son extends Dad {
    protected void print() {
        System.out.println("Son");
    }
}

abstract class SecondDad {
    abstract protected void print();
}

class SecondSon extends SecondDad {
    @Override
    protected void print() {
        System.out.println("SecondSon");
    }
}
