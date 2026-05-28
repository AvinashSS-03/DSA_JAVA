package array;
/*Problem statement: we have to return the subbaray which sums equals to k
Solution:Simple we can use the brute force approach and check the sum and increment the count whenever the subarray equals K.
 */
public class Subarray_Sum_Equals_K {
    public static void main(String[] args) {
        int[] nums={1,1,1};
        int k=2;
        int c=0;
        for(int i=0;i<nums.length;i++){
            int sum=0;

            for(int j=i;j<nums.length;j++){ //normal subaray format

                sum+=nums[j]; //first adding elements
                if(sum==k){
                    c++;; //then checking
                }
            }    }
        System.out.print(c);

}
}
