/**
 * @author johnny
 * 第七章练习1 惰性初始化
 */
public class ChapterSevenExercise1 {
    public static void main(String[] args) {
        Speaker teacher=new Speaker();
        teacher.speak();
    }
}

class Mouse{
    public Mouse() {
        System.out.println("get a mouse ");
    }
}

class Speaker{
    private Mouse mouse;

    public void speak(){
        if(mouse==null){
            mouse=new Mouse();
        }
        System.out.println("i have mouse , i can speak");
    }
}
