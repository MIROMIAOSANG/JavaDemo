/**
 * @author johnny
 * 涉及基本类型的重载，实际参数比形式参数大的情况
 * 参数顺序不同也是重载的验证
 */
public class ValueCast {
    public ValueCast(int number) {
        System.out.println("int型");
    }

    public ValueCast(float number) {
        System.out.println("float型");
    }

    public ValueCast(int number1,double number2) {
        System.out.println("嘤嘤嘤");
    }

    public ValueCast(double number1,int number2) {
        System.out.println("嘤嘤嘤NM");
    }

    public static void main(String[] args) {
        double number1=1;
        //这里必须进行强制类型转换，向下转型
        ValueCast simpleTest1=new ValueCast((int) number1);
        ValueCast simpleTest2=new ValueCast((float) number1);
        //两个参数顺序相反
        int number2=2;
        double number3=2;
        ValueCast simpleTest3=new ValueCast(number2, number3);
        ValueCast simpleTest4=new ValueCast(number3, number2);
    }
}
