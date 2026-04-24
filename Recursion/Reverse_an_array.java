import java.lang.reflect.Array;
import java.util.Arrays;

public class Reverse_an_array {
    public static void main(String[] args) {
          int[] arr={1,2,3,4,5};
          int start=0;
          int end=arr.length-1;
          Reverse_an_array obj=new Reverse_an_array();
          obj.reverse(arr,start,end);
          System.out.print(Arrays.toString(arr));
    }
    public void reverse(int[] arr,int start,int end){
        if(start>=end){
            return;
        }

        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;

        reverse(arr,start+1,end-1);

    }
}
