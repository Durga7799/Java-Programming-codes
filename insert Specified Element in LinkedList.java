import java.util.LinkedList;
public class InsertLinkedList{
    public static void main(String args[]){
        LinkedList<String> LL=new LinkedList<>();
        LL.add("Apple");
        LL.add("Banana");
        LL.add("carrot");
        LL.add("Dog");
        System.out.println("original LL: " + LL);
        LL.add(1,"Mango");
        System.out.println("Modified Specified Element: " +LL);
    }
}
