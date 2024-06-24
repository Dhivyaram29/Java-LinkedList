import java.util.LinkedList;
public class Getlast{
    public static void main(String[]args){
        LinkedList<String> nw =new LinkedList<>();
        nw.add("Jio");
        nw.add("BSNL");
        nw.add("Airtel");
        nw.add("Aircel");
        System.out.println(nw);
        System.out.println("The last element is: "+ nw.getLast());
      }
        
    }

/*OUTPUT
 *  [Jio,BSNL,Airtel,Aircel]
 *  The last element is: Aircel
 */