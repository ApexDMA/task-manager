
import java.util.*;

public class IteratorSimulation {

    static ArrayList<String> al;
    static ListIterator li;
    static int pos = 0;// keeps track of iterator; not actually required

    public static void main(String[] args) {
        al = new ArrayList();
        al.add("a");
        al.add("b");
        al.add("c");
        //get an iterator from the list
        li = al.listIterator();
        showList();

        //move
        System.out.println("1 - Moving next over " + li.next());
        pos++;
        showList();

        //move
        System.out.println("2 - Moving next over " + li.next());
        pos++;
        showList();

        //remove
        System.out.println("3 - Remove last thing travelled over");
        li.remove();
        pos--;
        showList();
        
        //add 'b'
        System.out.println("4 - Inserting to the LEFT of the iterator");
        li.add("b");
        pos++;
        showList();
        
        //move
        System.out.println("5 - Moving next over " + li.next());
        pos++;
        showList();
        
        //previous
        System.out.println("6 - Moving previous over " + li.previous());
        pos--;
        showList();
        
        //remove
        System.out.println("7 - Remove last thing travelled over");
        li.remove();
        showList();
        
        //previous
        System.out.println("8 - Moving previous over " + li.previous());
        pos--;
        showList();
        
        //Set e
        System.out.println("9 - Replacing the last thing seen with e");
        li.set("e");
        showList();
        
        //add b and c
        System.out.println("10 & 11 - Inserting to the LEFT of the iterator");
        li.add("b");
        pos++;
        li.add("c");
        pos++;
        showList();
        
        //remove 
        System.out.println("12 - Trying to remove...");
        try{
            li.remove();
        }catch(Exception e){
            System.out.println(e);
        }
        showList();
        
        //move
        System.out.println("13 - Moving next over " + li.next());
        pos++;
        showList();
        
        //move
        System.out.println("14 - Trying to move next past end of list");
        try{
            li.next();
        }catch(Exception e){
            System.out.println(e);
        }
        showList();
        
        //Bonus move - Rewind all the way to the start
        System.out.println("15 - Moving back to start of list");
        while(li.hasPrevious()){
            System.out.print(li.previous());
            pos--;
        }
        showList();
        
        //Bonus move 2 - remove last thing travelled over
        li.remove();
        showList();
    }

    public static void showList() {
        for (int i = 0; i < al.size(); i++) {
            if (i == pos) {
                System.out.print("*");
            }
            System.out.print(al.get(i));
        }
        if (pos == al.size()) {
            System.out.print("*");
        }
        System.out.println("");
    }
}
