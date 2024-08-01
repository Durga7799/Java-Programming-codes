import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.print("ENter the String :");
        String name=sc.nextLine();
       StringBuilder input=new StringBuilder();
       input.append(name);
       input.reverse();
       System.out.print("The Reverse String is : "+ input);
        
    }
}
