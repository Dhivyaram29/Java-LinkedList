import java.util.LinkedList;
public class Size {
    public static void main(String[]args){
        LinkedList<String> sec=new LinkedList<>();
        sec.add("A");
        sec.add("B");
        sec.add("C");
        sec.add("D");
        System.out.println("Before elements of list: "+sec);
        sec.removeFirst();
       System.out.println("The final list is: "+ sec);
       System.out.println("The size of the final list is:"+sec.size());
      }
    }

    /*OUTPUT
     *  Before elements of list: [A,B,C,D]
     *  The Final list is: [B,C,D]
     *  The size of the final list is:3 
     *  
     */