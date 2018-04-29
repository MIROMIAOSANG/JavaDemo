/**
 * @author johnny
 * 第五章练习19
 */
public class Practice5_19 {
    private String[] element=null;

    public void initailizeArray(String ...s){
        element=new String[s.length];
        for(int i=0;i<s.length;i++){
            element[i]=s[i];
        }
    }

    public void printArray(){
        for (String s:element){
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        Practice5_19 testCode=new Practice5_19();
        testCode.initailizeArray("li","ding","kai");
        testCode.printArray();
        System.out.println();
        Practice5_19 testCode2=new Practice5_19();
        String[] test={"?","???"};
        testCode2.initailizeArray(test);
        testCode2.printArray();
    }
}
