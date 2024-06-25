import java.util.LinkedList;
public class For{
    public static void main(String[]args){
        LinkedList<String> month=new LinkedList<>();
        month.add("March");
        month.add("April");
        month.add("May");
        month.add("June");
        month.add("December");
        System.out.println(month);
        for(String A:month){
            System.out.println(A);
        }
      }
    }

    