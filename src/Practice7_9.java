/**
 * @author johnny
 * 第七章练习9
 */
public class Practice7_9 {

}

class Root {
    Component1 component1;
    Component2 component2;
    Component3 component3;

    public Root() {
        System.out.println("Root()");
    }

    public Root(float f) {
        component1 = new Component1((byte) 0);
        component2 = new Component2((short) 0);
        component3 = new Component3((int) 0);
        System.out.println("Root(float)");
    }
}

class Component1 {
    public Component1() {
        System.out.println("Component1()");
    }

    public Component1(byte b) {
        System.out.println("Component1(byte)");
    }
}

class Component2 {
    public Component2() {
        System.out.println("Component2()");
    }

    public Component2(short s) {
        System.out.println("Component2(short)");
    }
}

class Component3 {
    public Component3() {
        System.out.println("Component3()");

    }

    public Component3(int i) {
        System.out.println("Component3(int)");
    }
}

class Stem extends Root {
    Component1 componentS1;
    Component2 componentS2;
    Component3 componentS3;

    public Stem() {
        System.out.println("Stem()");
    }

    public Stem(double d) {
        super(2.78f);
        componentS1 = new Component1((byte) 1);
        componentS2 = new Component2((short) 1);
        componentS3 = new Component3((int) 1);
        System.out.println("Steam(double)");
    }

    public static void main(String[] args) {
        Stem stem = new Stem(2.78);
    }
}
