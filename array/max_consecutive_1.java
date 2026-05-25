package array;

public class max_consecutive_1 {
    public static void main(String[] args) {
        int[] nums={1,1,0,0,1,1,1};
        int count=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }
            else{
                max=Math.max(count,max);
                count=0;
            }
        }
        System.out.print(Math.max(count,max));
    }
}
