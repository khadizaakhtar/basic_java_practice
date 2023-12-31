public class PalindromeCheck {
    public static void main(String[] args)
    {
        String name ="Madam";
        String reverseStr = "";
        for(int i=(name.length()-1);i>=0;--i)
        {
            reverseStr = reverseStr + name.charAt(i);
        }
        if(reverseStr.toUpperCase().equals(name.toUpperCase()))
        {
            System.out.println(reverseStr+" is palindrome");
        }else
        {
            System.out.println(reverseStr+" is not palindrome");
        }
    }
}
