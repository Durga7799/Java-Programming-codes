import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.print("ENter the Number :");
        int name=sc.nextInt();
        int temp=0;
        for(int i=1;i<=name;i++){
            temp=temp+(i*i);
        }
       System.out.print("The Reverse String is : "+ temp);
        
    }
}
