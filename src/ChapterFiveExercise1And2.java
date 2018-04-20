/**
 * @author johnny
 * p77 练习1,2
 */
public class ChapterFiveExercise1And2 {
    private String test="nima";
    private String test2;

    public ChapterFiveExercise1And2(String test) {
        this.test = test;
    }

    public static void main(String[] args) {
        ChapterFiveExercise1And2 chapterFiveExercise1And2 =new ChapterFiveExercise1And2("yingyingying");
        System.out.println(chapterFiveExercise1And2.test);
        System.out.println(chapterFiveExercise1And2.test2==null);
    }
}
