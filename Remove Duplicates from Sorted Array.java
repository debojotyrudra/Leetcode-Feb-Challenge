import java.util.*;
class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        for (int n:nums)
        {
            if(i<2 || n>nums[i-2])
                nums[i++]=n;
        }
        return i;
    }
  public static void main(String args[])
  {
       Scanner in = new Scanner(System.in);
       int n,i,k;
       n=in.nextInt();
       int arr[] = new int[n];
       for(i=0;i<n;i++)
       {
            arr[i]=in.nextInt();
       }
       Solution ob = new Solution();
       k=ob.removeDuplicates(arr);
       System.out.println(k);
  }
}
