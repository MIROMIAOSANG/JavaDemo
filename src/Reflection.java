/**
 * @date 20190402
 * @author johnny
 *
 * reflection demo
 */
public class Reflection {
    public static void main(String[] args) {
        String name="johnny";
        System.out.println(name.getClass().getName());

        String id="123";
        System.out.println(id.getClass()==name.getClass());
    }
}
