public class LargestElementOfArray {
    public static void main(String[] args)
    {
        int[] ara= {3,5,8,13,21,65,11,6};
        int maxnum = ara[0];
        for(int i=0; i<ara.length;i++)
        {
            if(ara[i]>maxnum)
            {
                maxnum = ara[i];
            }
        }
        System.out.println(maxnum);
    }
}
