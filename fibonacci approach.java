import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        int a=1,b=1,result=0;
        if(N==1){
            result=1;
        }
        else{
        for(int i=2;i<=N;i++){
            result=a+b;
            a=b;
            b=result;
        }
        }
        System.out.println(b);
    }
}
