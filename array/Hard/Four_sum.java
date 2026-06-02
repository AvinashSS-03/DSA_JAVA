package array.Hard;
import java.util.*;
/*
Problem statement:Same like three sum but here four elements should be equal to the target
Solution:First and second element will be inside length-3 and legnth-2 and check duplicates and keep left and right right is lst element and left is j+1
check the element reaches the target and return
 */
public class Four_sum {
    public static void main(String[] args) {
        int[]nums={1,0,-1,0,-2,2};
        int target=0;
        Arrays.sort(nums);
        List<List<Integer>> result=new ArrayList<>();
        for(int i=0;i<nums.length-3;i++){
            if(i!=0 && nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1;j<nums.length-2;j++){
                if(j>i+1 && nums[j]==nums[j-1]){
                    continue;
                }
                int left=j+1;
                int right=nums.length-1;
                while(left<right){
                    long sum=(long)nums[i]+nums[j]+nums[left]+nums[right];
                    if(sum==target){
                        result.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        left++;
                        right--;

                        while(left<right && nums[left]==nums[left-1]){
                            left++;
                        }
                        while(left<right && nums[right]==nums[right+1]){
                            right--;
                        }
                    }
                    else if(sum>target){
                        right--;
                    }
                    else{
                        left++;
                    }

                }

            }
        }
        System.out.print(result);
    }
}
