import java.util.LinkedList;
public class Getfirst {
    public static void main(String[]args){
        LinkedList<String> nw =new LinkedList<>();
        nw.add("Jio");
        nw.add("BSNL");
        nw.add("Airtel");
        nw.add("Aircel");
        System.out.println(nw);
        System.out.println("The first element is: "+ nw.getFirst());
        
    }
    
}
