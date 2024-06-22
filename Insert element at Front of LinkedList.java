import java.util.LinkedList;
public class insertelement{
public static void main(String args[]){
    LinkedList<Integer> LL=new LinkedList<>();
    LL.add(2);
    LL.add(3);
    LL.add(4);
    LL.add(5);
    System.out.println("Original LinkedList: " + LL);
    LL.add(0,1);
    System.out.println("Modified Specified Element at Front of LinkedList:" + LL);
}
}
