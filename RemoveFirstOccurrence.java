import java.util.LinkedList;
public class RemoveFirstOccurrence {
    public static void main(String[]args){
        LinkedList<String> month=new LinkedList<>();
        month.add("March");
        month.add("April");
        month.add("May");
        month.add("April");
        System.out.println("Before elements of list: "+month);
        month.removeFirstOccurrence("April");
       System.out.println("The final list is: "+ month);
      }
    }

    /*OUTPUT
     *  Before elements of list: [March,April,May,April]
     *  The final list is: [March,May,April]
     */