package array.Hard;
import java.util.*;
/*
Problem statement:The problem ststemet is to find the majority element that is repeated more tan 3 times the legth pf the array
Solution:here we can use Hashmap to get the freqquency of the elements and take theri key value and chek whether the number is repeqated more that thrice of the length
if yes return the element
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
        System.out.print("The majority element is "+lst);
    }
}
