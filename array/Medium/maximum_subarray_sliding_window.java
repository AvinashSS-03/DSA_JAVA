package array;

public class maximum_subarray_sliding_window {
    public static void main(String[] args) {
        int[] arr={2,1,5,3,2};
        int k=3;
        int windowsum=0;
        for (int i=0;i<k;i++){
            windowsum+=arr[i]; //first three sum
        }
        int startindex=0;
       int maxq=windowsum; //store in max
        for (int i=k;i<arr.length;i++){
            windowsum+=arr[i]-arr[i-k]; //we are adding the difference between old and new to the window
            maxq=Math.max(windowsum,maxq); //finding the maximum
            startindex=i-k+1;
        }
        System.out.println("Total sum" + maxq);
        for (int i=startindex;i<startindex+k;i++){
            System.out.print(arr[i]+ " ,");
        }
    }
}
