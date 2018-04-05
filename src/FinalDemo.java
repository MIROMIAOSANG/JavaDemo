public class FinalDemo {
    //final实例域必须在构造对象时初始化。
    public final int a;

    FinalDemo(int a) {
        this.a = a;
    }

    public static void main(String[] args) {
        final FinalDemo finalDemo2=new FinalDemo(6);
        FinalDemo finalDemo1 = new FinalDemo(5);
        //final实例域初始化后不能修改
//        finalDemo.a++;   Error
//        finalDemo2=finalDemo1;  Error
    }
}
