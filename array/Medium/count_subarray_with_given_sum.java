package array.Medium;

import java.util.HashMap;

/*
problem solution:we have to count the number of times the sub array equlas to k
Solution:optimal solution we can use hashmap for storing the element and count their occurence and use two variables prefix and count
Prefix used to sum the array if the array i like [1,2,3,4,5,6] and the k=6;
lets take prefix=0 and put in hashmap
now prefix 1; and do (prefix-k==k)
1-6=5 5!=6 so no and put in hashmap (5,1)
prefix=3;2-3 -1!=6 so hashmap(3,1)
prefix=6;6-6=0 now 0 in hashmap that means [1,2,3]==6 increase count=1;
prefix=10;10-6=4 4 not in hash so  hash (10,1)
prefix=15;15-6=9 not in hash so (15,1)
prefix=21-6=15 15 in hash so increase count
 */
public class count_subarray_with_given_sum {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6};
        int k=6;
        HashMap<Integer,Integer> map=new HashMap<>();
        int prefix=0; //to sum the elements
        int count=0;
        map.put(prefix,1);
        for (int num:arr){
            prefix+=num;

            int a=prefix-k;

            if(map.containsKey(a)){
                count+=map.get(a);
            }
            map.put(prefix,map.getOrDefault(prefix,0)+1);


        }
//        for(Integer Key:map.keySet()){
//            System.out.println(Key+" ,"+map.get(Key));
//        }
        System.out.print(count);
    }
}
