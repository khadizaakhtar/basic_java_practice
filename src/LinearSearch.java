public class LinearSearch {
    public static void main(String[] args)
    {
        int[] ara =  {10,20,30,50,70,90};
        int key = 50;
        System.out.println(key+" is found at index: "+linearSearch(ara, key));
    }

    public static int  linearSearch(int[] ara, int key)
    {
        for(int i=0;i<ara.length;i++){
            if(ara[i] == key){
                return i;
            }
        }
        return -1;
    }
}
