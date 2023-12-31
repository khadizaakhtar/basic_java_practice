public class ReverseAnArray {
    public static void main(String[] args)
    {
      int[] ara =  {2,4,18,7,8,9,10};
      int[] ara2 = {};
      int n = ara.length-1;
      int j=0;
      for(int i=0;i<ara.length;i++)
      {
          System.out.println(ara[n-i]);
      }
    }
}
