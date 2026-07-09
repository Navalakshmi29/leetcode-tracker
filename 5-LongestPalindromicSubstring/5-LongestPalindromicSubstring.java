// Last updated: 08/07/2026, 21:54:16
class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        int start=0;
        int maxLen=0;
        boolean [][] dp=new boolean [n][n];

        for(int i=0;i<n;i++){   // single element palindrome
            dp[i][i]=true;
            if(maxLen==0){
                maxLen=1;
                start=i;
            }
        }

        for(int i=0;i<n-1;i++){ //double element palindrome

            if(s.charAt(i) == s.charAt(i+1)){
                dp[i][i+1]=true;
                if(maxLen==1){
                    maxLen=2;
                    start=i;
                }
            }
        }

        // Size 3 or more elements

        for(int len=3;len<=n;len++){
            for(int i=0;i<=n-len;i++){
                int j=i+len-1;

                if((s.charAt(i)==s.charAt(j)) && dp[i+1][j-1]){
                    dp[i][j]=true;
                    if(j-i+1>maxLen){
                        maxLen=j-i+1;
                        start=i;
                    }
                }
            }
        }
        return s.substring(start,start+maxLen);
    }
}