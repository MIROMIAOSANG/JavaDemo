public class LinkList<T> {
    private Node first;
    private int size;

    private class Node{
        private T element;
        private Node next;
    }

    public void push(T data){
        Node oldFirst=first;
        first=new Node();
        first.element=data;
        first.next=oldFirst;
        size++;
    }

    public T pop(){
        T temp=first.element;
        first=first.next;
        size--;
        return temp;
    }

    public int getSize(){
        return size;
    }

    public void print(){
        Node t=first;
        while(t!=null){
            System.out.println(t.element);
            t=t.next;
        }
    }

    public static void main(String[] args) {
        LinkList<String> linkList=new LinkList<>();
        linkList.push("lee");
        linkList.push("asbsadf");
        linkList.print();
    }
}
