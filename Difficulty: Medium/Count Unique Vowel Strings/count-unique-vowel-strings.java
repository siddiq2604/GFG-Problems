class Solution {
    public int vowelCount(String s) {
        // code here
        int a=0;
        HashMap<Character,Integer>hm=new HashMap<>();
        for(char ch:s.toCharArray())
        {
            if(ch=='a' || ch=='e' || ch=='i'||ch=='o'||ch=='u')
            {
                hm.put(ch,hm.getOrDefault(ch,0)+1);
            }
        }
        if(hm.size()==0)
        return a;
        a=fact(hm.size());
        for(char ch:hm.keySet())
        {
            a=a*hm.get(ch);
        }
        return a;
    }
    int fact(int n)
    {
        if(n==0 || n==1)
        return 1;
        else
        return n*fact(n-1);
    }
}