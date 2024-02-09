import java.util.*;
public class Array {
    public static void main(String[] args) {

        int num=5;
        int[] nums;
        nums=new int[3];
        System.out.println(nums[0]);
        nums[0]=1;
        nums[1]=2;
        nums[2]=3;
        for(int i=0;i<nums.length;i++)
        {
            System.out.println(nums[i]);

        }
        int[] value ={0, 1, 2};
        for (int i = 0; i < value.length; i++)
            System.out.println(value[i]);
    }
}