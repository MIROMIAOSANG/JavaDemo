/**
 * @author johnny
 * 单例模式懒汉式
 */
public class HeroS {
    private String name;
    private int hp;
    private static HeroS instance=null;

    private HeroS(){

    }

    private HeroS(String name ,int hp){
        this.hp=hp;
        this.name=name;
    }

    public static HeroS getInstance(){
        if(instance==null){
            instance=new HeroS();
        }
        return instance;
    }
}
