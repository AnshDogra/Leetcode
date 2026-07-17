class Solution {
    public String countAndSay(int n) {
        if(n==1) return"1";
        String s=countAndSay(n-1)+"@";
        String a="";
        int i=0, j=0;
        while(j<s.length()){
            if(s.charAt(i)==s.charAt(j)) j++;
            else{
                int len=j-i;
                a+=len;
                a+=s.charAt(i);
                i=j;
            }
        }
        return a;
    }
}