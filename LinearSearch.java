import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,56,7,34};
        int target=56;
        int ans=LinearSearch(arr,target);
        System.out.println(ans);
    }
    static int LinearSearch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }return -1;
    }
}
