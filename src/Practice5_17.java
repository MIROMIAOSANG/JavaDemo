/**
 * @author johnny
 * 第五章练习17
 */
public class Practice5_17 {
    public Practice5_17(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        Practice5_17[] array = new Practice5_17[2];
        array[0] = new Practice5_17("li");
        array[1] = new Practice5_17("dk");
    }
}
