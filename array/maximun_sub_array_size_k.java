package array;

public class maximun_sub_array_size_k {
    public static void main(String[] args) {
        int[] arr={2,1,5,3,2};
        int k=3;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length-k;i++){
            int current_sum=0;

            for(int e=i;e<i+k;e++){
                current_sum+=arr[e];
            }
            max=Math.max(current_sum,max);
        }
        System.out.print(max);
    }
}
