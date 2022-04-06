
class Solution {
    boolean areKAnagrams(String s1, String s2, int k) {
        // code here
        if(s1.length()!=s2.length())
        {
            return false;
        }
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s1.length();i++)
        {
            char ch=s1.charAt(i);
            if(hm.containsKey(ch))
            {
                int of=hm.get(ch);
                hm.put(ch,of+1);
            }
            else
            {
                hm.put(ch,1);
            }
        }
        int count=0;
        for(int i=0;i<s2.length();i++)
        {
            char ch=s2.charAt(i);
            if(!hm.containsKey(ch))
            {
                count++;
            }
            else
            {
                hm.put(ch,hm.get(ch)-1);
                if(hm.get(ch)==0)
                {
                    hm.remove(ch);
                }
            }
        }
        if(count<=k)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
