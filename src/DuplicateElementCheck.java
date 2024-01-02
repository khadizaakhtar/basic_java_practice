public class DuplicateElementCheck {
    public static void main(String[] args)
    {
        int[] arr =  {2,4,8,18,7,8,9,10,4};
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j])
                {
                    System.out.println(arr[j]);
                }
            }
        }
    }

}
