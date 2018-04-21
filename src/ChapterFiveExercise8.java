public class ChapterFiveExercise8 {
    public ChapterFiveExercise8() {
    }

    public void talk() {
        System.out.println("nima");
        sing();
        this.sing();
    }

    public void sing() {
        System.out.println("changge");
    }

    public static void main(String[] args) {
        ChapterFiveExercise8 chapterFiveExercise8 = new ChapterFiveExercise8();
        chapterFiveExercise8.talk();
    }
}
