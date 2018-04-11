/**
 * @author johnny
 * 单例模式饿汉式
 */
public class Hero {
    private int hp;
    private String name;
    private static Hero instance = new Hero();

    private Hero() {

    }

    private Hero(int hp, String name) {
        this.hp = hp;
        this.name = name;
    }

    public static Hero getInstance() {
        return instance;
    }
}
