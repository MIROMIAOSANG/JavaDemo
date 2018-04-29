/**
 * @author johnny
 * p77 练习1,2
 */
public class Practice5_1 {
    private String test="nima";
    private String test2;

    public Practice5_1(String test) {
        this.test = test;
    }

    public static void main(String[] args) {
        Practice5_1 practice51 =new Practice5_1("yingyingying");
        System.out.println(practice51.test);
        System.out.println(practice51.test2==null);
    }
}
