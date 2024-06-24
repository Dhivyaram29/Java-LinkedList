import java.util.LinkedList;
public class Removefirst {
    public static void main(String[]args){
        LinkedList<String> dept=new LinkedList<>();
        dept.add("ECE");
        dept.add("CSE");
        dept.add("EEE");
        dept.add("AIDS");
        System.out.println("Before elements of list: "+dept);
        dept.removeFirst();
       System.out.println("The final list is: "+ dept);
      }
    }

    /*OUTPUT
     *   Before elements of list
     *   [ECE,CSE,EEE,AIDS]
     *   The final list is
     *   [CSE,EEE,AIDS]
     */