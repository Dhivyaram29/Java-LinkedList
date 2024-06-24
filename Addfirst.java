import java.util.LinkedList;
public class Addfirst{
    public static void main(String[]args){
        LinkedList<String> name=new LinkedList<>();
        name.add("Cyber security");
        name.add("Cloud computing");
        name.add("Full stack");
        name.add("App development");
        System.out.println("Before adding element");
        System.out.println(name);
        name.addFirst("Artificial intelligence");
        System.out.println("After adding element");
        System.out.println(name);

    }
}
/*OUTPUT:
    Before adding element
      [Cyber security,Cloud computing,Full stack,App development]
    After adding element
      [Artificial intelligence,Cyber security,Cloud computing,Full stack,App development]/* */
