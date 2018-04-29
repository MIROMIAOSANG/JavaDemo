import java.util.Random;

/**
 * @author johnny
 * 第八章练习3
 */
public class Practice8_3 {
    private static RandomShapeGenerator generator = new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] s = new Shape[9];
        for (int i = 0; i < s.length; i++) {
            s[i] = generator.next();
        }

        for (Shape shape : s) {
            shape.printMessage();
        }
    }
}

class Shape {
    public void draw() {
    }

    public void erase() {
    }

    public void printMessage() {
        System.out.println("嘤嘤嘤");
    }
}

class Circle extends Shape {
    @Override
    public void printMessage() {
        System.out.println("圆圆圆");
    }

    @Override
    public void draw() {
        System.out.println("Circle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Circle.erase()");
    }
}

class Square extends Shape {
    @Override
    public void printMessage() {
        System.out.println("方方方");
    }

    @Override
    public void draw() {
        System.out.println("Square.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Square.erase()");
    }
}

class Triangle extends Shape {
    @Override
    public void printMessage() {
        System.out.println("三三三");
    }

    @Override
    public void draw() {
        System.out.println("Triangle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Triangle.erase()");
    }
}

class RandomShapeGenerator {
    private Random rand = new Random(47);

    public Shape next() {
        switch (rand.nextInt(3)) {
            default:
            case 0:
                return new Circle();
            case 1:
                return new Square();
            case 2:
                return new Triangle();
        }
    }
}
