
class Solution
{
    //Function to check if a string is Pangram or not.
    public static boolean checkPangram  (String str) {
        // your code here
        boolean ans[]=new boolean [26];
        int index=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if( 'A'<=ch && ch<='Z')
            {
                index=ch-'A';
            }
           else if('a'<=ch && ch<='z')
            {
                index=ch-'a';
            }
            else
            {
                continue;
            }
            ans[index]=true;
        }
        for(int i=0;i<26;i++)
        {
            if(ans[i]!=true)
            {
                return false;
            }
        }
        return true;
    }
}
