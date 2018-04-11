public abstract class Animal {
    protected int legs;

    protected Animal(int a){
        legs=a;
    }

    public abstract void eat();

    public void walk(){
        System.out.println(legs);
    }
}
