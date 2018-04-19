/**
 * @author johnny
 * 多态Demo
 */
public class PolymorphismDemo {
    public static void doSomething(Person person){
        person.talk();
    }

    public static void main(String[] args) {
        Person person=new Person();
        Fans dk=new Fans();
        Spiderman peter=new Spiderman();
        PolymorphismDemo.doSomething(dk);
        PolymorphismDemo.doSomething(peter);
        PolymorphismDemo.doSomething(person);
    }
}
class Person{
    public void talk(){
        System.out.println("nm");
    }
}

class Fans extends Person{
    @Override
    public void talk() {
        System.out.println("嘤嘤嘤");
    }
}

class Spiderman extends Person{
    @Override
    public void talk() {
        System.out.println("jiujiujiu");
    }
}
