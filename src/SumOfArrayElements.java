public class SumOfArrayElements {
    public static void main(String[] args)
    {
        int[] ara= {3,5,8,13,21,11};
        int result = 0;
        for(int i=0; i<ara.length;i++)
        {
            result = result+ara[i];
        }
        System.out.println(result);
    }
}
