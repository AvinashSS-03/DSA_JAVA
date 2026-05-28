package array;

public class Maximum_Subarray_Sum_in_an_Array {
    public static void main(String[] args) {
        int[] arr={2, 3, 5, -2, 7, -4};
        int Max=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                Max=Math.max(Max,sum);
            }

        }
        System.out.print(Max);
    }
}
