class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Good One -> Sort the arraay compare only the first and the last String
        // TC -> O(NlogN * M), SC -> O(M)
        // Arrays.sort(strs);
        // int n = strs.length - 1;
        // int x = 0;
        // while(x < strs[0].length() && (strs[0].charAt(x) == strs[n].charAt(x))) {
        //     x++;
        // }
        // return strs[0].substring(0,x);

        // Optimal -> go to each string and compare each character
        // TC -> O(N*M), SC -> O(M) => M is the shortest common prefix
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