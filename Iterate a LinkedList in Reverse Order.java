import java.util.LinkedList;
import java.util.Iterator;
public class insertelement{
public static void main(String args[]){
    LinkedList<Integer> LL=new LinkedList<>();
    LL.add(2);
    LL.add(3);
    LL.add(4);
    LL.add(5);
    System.out.println("Original LinkedList: " + LL);
    Iterator<Integer> itr=LL.descendingIterator();
    while(itr.hasNext()){
        System.out.print(itr.next() +" ");
    }
}
}
