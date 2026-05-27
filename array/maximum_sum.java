package array;

public class maximum_sum {
    public static void main(String[] args) {
        int[] arr={1,3,-3,4,5};
        int max=arr[0];
        int curren=arr[0];
        for(int i=1;i<arr.length;i++){
              curren=Math.max(arr[i],arr[i]+curren);
              max= Math.max(curren,max);
        }
        System.out.print(max);
    }
}
