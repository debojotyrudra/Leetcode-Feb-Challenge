class Solution {
    public int findMaxLength(int[] nums) {
        int i,j;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int max=0,c=0;
        for(i=0;i<nums.length;i++)
        {
            c=c+(nums[i]==1?1:-1);
            if(map.containsKey(c))
                max=Math.max(max,i-map.get(c));
            else
                map.put(c,i);
        }
        return max;
    }
   public static void main(String args[])
   {
       Scanner in = new Scanner(System.in);
       int n;
       System.out.println("Enter the size of Array\n");
       n=in.nextInt();
       int arr[]=new int[n];
       for(i=0;i<n;i++)
         arr[i]=in.nextInt();
       Solution ob = new Solution();
       System.out.println(findMaxLength(arr));
   }
}
