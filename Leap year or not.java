import java.util.*;
public class Java{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       if(n%4==0){
           System.out.println(n +" It is a Leap year");
       }
       else{
           System.out.println(n+ " It is not a Leapyear");
       }
    }
}
