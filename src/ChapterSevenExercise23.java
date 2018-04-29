class AA {
    static int j = printInit("AA.j initialized");
    static int printInit(String s) {
        System.out.println(s);
        return 1;
    }
    AA() { System.out.println("AA() constructor"); }
}

class BB extends AA {
    static int k = printInit("BB.k initialized");
    BB() { System.out.println("BB() constructor"); }
}

class CC {
    static int n = printInitC("CC.n initialized");
    static AA a = new AA();
    CC() { System.out.println("CC() constructor"); }
    static int printInitC(String s) {
        System.out.println(s);
        return 1;
    }
}

class DD {
    DD() { System.out.println("DD() constructor"); }
}

/**
 * @author johnny
 */
public class ChapterSevenExercise23 extends BB {
    static int i = printInit("ChapterSevenExercise23.i initialized");
    ChapterSevenExercise23() { System.out.println("ChapterSevenExercise23() constructor"); }
    public static void main(String[] args) {
        // accessing static main causes loading (and initialization)
        // of A, B, & ChapterSevenExercise23
        System.out.println("hi");
        // call constructors from loaded classes:
        ChapterSevenExercise23 lc=new ChapterSevenExercise23();
        // call to static field loads & initializes C:
        System.out.println(CC.a);
        // call to constructor loads DD:
        DD d = new DD();
    }
}
