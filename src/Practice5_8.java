public class Practice5_8 {
    public Practice5_8() {
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
        Practice5_8 practice58 = new Practice5_8();
        practice58.talk();
    }
}
