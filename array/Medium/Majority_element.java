package array;

import java.util.HashMap;

public class Majority_element {
    public static void main(String[] args) {
       int[] nums={3,3,1};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(int c:map.keySet()){
            if(map.get(c)>(nums.length/2)){
                System.out.print(c);
            }
        }
    }
}
