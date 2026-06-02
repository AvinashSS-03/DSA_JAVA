package array.Hard;
import java.util.*;
/*
Problem statement:to find three elements that added gives 0 only unique combinations are allowed no duplicates
Solution:For three elements we keep i,j and k and iterate them through the array i kept in the first element j in the middle and k in the last
find the combinations and add them in the list
 */
public class three_sum {
    public static void main(String[] args) {
        int[]nums={-1,0,1,2,-1,-4};
        Arrays.sort(nums);
        List<List<Integer>>result=new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(i!=0 && nums[i]==nums[i-1]){ //the first element cannot be zero duplicate so i!=0 and checking the duplicates
                continue;
            }
            int j=i+1;//next element of i
            int k=nums.length-1;//last element
            while(j<k){//if it is crossed there is no sorted array so break
                int sum=nums[i]+nums[j]+nums[k];

                if(sum>0){
                    k--;
                }
                else if (sum<0){
                    j++;
                }
                else{
                    result.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1]){  //same checking duplicates for j
                        j++;
                    }
                    while(j<k && nums[k]==nums[k+1]){ //same checking duplicates for k
                        k--;
                    }
                }


            }
        }
        System.out.print(result
        );
    }
}
