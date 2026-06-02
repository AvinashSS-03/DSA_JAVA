package array.Hard;
import java.util.*;
/*
Problem statement:The problem ststemet is to find the majority element that is repeated more tan 3 times the legth pf the array
Solution:here we can use Hashmap to get the freqquency of the elements and take theri key value and chek whether the number is repeqated more that thrice of the length
if yes return the element
Approach2:While we use Hashmap the space complexity is bigger like we adding all the elements to check the frequency that is why we have added
another optimal Boyer-Moore Voting Algorithm
the first pass will choose the candidate and the second element will choose the element >n/3
 */
public class majority_element_2 {
    public static void main(String[] args) {
        int[] nums={3,2,3};
        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer> lst=new ArrayList<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1); //counting frequency
        }
        System.out.println(nums.length);
        System.out.println(nums.length/3);
        for(Integer num:map.keySet()){
            int c=map.get(num);
            if(c>(nums.length/3)){ //checking n/3
                lst.add(num);
            }
            System.out.println(num+ " " + map.get(num));
        }
        System.out.println("The majority element is "+lst);
        majority_element_2 obj=new majority_element_2();
        obj.optimal_solution(nums);
    }
    void optimal_solution(int[] nums) {
        int count1 = 0;
        int count2 = 0;
        int el1 = Integer.MIN_VALUE;
        int el2 = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) { //the first pass to check the element
            if (count1 == 0 && nums[i] != el2) {
                count1 = 1;
                el1 = nums[i];
            } else if (count2 == 0 && nums[i] != el1) {
                count2 = 1;
                el2 = nums[i];
            } else if (nums[i] == el1) {
                count1++;
            } else if (nums[i] == el2) {
                count2++;
            } else {
                count1--; //we need only majority so remove low occurence
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        List<Integer> lst = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == el1) {
                count1++;
            }
            if (el2 == nums[i]) {
                count2++;
            }
        }
        int l = (int) (nums.length / 3);
        if (count1 > l) {
            lst.add(el1);
        }
        if (count2 > l) {
            lst.add(el2);
        }

        System.out.print("optimal solution output: "+lst);
    }
}
