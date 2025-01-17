class Solution {
    public static void fun(int op,int cl,String s,int n,List<String> res)
    {
        if(op==cl && op+cl==n*2)
        {
            res.add(s);
            return;
        }
        if(op<n)
        {
            fun(op+1,cl,s+"(",n,res);
        }
        if(cl<op)
        {
            fun(op,cl+1,s+")",n,res);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        fun(0,0,"",n,res);
        return res;
    }
}