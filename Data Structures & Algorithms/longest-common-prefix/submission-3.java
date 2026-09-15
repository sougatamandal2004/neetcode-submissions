class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Brute Force -> go to each string and compare each character
        // TC -> O(N^2), SC -> O(1)
        String s = strs[0];
        for(int i=1;i<strs.length;i++){
            int p = 0;
            while(p < s.length() && p < strs[i].length() && (s.charAt(p) == strs[i].charAt(p))) {
                p++;
            }
            s = s.substring(0, p);
            if(s.isEmpty()) return "";
        }
        return s;
    }
}