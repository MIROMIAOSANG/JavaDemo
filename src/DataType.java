import java.util.Scanner;

/**
 * @date 20180403
 * this is a demo about fundamental data type
 */
public class DataType {

    public static void main(String[] args) {
        //长整型
        long lg=400000000000000000L;
        System.out.println(lg);
        System.out.println();

        //非十进制
        int hex=0x14;
        System.out.println(hex);
        int binary=0b1001;
        System.out.println(binary);
        int oct=010;
        System.out.println(oct);
        System.out.println();

        int i = 1;
        boolean bii = !(i++ == 3) ^ (i++ ==2) && (i++==3);
        System.out.println(bii);
        System.out.println(i);
        System.out.println();

        System.out.println((int)987/100);
        System.out.println((int)987/10);
        System.out.println((int)987%100);
        System.out.println((int)987%10);
        System.out.println((int)987%1000);
        System.out.println((int)987/1000);

    }
}
