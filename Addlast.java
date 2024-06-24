import java.util.LinkedList;
public class Addlast {
    public static void main(String[]args){
        LinkedList<String> color=new LinkedList<>();
        color.add("Green");
        color.add("Red");
        color.add("Blue");
        System.out.println("Before adding last element");
        System.out.println(color);
        System.out.println("After adding last element");
        color.addLast("Grey");
        System.out.println(color);
    }
}


/*OUTPUT:
 *  Before adding last element
 *      [Green,Red,Blue]
 *  After adding last element
 *      [Green,Red,Blue,Grey]  
 */