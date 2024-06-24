import java.util.LinkedList;
public class Clear {
    public static void main(String[]args){
        LinkedList<Integer> odd=new LinkedList<>();
        odd.add(3);
        odd.add(7);
        odd.add(11);
        odd.add(17);
        System.out.println("Before elements of list: "+odd);
        odd.clear();
       System.out.println("The final list is: "+ odd);
      }
    }

    /*OUTPUT
     *  Before elements of list: [3,7,11,23]
     *  The final list is: []
     */
