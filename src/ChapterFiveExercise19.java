/**
 * @author johnny
 * 第五章练习19
 */
public class ChapterFiveExercise19{
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
        ChapterFiveExercise19 testCode=new ChapterFiveExercise19();
        testCode.initailizeArray("li","ding","kai");
        testCode.printArray();
        System.out.println();
        ChapterFiveExercise19 testCode2=new ChapterFiveExercise19();
        String[] test={"?","???"};
        testCode2.initailizeArray(test);
        testCode2.printArray();
    }
}
