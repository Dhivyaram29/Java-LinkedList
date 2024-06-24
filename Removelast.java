import java.util.LinkedList;
public class Removelast {
    public static void main(String[]args){
        LinkedList<String> days=new LinkedList<>();
        days.add("Sunday");
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        System.out.println("Before elements of list: "+days);
        days.removeLast();
       System.out.println("The final list is: "+ days);
      }
    }

    /*OUTPUT
     *  Before elements of list:
     *  [Sunday,Monday,Tuesday,Wednesday]
     *  The final list is:
     *  [Sunday,Monday,Tuesday]
     */

