//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        int[] ara = {1,2,30,4,5};
        System.out.println(getmax(ara));
    }

    public static int getmax(int[] ara)
    {
        int max = ara[0];
        for(int i=1; i<ara.length; i++)
        {
            if (ara[i] > max)
            {
                max = ara[i];
            }
        }
        return max;
    }
}