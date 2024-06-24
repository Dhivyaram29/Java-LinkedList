import java.util.LinkedList;
public class linkedlist{
    public static void main(String[] args) {
        LinkedList<Integer> num = new LinkedList<>();
        num.add(10);
        num.add(30);
        num.add(40);
        num.add(50);
        System.out.println(num);
        System.out.println("After adding elements");
        num.add(1,20);
        //num.add(60);
        num.add(5,60);
        System.out.println(num);
        
    }
}